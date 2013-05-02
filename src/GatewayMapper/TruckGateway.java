package GatewayMapper;

import DBConnection.ConnectionTools;
import Domain.TruckList;
import Resources.Truck;
import Resources.TruckOrder;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Kris
 */
public class TruckGateway {
    TruckList trucklist;
    
    public boolean buildTruckList(TruckList trucklist) {
        this.trucklist = trucklist;
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT * "
                + "FROM trucks ";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();
            System.out.println("Rs"+rs);
            while (rs.next()) {
                trucklist.addToTruckList(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3));
            }
            success = true;
        } catch (Exception e) {
            System.out.println("Retrieval error from trucks!");
            System.out.println(e.getMessage());
            success = false;
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }
        return success;
    }//end of build truck list
    
    public boolean buildTruckOrderList(TruckList trucklist){
        this.trucklist = trucklist;
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT * "
                + "FROM truck_order ";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                trucklist.addToTruckOrderList(rs.getInt(1), 
                        rs.getInt(2), 
                        rs.getString(3), 
                        ""+rs.getDate(4));
            }
            success = true;
        } catch (Exception e) {
            System.out.println("Retrieval error from truck_orders!");
            System.out.println(e.getMessage());
            success = false;
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }
        return success;
    }//end of get truck orders
    
    public boolean addTruckOrder(int orderid, int truckid, String status, String date) {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into truck_order "
                + "VALUES (?, ?, ?, ?) ";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, orderid);    
            statement.setInt(2, truckid);        
            statement.setString(3, status);
            statement.setDate(4, Date.valueOf(date));
            statement.executeUpdate();
            success = true;
        } catch (Exception e) {
            System.out.println("Problem with ordering trucks.");
            System.out.println(e.getMessage());
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }
        return success;
    }//end of add truck order
    
    public boolean addTruck(int truckid, String model, int capacity, String bookeddate){
        boolean success= false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into trucks "
                + "VALUES (?, ?, ?, ?) ";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, truckid);    
            statement.setString(2, model);        
            statement.setInt(3, capacity);
            statement.setDate(4, Date.valueOf(bookeddate));
            statement.executeUpdate();
            success = true;
        } catch (Exception e) {
            System.out.println("Problem with adding truck.");
            System.out.println(e.getMessage());
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }
        return success;
    }
    //Method used for locking Trucks
    public boolean lockTruck(int ID){
        boolean locked = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String sqlString = "SELECT * " 
                + "FROM trucks "
                + "WHERE truckID = ? "
                + "FOR UPDATE NOWAIT";
        PreparedStatement statement = null;
        try {
            con.setAutoCommit(false);
            statement = con.prepareStatement(sqlString);
            statement.setInt(1, ID);
            statement.execute();
            locked = true;
            System.out.println("Truck Locked");
        } catch (SQLException ex) {
            System.out.println("Error in lockTruck");
            System.out.println(ex.getMessage());
            }        
        return locked;
    }
}
