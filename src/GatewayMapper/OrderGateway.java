package GatewayMapper;

import DBConnection.ConnectionTools;
import Resources.Order;
import Resources.Product;
import Resources.Truck;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    currentOrder = new Order(0,0,0,0,0,0);
}
public boolean addItemToList(Product prod){
    return currentOrder.addItemToList(prod);
}
public void removeFromOrder(Product prod) {
    currentOrder.removeFromOrder(prod);
}
//public boolean addOrderToDB(Connection con){
//    boolean success = false;
//        Connection con = ConnectionTools.getInstance().getCurrentConnection();
//        String SQLString1 = "INSERT into OrderTable "
//                + "VALUES (?,?,?,?,?,?)";
//        PreparedStatement statement = null;
//        try {
//            statement = con.prepareStatement(SQLString1);
//            statement.setInt(1, ID);
//            statement.setString(2, name);
//            statement.setInt(3, volume);
//            statement.setInt(4, quantity);
//            statement.setString(5, description);
//            statement.setInt(6, price);
//            statement.executeUpdate();
//            success = true;
//        } catch (Exception e) {
//            System.out.println("Insertion error!");
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                statement.close();
//            } catch (SQLException e) {
//                System.out.println("Statement close error!");
//                System.out.println(e.getMessage());
//            }
//        }
//        return success;
//}
}
