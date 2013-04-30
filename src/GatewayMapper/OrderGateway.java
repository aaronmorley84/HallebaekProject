package GatewayMapper;

import DBConnection.ConnectionTools;
import Domain.OrderList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Adrian & Kris
 */
public class OrderGateway {
    OrderList orderlist;
        
    public boolean buildOrderList(OrderList orderList) {
        this.orderlist = orderList;
        orderList.clearOrderList();
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT * "
                + "FROM customer_order ";
        
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                orderlist.addToOrderList(
                        rs.getInt(1),
                        rs.getInt(2),
                        ""+rs.getDate(3),
                        ""+rs.getDate(4),
                        rs.getInt(5));            
            }
            success = true;
        } catch (Exception e) {
            System.out.println("Error in getting list of orders.");
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
    }//end of build order
    
    public boolean addOrder(int orderid, OrderList orderlist) {
//        this.orderlist = orderlist;
        boolean success = false;
//        System.out.println(orderlist.getProductList(0).getProductID());
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into order_product "
                + "VALUES (?,?,?)";
        PreparedStatement statement = null;
        for (int i = 0; i < orderlist.getCurrOrder().orderProductList.size(); i++) {
            System.out.println("Product at index "+i+" = "+orderlist.getCurrOrder().orderProductList.get(i).getProductID());
            try {
                statement = con.prepareStatement(SQLString1);
                statement.setInt(1, orderid);
                statement.setInt(2, orderlist.getCurrOrder().orderProductList.get(i).getProductID());
                statement.setInt(3, orderlist.getCurrOrder().orderProductList.get(i).getQuantity());
                statement.executeUpdate();
                success = true;                
            } catch (Exception e) {
                System.out.println("products Insertion error!");
                System.out.println(e.getMessage());

            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Statement close error!");
                    System.out.println(e.getMessage());
                }
            }
        }
        return success;
    }//end of add order
    
    public boolean addCustomerOrder(int customerID, String startDate, String finishDate) {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into Customer_Order "
                + "VALUES (orderseq.nextval,?,?,?,?)";

        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, customerID);
            statement.setDate(2, Date.valueOf(startDate));
            statement.setDate(3, Date.valueOf(finishDate));
            statement.setInt(4, 0);
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

        return success;
    }//end of add customer order
    public boolean editCustomerOrder(int customerID, String startDate, String finishDate, int balance){
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "Update customer_order "
                + "SET balance = ? "
                + "WHERE startdate = ? and "
                + "finishdate = ? and "
                + "customerid = ? ";
        PreparedStatement statement = null;
        try{
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, balance);
            statement.setDate(2, Date.valueOf(startDate));
            statement.setDate(3, Date.valueOf(finishDate));
            statement.setInt(4, customerID);            
            
            statement.executeUpdate();
            success = true;
        }catch (Exception e){
            System.out.println("Error on CustomerOrder edit!");
            System.out.println(e.getMessage());
        }finally{
            try{
                statement.close();
            }catch(SQLException e){
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }
        return success;
    }

    /*
     * Fetches a unique identifier for each order.
     */
    
    
}// END
