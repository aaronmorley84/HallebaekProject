package Resources;

import java.sql.Date;

/**
 *
 * @author krismaini
 */
public class PickUpOrder {

    private int orderID, customerID;
    private Date startDate, finishDate;

    public PickUpOrder(int orderID, int customerID, Date startDate, Date finishDate) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public int getPickUPOrderID() {
        return orderID;
    }

    public int getPickUpCustomerID() {
        return customerID;
    }
    public Date getStartDate(){
        return startDate;
    }
    public Date getFinishDate(){
        return finishDate;
    }
}
