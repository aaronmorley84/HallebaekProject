package GatewayMapper;

import DBConnection.ConnectionTools;
import Resources.Order;
import Resources.Product;
import Resources.Truck;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Kris
 */
public class OrderGateway {
    
    ArrayList<Truck> trucks = new ArrayList();
    ArrayList<Order> orders = new ArrayList();
private Order currentOrder;

public OrderGateway(){
    
}
public void currentOrder(){
    int ID = getUniqueOrderID();
    currentOrder = new Order(0,0,0,0,0,ID);
}
public boolean addItemToList(Product prod){
    return currentOrder.addItemToList(prod);
}
public void removeFromOrder(Product prod) {
    currentOrder.removeFromOrder(prod);
}
public boolean addToCustomerOrderTable(int customerID, String startDate, String finishDate){
    boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into customer_order "
                + "VALUES (?,?,?,?)";
       
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, currentOrder.getOrderID());
            statement.setInt(2, customerID);
            statement.setDate(3, Date.valueOf(startDate));
            statement.setDate(4, Date.valueOf(finishDate));
            statement.executeUpdate();
            success = true;
        } catch (Exception e) {
            System.out.println("Insertion error!");
            System.out.println(e.getMessage());
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }
        addOrderToDB();
        return success;
}
public boolean addOrderToDB(){
    boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into OrderTable "
                + "VALUES (?,?,?)";
        PreparedStatement statement = null;
        for (int i = 0; i < currentOrder.getListInstance().size(); i++) {
        try {   
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, currentOrder.getOrderID());
            statement.setInt(2, currentOrder.getListInstance().get(i).getProductID());
            statement.setInt(3, currentOrder.getListInstance().get(i).getQuantity());
            statement.executeUpdate();
            success = true;
        } catch (Exception e) {
            System.out.println("Insertion error!");
            System.out.println(e.getMessage());

        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }}
        return success;
}
public int getUniqueOrderID(){
       int temp = 0;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT orderseq.nextval " +
"FROM dual";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
               ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                temp = rs.getInt(1);
            }
            
        } catch (Exception e) {
            System.out.println("Something wrong build" + e.getMessage());
           
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statment close error\n" + e.getMessage());
            }
        }
        
        return temp;
        
    }
}// END
