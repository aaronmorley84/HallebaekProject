package GatewayMapper;

import DBConnection.ConnectionTools;
import Resources.Truck;
import Resources.TruckOrder;
import java.sql.Connection;
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
    
    public int getTruckListSize() {
        return trucks.size();
    }
    
    public Truck getTruck(int index) {
        if (index < trucks.size()){
            return trucks.get(index);
        }else {
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
    }
}
