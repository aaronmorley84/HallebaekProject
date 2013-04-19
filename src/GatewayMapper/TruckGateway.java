package GatewayMapper;

import DBConnection.ConnectionTools;
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
 * @author Kris
 */
public class TruckGateway {
    private ArrayList<Truck> trucks;
    private ArrayList<TruckOrder> truckOrders;
    
    
    public boolean getTrucks() {
        trucks.clear();
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT *"
                + "FROM trucks ";
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
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }
        return success;
    }//end of get trucks
    
    public boolean getTruckOrders(){
        truckOrders.clear();
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT *"
                + "FROM truck_order ";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
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
    }//end of get truck orders
    
    public boolean commitTruckOrder(int orderid, int truckid, String status, String date) {
        System.out.println(orderid);
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
    }//end of commit truck order
    
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
    
    public void currentTruckOrder() {
        currentTruckOrder = new TruckOrder(currentOrder.getOrderID(), 0, null, null);
    }
}
