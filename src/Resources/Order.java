package Resources;

import java.util.ArrayList;

/**
 *
 * @author Adrian & Kris
 */
public class Order {
    ArrayList<Product> orderList = new ArrayList<>();
    int customerID;
    int dateArrival, datePickUp;
    int trucksforDelivery, assemblersNeeded;
    int orderID;
    int balance;

    public Order(int customerID, int dateArrival, int datePickUp, int trucksforDelivery, int assemblersNeeded, int orderId, int balance) {
        this.customerID = customerID;
        this.dateArrival = dateArrival;
        this.datePickUp = datePickUp;
        this.trucksforDelivery = trucksforDelivery;
        this.assemblersNeeded = assemblersNeeded;
        this.orderID = orderId;
        this.balance = balance;
    }
    
   /*
    * No connection to DB. 
    * Solely for manipulating 
    * the ArrayList for the 
    * current order.
    */
    public boolean addItemToOrderList(Product prod){
       boolean success=false;
        if(!checkForDuplicate(prod.getProductID())){
            balance = balance + (prod.price * prod.quantity);
            success = true;
            orderList.add(prod);
            System.out.println(balance);
        }
        return success;
    }
    
    public void removeFromOrderList(Product prod) {
        orderList.remove(prod);
        balance = balance - (prod.price * prod.quantity);
        System.out.println(balance);
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
    
    public void addDiscount(double discount){
        if (discount < 1.0){
            balance = (int) (balance - ((balance/100)*discount));
        }
    }    
    public int getBalance(){ 
        return balance;
    }
            
    public void setCustomer (int customerID) {
        this.customerID = customerID;
    }
    
    public int getCustomer(){
        return customerID;
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
    
    public void setOrderId (int orderId) {
        this.orderID = orderId;
    }
    
    public int getOrderID() {
        return orderID;
    }
    
    public ArrayList<Product> getListInstance(){
        return orderList;
    }
    
    @Override
    public String toString() {
        return "CustomerID: "+customerID+" OrderID: "+orderID+" Start date: "+dateArrival+" End date: "+datePickUp
                +" Trucks: "+trucksforDelivery+" Assemblers: "+assemblersNeeded+" Balance: "+balance;
    }
    
}
