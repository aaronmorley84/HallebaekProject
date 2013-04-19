/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;

import DBConnection.ConnectionTools;
import Domain.UserList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Andrew
 */
public class UserGateway {
    UserList userlist;
    
    /*Used to build a list of customers. */
    public boolean buildCustomerList(UserList userList) {
        this.userlist = userList;
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT * " 
                + "FROM Users ";


        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                userList.addToUserList(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3));
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
    
    public boolean addUser( String id, String pw, int pou){
        boolean success = false;
        int rowsInserted = 0;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT INTO user VALUES (?,?,?)"; 
        
        
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);            
            statement.setString(1, id);
            statement.setString(2, pw);
            statement.setInt(3, pou);
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
    
    public boolean saveEditedCustomer(String id, String pw, int pou){
         boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "UPDATE Users "
                            + "SET us = ?, "
                            + "pw = ?, "                            
                            
                            + "pou = ? "
                            + "WHERE us = ?";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setString(1, id);
            statement.setString(2,pw);
            statement.setInt(3, pou);
            statement.executeUpdate(); 
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
    
    public boolean deleteUser(String id){
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "DELETE from users "
                            + "WHERE us = ? ";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setString(1, id);
            statement.executeUpdate();
            success = true;
        }catch (Exception e) {
            System.out.println("Error in deleting!");
            System.out.println(e.getMessage());
        }
        return success;
    }

    
    
    
}
