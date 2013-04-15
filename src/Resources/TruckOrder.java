
package Resources;

/**
 *
 * @author Kris
 */
public class TruckOrder {
    int truckID, orderID;
    String status;
    String date;

    public TruckOrder(int truckID, int orderID, String status, String date) {
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
    
    
}
