
package Resources;

import java.util.ArrayList;

/**
 *
 * @author Kris
 */
public class TruckOrder {

    private int truckID, orderID;
    private String status;
    private String date;

    public TruckOrder( int orderID, int truckID, String status, String date) {
        this.truckID = truckID;
        this.orderID = orderID;
        this.status = status;
        this.date = date;
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
