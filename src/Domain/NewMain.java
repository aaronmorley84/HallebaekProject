/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Kris
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller c = new Controller();
        
        if(c.addCustomerOrder(100001, "2014-01-01", "2014-01-02")){
            System.out.println("Customer order added!");
        }else{
            System.out.println("Did not add customer order!");
        }
        if(c.buildOrderList()){
            System.out.println("Built order list!");
            System.out.println("OrderID at index 0  int order list = "+c.getOrderID(0));
        }else{
            System.out.println("Did not build order list!");
        }
        
        if(c.buildProductList()){
            System.out.println("Built product list!");
            System.out.println("ProductID at index 0 in product list = "+c.getProductId(0));
        }else{
            System.out.println("Did not build product list!");
        }
        System.out.println("Adding "+c.getProductName(0)+" to order list!");
        c.addItemToOrderList(c.getProductId(0), c.getProductName(0), c.getProductVolume(0), 
                1, c.getProductDescription(0), c.getProductPrice(0), 1);
        
        int orderid = c.getOrderID(0);
        System.out.println("Order ID = "+orderid);
        
        if(c.addOrder(orderid)){
            System.out.println("Product order added!");
        }else{
            System.out.println("Did not add product order!");
        }
        
        if(c.addPickUp(orderid, 100001, "2014-01-01", "2014-01-02")){
            System.out.println("Pick up added!");
        }else{
            System.out.println("Did not add pick up!");
        }
        
        c.checkFreeTrucks("2014-01-01");
        
        if(c.buildTruckList()){
            System.out.println("Built truck list!");
            System.out.println("TruckID at index 0 in truck list = "+c.getAvailableTruck(0));
        }else{
            System.out.println("Did not build truck list!");
        }
        if(c.addTruckOrder(orderid, c.getAvailableTruck(0), "delivery", "2014-01-01")){
            System.out.println("Truck order added!");
        }else{
            System.out.println("Did not add truck order!");
        }
        
        if(c.buildTruckOrderList()){
            System.out.println("Built truck order lsit!");
        }else{
            System.out.println("Did not build truck order list");
        }
        System.out.println("Truck order: "+c.getTruckOrderID(0)+c.getTruckOrderDate(0)+c.getTruckOrderStatus(0));
    }
}
