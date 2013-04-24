/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;

import DBConnection.ConnectionTools;
import Domain.CustomerList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Foxy, 05-04-31, v0.01
 */
public class CustomerGateway {
    CustomerList customerList;
    
    /*Used to build a list of customers. */
    public boolean buildCustomerList(CustomerList customerlist) {
        this.customerList = customerlist;
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT * " 
                + "FROM customers ";

        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                customerList.addToCustomerList(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5));
            }
            success = true;
        } catch (Exception e) {
            System.out.println("Something wrong build" + e.getMessage());
            success = false;
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statment close error\n" + e.getMessage());
            }
        }

        return success;
    }//end of buildCustomer
    //method for locking a customer
    public boolean lockCustomer(int ID){
        boolean locked = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String sqlString = "SELECT * " 
                + "FROM customers "
                + "WHERE customerID = ? "
                + "FOR UPDATE NOWAIT";
        
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(sqlString);
            statement.setInt(1, ID);
            statement.execute();
            locked = true;
            System.out.println("Customer Locked");
        } catch (SQLException ex) {
            System.out.println("Error in lockCustomer");
            System.out.println(ex.getMessage());
            }        
        return locked;
    }
    public boolean addCustomer( String name, String address, String email){
        boolean success = false;
        int rowsInserted = 0;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT INTO customers VALUES (customerseq.nextval,?,?,customerseq.currval,?)"; 
        
        
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);            
            statement.setString(1, name);
            statement.setString(2, address);
            statement.setString(3, email);
            rowsInserted += statement.executeUpdate();
            
            success = true;
            
            
        } catch (Exception e) {
            System.out.println("Something wrong build" + e.getMessage());
            success = false;
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statment close error\n" + e.getMessage());
            }
        }

        return success;
        
    }
    
    public boolean saveEditedCustomer(int cusID,String cusName,String cusAddress,String cusEmail) throws SQLException{
         boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString   = "Select * from customers for update nowait"; 
        String SQLString1 = "UPDATE customers "
                            + "SET name = ?, "
                            + "address = ?, "                        
                            + "email = ? "
                            + "WHERE customerID = ?";
        PreparedStatement statement = null;
        
        try {
            con.setAutoCommit(false);
            statement = con.prepareStatement(SQLString);          
            statement = con.prepareStatement(SQLString1);
            statement.setString(1, cusName);
            statement.setString(2,cusAddress);
            statement.setString(3, cusEmail);
            statement.setInt(4, cusID);
            statement.executeUpdate(); 
            
            success = true;            
        }catch (Exception e){
            System.out.println("Insertion error!");
            System.out.println(e.getMessage());
        
        }finally {
            try {
                con.commit();
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
                con.rollback();
            }
        }
        return success;
    }
    
    public boolean deleteCustomer(int cusID){
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "DELETE from customers "
                            + "WHERE customerID = ? ";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, cusID);
            statement.executeUpdate();
            success = true;
        }catch (Exception e) {
            System.out.println("Error in deleting!");
            System.out.println(e.getMessage());
        }
        return success;
    }

    
}
