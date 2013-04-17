
package Resources;

import java.util.ArrayList;

/**
 *
 * @author Kris
 */
public class TruckOrder {

    ArrayList<Truck> trucksInOrder = new ArrayList<>();
    int truckID, orderID;
    String status;
    String date;

    public TruckOrder(int truckID, int orderID, String status, String date) {
        this.truckID = truckID;
        this.orderID = orderID;
        this.status = status;
        this.date = date;
    }
    
    public void addTruck(Truck truck){
        trucksInOrder.add(truck);
    }
    public void removeTruck(Truck truck){
        trucksInOrder.remove(truck);
    }
    
    public int getTruckID() {
        return truckID;
    }

    public void setTruckID(int truckID) {
        this.truckID = truckID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return truckID + "" + orderID + "" + status + "" + date;
    }
    
}
