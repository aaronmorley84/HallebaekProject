///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package Domain;
//
///**
// *
// * @author Kris
// */
//public class NewMain {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Controller c = new Controller();
//        int custID = 100002;
//        String startdate = "4015-01-01";
//        String finishdate = "4015-01-02";
//        if(c.addCustomerOrder(custID, startdate, finishdate)){
//            System.out.println("Customer order added!");
//        }else{
//            System.out.println("Did not add customer order!");
//        }
//        if(c.buildOrderList()){
//            System.out.println("Built order list!");
//        }else{
//            System.out.println("Did not build order list!");
//        }
//        
//        if(c.buildProductList()){
//            System.out.println("Built product list!");
//            System.out.println("ProductID at index 1 in product list = "+c.getProductId(1));
//        }else{
//            System.out.println("Did not build product list!");
//        }
//        System.out.println("Adding "+c.getProductName(1)+" to order list!");
//        c.addItemToOrderList(c.getProductId(1), c.getProductName(1), c.getProductVolume(1), 
//                1, c.getProductDescription(1), c.getProductPrice(1), 1,0);
//        
//        int orderid = c.getOrderID(0);
//        System.out.println("Order ID = "+orderid);
//        
//        if(c.addOrder(orderid)){
//            System.out.println("Product order added!");
//        }else{
//            System.out.println("Did not add product order!");
//        }
//        
//        if(c.addPickUp(orderid, custID, startdate, finishdate)){
//            System.out.println("Pick up added!");
//        }else{
//            System.out.println("Did not add pick up!");
//        }
//                
//        if(c.buildTruckList()){
//            System.out.println("Built truck list!");
//            System.out.println("TruckID at index 0 in truck list = "+c.getAvailableTruck(0));
//        }else{
//            System.out.println("Did not build truck list!");
//        }
//        if(c.buildTruckOrderList()){
//            System.out.println("Built truck order list!");
//        }else{
//            System.out.println("Did not build truck order list!");
//        }
//        
//        c.checkFreeTrucks(startdate);
//        
//        if(c.addTruckOrder(orderid, c.getAvailableTruck(0), "delivery", startdate)){
//            System.out.println("Truck order added!");
//        }else{
//            System.out.println("Did not add truck order!");
//        }
//        
//        if(c.buildTruckOrderList()){
//            System.out.println("Built truck order list again!");
//        }else{
//            System.out.println("Did not build truck order list");
//        }
//        System.out.println("Truck order: "+c.getTruckOrderID(0)+c.getTruckOrderDate(0)+c.getTruckOrderStatus(0));
//    }
//}
