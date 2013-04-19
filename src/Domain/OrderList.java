package Domain;

import GatewayMapper.Facade;
import Resources.Order;
import java.util.ArrayList;
/**
 *
 * @author Kris
 */
public class OrderList {
    private ArrayList<Order> orderList;
    private Order currentOrder;
    Facade facade = new Facade();
    
    public void addToCustomerList(int customerID, int dateArrival, int datePickUp, 
            int trucksforDelivery, int orderId, int balance){
        orderList.add(new Order(customerID,dateArrival,datePickUp,trucksforDelivery,orderId,balance));
    }
    public Order getCurrentOrder(int i){
        currentOrder = orderList.get(i);
        return currentOrder;
    }
    public int getOrderListSize(){
        return orderList.size();
    }
    public void clearOrderList(){
        orderList.clear();
    }
    
    //getters
    public int getOrderID(){
        return currentOrder.getOrderID();
    }
    public int getOrderArrDate(){
        return currentOrder.getDateArrival();
    }
    public int getOrderPickUpDate(){
        return currentOrder.getDatePickUp();
    }
    public int getTrucksAmount(){
        return currentOrder.getTrucksforDelivery();
    }
    public int getCustomerID(){
        return currentOrder.getCustomer();
    }
    public int getOrderBalance(){
        return currentOrder.getBalance();
    }
    
    //setters
    public void setOrderID(int orderID){
        currentOrder.setOrderId(orderID);
    }
    public void setOrderArrDate(int arrDate){
        currentOrder.setDateArrival(arrDate);
    }
    public void setOrderPickUpDate(int pickUpDate){
        currentOrder.setDatePickUp(pickUpDate);
    }
    public void setOrderTrucksAmount(int amount){
        currentOrder.setTrucksforDelivery(amount);
    }
    public void setOrderCustID(int custID){
        currentOrder.setCustomer(custID);
    }
    public void setOrderBalance(int balance){
        currentOrder.setBalance(balance);
    }
    
    //order gateway
    public boolean buildOrderList(OrderList orderlist){
        return facade.buildOrderList(orderlist);
    }
    public boolean addOrder(){
        return facade.addOrder();
    }
    
}
