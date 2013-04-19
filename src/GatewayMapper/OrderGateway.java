package GatewayMapper;

import DBConnection.ConnectionTools;
import Resources.Order;
import Resources.Product;
import Resources.Truck;
import Resources.TruckOrder;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Adrian & Kris
 */
public class OrderGateway {

    private ArrayList<Truck> trucks;
    private ArrayList<TruckOrder> truckOrders;
    private ArrayList<Order> orders;
    
    public Order currentOrder;
    public TruckOrder currentTruckOrder;

    public OrderGateway() {
        trucks = new ArrayList();
        orders = new ArrayList();
        truckOrders = new ArrayList();
    }

    /*
     * Constructs an "empty" order with the unique order indentifier.
     */
    public void currentOrder() {
        int ID = getUniqueOrderID();
        currentOrder = new Order(0, 0, 0, 0, ID, 0);
    }
    /*
     * Constructs an "empty" truck order with same ID as current order.
     */

    public void currentTruckOrder() {
        currentTruckOrder = new TruckOrder(currentOrder.getOrderID(), 0, null, null);
    }

    /*
     * Methods for adding/removing products to/from the order.
     * Not using DB connection.
     */
    public boolean addItemToOrderList(Product prod) {
        return currentOrder.addItemToOrderList(prod);
    }

    public void removeFromOrderList(Product prod) {
        currentOrder.removeFromOrderList(prod);
    }

    /*
     * US 3.1
     * User can add item(s) to customer
     * order table from product table.
     */
    public boolean addToCustomerOrderTable(int customerID, String startDate, String finishDate) {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into Customer_Order "
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

        return success;
    }

    public boolean addOrderToDB() {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into order_product "
                + "VALUES (orderseq.currval,?,?)";
        PreparedStatement statement = null;
        for (int i = 0; i < currentOrder.getListInstance().size(); i++) {
            try {
                statement = con.prepareStatement(SQLString1);
                statement.setInt(1, currentOrder.getListInstance().get(i).getProductID());
                statement.setInt(2, currentOrder.getListInstance().get(i).getQuantity());
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
    }
    /*Pulls all existing orders from DB.*/

    public boolean getOrders() {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT * "
                + "FROM orders";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                orders.add(new Order(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),0));
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
    }
    /*Get list size of orders.*/

    public int getOrderListSize() {
        return orders.size();
    }

    /*
     * US 3.2
     * User can see number of trucks
     * needed for delivery from size of
     * products in customer order table,
     */
    public int getTruckListSize() {
        return trucks.size();
    }

    public int getTruckOrderListSize() {
        return truckOrders.size();
    }

    public Truck getTruck(int index) {
        if (index < trucks.size()){
            return trucks.get(index);
        }else {
            return null;
        }
    }

    public TruckOrder getTruckOrder(int index) {
        if (index < truckOrders.size()) {
            return truckOrders.get(index);
        } else {
            return null;
        }
    }

    public int getTrucksRequired(int totalVolume) {
        getTrucks();
        int amountOfTrucks = 0;
        int allTrucksCapacity = 0;
        for (int i = 0; i < trucks.size(); i++) {
            allTrucksCapacity = +trucks.get(i).getTruckCapacity();
        }
        try {
            if (totalVolume < allTrucksCapacity) {
                for (int i = 0; i < trucks.size(); i++) {
                    while (totalVolume > 0) {
                        totalVolume = -trucks.get(i).getTruckCapacity();
                        amountOfTrucks++;
                    }
                }
            } else {
                System.out.println("problem in 'getTrucksRequired(int)'");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong trucks required method.");
        }
        return amountOfTrucks;
    }

    /*Fills the trucks arraylist from the DB. */
    public boolean getTrucks() {
        trucks.clear();
        truckOrders.clear();
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT *"
                + "FROM trucks ";
        String SQLString2 = "SELECT *"
                + "FROM truck_order ";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Truck truck = new Truck();
                int truckID = rs.getInt(1);
                String model = rs.getString(2);
                int capacity = rs.getInt(3);
                truck.setTruckID(truckID);
                truck.setTruckName(model);
                truck.setTruckCapacity(capacity);
                truck.setBookDate("");
                trucks.add(truck);
            }
            success = true;
        } catch (Exception e) {
            System.out.println("Retrieval error from trucks!");
            System.out.println(e.getMessage());
            success = false;
        }
        try {
            statement = con.prepareStatement(SQLString2);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int orderID = rs.getInt(1);
                int truckID = rs.getInt(2);
                String status = rs.getString(3);
                String date = rs.getString(4);
                TruckOrder truckOrder = new TruckOrder(orderID, truckID, status, date);
                truckOrders.add(truckOrder);
                success = true;
            }
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
    }

    /*
     * US 3.4
     * User can book delivery truck(s)
     * for customer order (if available).
     * Using the trucks arraylist with DB connection. 
     */
    public void checkFreeTrucks(String date){
        for (Truck truck1 : trucks) {
            for (TruckOrder truckorder1 : truckOrders) {
                if(truckorder1.getTruckID() == truck1.getTruckID()){
                    truck1.setBookDate(truckorder1.getDate());
                }
            }
            
        }
        for (int i = 0; i < trucks.size(); i++) {
            System.out.println(trucks.get(i).getBookDate());
            if(trucks.get(i).getBookDate().contains(date)){
                trucks.remove(i);
            }
        }
    }
    
    public boolean commitTruckOrder() {
        int orderid = currentOrder.getOrderID();
        System.out.println(orderid);
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into truck_order "
                + "VALUES (?, ?, ?, ?) ";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, currentTruckOrder.getOrderID());    
            statement.setInt(2, currentTruckOrder.getTruckID());        
            statement.setString(3, currentTruckOrder.getStatus());
            statement.setDate(4, Date.valueOf(currentTruckOrder.getDate()));
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
    }
    /*
     * US 3.5
     * User can check if assemblers are
     * available for given date from cus-
     * tomer order table.
     */

    public boolean checkAssemblerAvailable(int startDate) {
        boolean available = false;

        return available;
    }
    /*
     * Fetches a unique identifier for each order.
     */

    public int getUniqueOrderID() {
        int temp = 0;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT orderseq.nextval "
                + "FROM dual";
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
    /*
     * US 9.1
     * User can see balance for each order
     */
    public int getOrderBalance(){
        return currentOrder.getBalance();
    }
    /*
     * US 9.2
     * User can deposit/withdraw
     * to/from balance for each order
     * and add information to an order
     * balance log
     */
    
}// END
