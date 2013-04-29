package Domain;

import GatewayMapper.Facade;
import Resources.Order;
import Resources.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Kris
 */
public class OrderList {
    private ArrayList<Order> orderList = new ArrayList<Order>();
    
    private Order currentOrder;
    Facade facade = new Facade();
    
    public void addToOrderList(int orderID, int customerID, String dateArrival, String datePickUp, int balance){
        orderList.add(new Order(orderID, customerID, dateArrival, datePickUp, balance));
    }
    
    public Order getCurrentOrder(int i){
        currentOrder = orderList.get(i);
        return currentOrder;
    }
    public int getCurrentOrderProductListSize(){
        return currentOrder.orderProductList.size();
    }
    public int getOrderListSize(){
        return orderList.size();
    }
    public void clearOrderList(){
        try{
        if(!orderList.isEmpty()){
            for (int i = 0; i < orderList.size(); i++) {
                orderList.remove(i);
            }
        }
        else{
            System.out.println("orderList empty!");
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    //These are the getters
    public int getOrderID(){
        return currentOrder.getOrderID();
    }
    public String getOrderStartDate(){
        return currentOrder.getStartDate();
    }
    public String getOrderFinishDate(){
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
    public int getOrderProductID(int i){
        return currentOrder.orderProductList.get(i).getProductID();
    }
    public String getOrderProductName(int i){
        return currentOrder.orderProductList.get(i).getName();
    }
    public int getOrderProductQTY(int i){
        return currentOrder.orderProductList.get(i).getQuantity();
    }
    
    //These are the setters
    public void setOrderID(int orderID){
        currentOrder.setOrderId(orderID);
    }
    public void setOrderStartDate(String startDate){
        currentOrder.setStartDate(startDate);
    }
    public void setOrderFinishDate(String finishDate){
        currentOrder.setFinishDate(finishDate);
    }
    public void setOrderCustID(int custID){
        currentOrder.setCustomer(custID);
    }
    public void setOrderBalance(int balance){
        currentOrder.setBalance(balance);
    }
    
    //communication to orderProductList (10001, "tent", 1, 1, "a tent", 100, 1)
    public boolean addItemToOrderList(int prodID, String name, int vol, int quantity, String descrip, int price, int availableQuantity){ 
        if(currentOrder.addItemToOrderList(prodID, name, vol, quantity, descrip, price)){//, availableQuantity)){            
            System.out.println("added!!!!!!!");
            System.out.println(currentOrder.orderProductList.toString());
            return true;
        }else{
            if(quantity > availableQuantity){
                JOptionPane.showMessageDialog(null, "Requested quantity exceeds available quantity of this product!", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            JOptionPane.showMessageDialog(null, "Product already exists in order!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    public void removeProductFromOrderList(int index) {
        currentOrder.removeFromOrderList(index);
    }
    
    public boolean checkProdForOrderQuantity(int quantityForOrder, int existingQuantity){
        if (quantityForOrder <= existingQuantity){
            return true;
        } else{               
              return false;
        }
    }
    
    //communication to the ordergateway
    public boolean buildOrderList(OrderList orderlist){
        return facade.buildOrderList(orderlist);
    }
    
    public boolean addOrder(OrderList orderlist){
        boolean success = false;
        if(facade.addOrder(orderlist)){
            JOptionPane.showMessageDialog(null, "Product order saved to database!", "Success", JOptionPane.INFORMATION_MESSAGE);
            success = true;
        }else{
            JOptionPane.showMessageDialog(null, "Error while saving product order to database!", "Error", JOptionPane.INFORMATION_MESSAGE);
            success = false;
        }
        return success;
    }
    public boolean addCustomerOrder(int customerID, String startDate, String finishDate){
        getNewOrderID(customerID, startDate, finishDate);
        return facade.addCustomerOrder(customerID, startDate, finishDate);
    }
    
    public boolean editCustomerOrder(int customerID, String startdate, String finishdate, int balance){
        boolean success = false;        
        if(facade.editCustomerOrder(customerID, startdate, finishdate, balance)){
            JOptionPane.showMessageDialog(null, "Customer order edited and saved to database!", "Success", JOptionPane.INFORMATION_MESSAGE);
            success = true;
        }else{
            JOptionPane.showMessageDialog(null, "Error while saving customer order!", "Error", JOptionPane.INFORMATION_MESSAGE);
            success = false;
        }
        return success;
    }
    
    //get orderID of new order
    public int getNewOrderID(int custID, String startDate, String endDate){
        int orderid = 0;
        for (int i = 0; i < orderList.size(); i++) {
            if(orderList.get(i).getCustomer()==custID && orderList.get(i).getStartDate().equals(startDate)
                    && orderList.get(i).getFinishDate().equals(endDate)){
                orderid = orderList.get(i).getOrderID();
//                currentOrder = orderList.get(i);
            }
        }
        return orderid;
    }
}
