package Resources;

import java.util.ArrayList;

/**
 *
 * @author Kris
 */
public class Order {
    ArrayList<Product> orderList = new ArrayList<>();
    int cust;
    int dateArrival, datePickUp;
    int trucksforDelivery, assemblersNeeded;
    int orderID;

    public Order(int cust, int dateArrival, int datePickUp, int trucksforDelivery, int assemblersNeeded, int orderId) {
        this.cust = cust;
        this.dateArrival = dateArrival;
        this.datePickUp = datePickUp;
        this.trucksforDelivery = trucksforDelivery;
        this.assemblersNeeded = assemblersNeeded;
        this.orderID = orderId;
    }
    
   
    public boolean addItemToList(Product prod){
       boolean success=false;
        if(!checkForDuplicate(prod.getProductID())){
           success = true;
           orderList.add(prod);
        }
        return success;
    }
    public boolean checkForDuplicate(int ID){
        boolean same = false;
        for (int i = 0; i < orderList.size(); i++) {
            if(orderList.get(i).getProductID() == ID){
                same = true;
            }
        }
        return same;
    }
    public void setCustomer (int cust) {
        this.cust = cust;
    }
    
    public int getCustomer(){
        return cust;
    }
    
    public int getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(int dateArrival) {
        this.dateArrival = dateArrival;
    }

    public int getDatePickUp() {
        return datePickUp;
    }

    public void setDatePickUp(int datePickUp) {
        this.datePickUp = datePickUp;
    }

    public int getTrucksforDelivery() {
        return trucksforDelivery;
    }

    public void setTrucksforDelivery(int trucksforDelivery) {
        this.trucksforDelivery = trucksforDelivery;
    }
    
    public void addToOrder(Product prod){
        orderList.add(prod);
    }
    
    public void removeFromOrder(Product prod) {
        orderList.remove(prod);
    }

    public void setOrderId (int orderId) {
        this.orderID = orderId;
    }
    
    public int getOrderID() {
        return orderID;
    }
    
    @Override
    public String toString() {
        return orderList.toString()+dateArrival+datePickUp;
    }
    
}
