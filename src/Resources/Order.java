package Resources;

import java.util.ArrayList;

/**
 *
 * @author Adrian & Kris
 */
public class Order {
    public ArrayList<Product> orderProductList = new ArrayList<>();
    private int customerID;
    private String startDate, finishDate;
    private int orderID;
    private int balance;

    public Order(int orderId, int customerID, String startDate, String finishDate , int balance) {
        this.customerID = customerID;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.orderID = orderId;
        this.balance = balance;
    }
    public boolean addItemToOrderList(int prodID, String name, int vol, int quantity, String descrip, int price){//, int availableQuantity){
       Product prod = new Product(prodID, name, vol, quantity, descrip, price);
       boolean success=false;
       if(!checkForDuplicate(prod.getProductID())){
           //if(quantity <= availableQuantity){
            balance = balance + (prod.price * prod.quantity);
            setBalance(balance);
            success = true;
            orderProductList.add(prod);
           //}
        }
        return success;
    }
    
    public void removeFromOrderList(int index) {
        balance = balance - (orderProductList.get(index).price * orderProductList.get(index).quantity);
        setBalance(balance);
        orderProductList.remove(orderProductList.get(index));
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
    
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }
    
    public void setOrderId (int orderId) {
        this.orderID = orderId;
    }
    
    public int getOrderID() {
        return orderID;
    }
    
    
    @Override
    public String toString() {
        return "CustomerID: "+customerID+" OrderID: "+orderID+" Start date: "+startDate+" End date: "+finishDate
                + "Balance: "+balance;
    }
    
}
