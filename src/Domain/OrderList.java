package Domain;

import GatewayMapper.Facade;
import Resources.Order;
import Resources.Product;
import java.util.ArrayList;
/**
 *
 * @author Kris
 */
public class OrderList {
    private ArrayList<Order> orderList;
    private Order currentOrder;
    Facade facade = new Facade();
    
    public void addToOrderList(int customerID, int dateArrival, int datePickUp, 
            int orderId, int balance){
        orderList.add(new Order(customerID,dateArrival,datePickUp,orderId,balance));
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
    
    //These are the getters
    public int getOrderID(){
        return currentOrder.getOrderID();
    }
    public int getOrderStartDate(){
        return currentOrder.getStartDate();
    }
    public int getOrderFinishDate(){
        return currentOrder.getFinishDate();
    }
    public int getCustomerID(){
        return currentOrder.getCustomer();
    }
    public int getOrderBalance(){
        return currentOrder.getBalance();
    }
    public Product getProductList(int i){
        return currentOrder.orderProductList.get(i);
    }
    
    //These are the setters
    public void setOrderID(int orderID){
        currentOrder.setOrderId(orderID);
    }
    public void setOrderStartDate(int startDate){
        currentOrder.setStartDate(startDate);
    }
    public void setOrderFinishDate(int finishDate){
        currentOrder.setFinishDate(finishDate);
    }
    public void setOrderCustID(int custID){
        currentOrder.setCustomer(custID);
    }
    public void setOrderBalance(int balance){
        currentOrder.setBalance(balance);
    }
    
    //communication to orderProductList
    public boolean addProductToOrderList(Product prod){
        return currentOrder.addItemToOrderList(prod);
    }
    public void removeProductFromOrderList(Product prod) {
        currentOrder.removeFromOrderList(prod);
    }
    
    //communication to the ordergateway
    public boolean buildOrderList(OrderList orderlist){
        return facade.buildOrderList(orderlist);
    }
    public boolean addOrder(){
        return facade.addOrder();
    }
    public boolean addCustomerOrder(int customerID, String startDate, String finishDate){
        return facade.addCustomerOrder(customerID, startDate, finishDate);
    }
    public int getUniqueOrderID(){
        return facade.getUniqueOrderID();
    }
    public boolean editCustomerOrder(int customerID, String startdate, String finishdate){
        return facade.editCustomerOrder(customerID, startdate, finishdate);
    }
    
    
}
