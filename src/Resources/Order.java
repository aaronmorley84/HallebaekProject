package Resources;

import java.util.ArrayList;

/**
 *
 * @author Adrian & Kris
 */
public class Order {
    public ArrayList<Product> orderProductList = new ArrayList<>();
    private int customerID;
    private int dateArrival, datePickUp;
    private int trucksforDelivery;
    private int orderID;
    private int balance;

    public Order(int customerID, int dateArrival, int datePickUp, int trucksforDelivery, int orderId, int balance) {
        this.customerID = customerID;
        this.dateArrival = dateArrival;
        this.datePickUp = datePickUp;
        this.trucksforDelivery = trucksforDelivery;
        this.orderID = orderId;
        this.balance = balance;
    }
    public boolean addItemToOrderList(Product prod){
       boolean success=false;
       if(!checkForDuplicate(prod.getProductID())){
            balance = balance + (prod.price * prod.quantity);
            setBalance(balance);
            success = true;
            orderProductList.add(prod);
        }
        return success;
    }
    
    public void removeFromOrderList(Product prod) {
        orderProductList.remove(prod);
        balance = balance - (prod.price * prod.quantity);
        setBalance(balance);
    }
    
    public boolean checkForDuplicate(int ID){
        boolean same = false;
        for (int i = 0; i < orderProductList.size(); i++) {
            if(orderProductList.get(i).getProductID() == ID){
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
    public void setBalance(int balance){
        this.balance = balance;
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
    
    
    @Override
    public String toString() {
        return "CustomerID: "+customerID+" OrderID: "+orderID+" Start date: "+dateArrival+" End date: "+datePickUp
                +" Trucks: "+trucksforDelivery+ "Balance: "+balance;
    }
    
}
