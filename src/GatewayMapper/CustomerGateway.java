/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;

import Resources.Customer;
import DBConnection.ConnectionTools;
import Resources.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Foxy, 05-04-31, v0.01
 */
public class CustomerGateway {

    ArrayList<Customer> listOfCustomers = new ArrayList<>();
    
    public Customer getlist(int i){
        return listOfCustomers.get(i);
    }

    public int getListSize(){
        return listOfCustomers.size();
    }
    /*Used to build a list of customers. */
    public boolean buildCustomerList() {
        listOfCustomers.clear();
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT * " 
                + "FROM customers ";


        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                listOfCustomers.add(new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)));
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
    
    public boolean addCustomer(int cusID, String name, String address, int phoneID, String email){
        Customer c = new Customer(cusID,name,address,phoneID,email);
        boolean success = false;
        int rowsInserted = 0;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT INTO customers VALUES (?,?,?,?,?)"; 
        
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            
                
            statement.setInt(1, c.getCustomerID());
            statement.setString(2, c.getName());
            statement.setString(3, c.getAdress());
            statement.setInt(4, c.getPhoneID());
            statement.setString(5, c.getEmail());
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
    
    public boolean saveEditedCustomer(int cusID,String cusName,String cusAddress,int phoneID,String cusEmail){
         boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "UPDATE customers "
                            + "SET name = ?, "
                            + "address = ?, "
                            + "phoneid = ?, "
                            + "email = ? "
                            + "WHERE customerID = ?";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setString(1, cusName);
            statement.setString(2,cusAddress);
            statement.setInt(3, phoneID);
            statement.setString(4, cusEmail);
            statement.setInt(5, cusID);
            statement.executeUpdate(); //stops here for some reason
            success = true;            
        }catch (Exception e){
            System.out.println("Insertion error!");
            System.out.println(e.getMessage());
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }
        return success;
    }

    public String printList() {
        String customerList = null;
        for (int i = 0; i < listOfCustomers.size(); i++) {
            System.out.println(listOfCustomers.get(i).toString());
            customerList = listOfCustomers.get(i).toString();
        }
        return customerList;
    }
}
