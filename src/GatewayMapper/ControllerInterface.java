/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;

import Resources.Customer;
import Resources.Product;

/**
 *
 * @author Kris
 */
public interface ControllerInterface {
    
    /*ProductGateway methods*/
    Product getProduct(int ID);
    Product searchProdByName(String name);
    boolean addProduct(String name, int volume, int quantity, String description, int price);
    boolean editProduct(int ID, String name, int volume, int quantity, String description, int price);
    boolean deleteProduct(int ID);
    int getProductListsize();
    Product showProducts(int index);
    boolean getAllProducts();
    boolean searchForProduct(String name);
    boolean searchForProduct(int ID);
    
    /*OrderGateway methods*/
    void currentOrder();
    boolean addItemToList(Product prod);
    void removeFromOrder(Product prod);
    boolean addToCustomerOrderTable(int customerID, String startDate, String finishDate);
    boolean addOrderToDB();
    int getTrucksRequired(int totalVolume);
    boolean getTrucks();
    boolean bookTrucks(int trucksForOrder);
    int getUniqueOrderID();
    boolean checkTruckAvailability(int startDate);
    boolean getOrders();
    int getOrderListSize();
            
    /*CustomerGateway methods*/
    Customer getlist(int i);
    int getListSize();
    boolean buildCustomerList();
    boolean addCustomer( String name, String address, String email);
    boolean saveEditedCustomer(int cusID,String cusName,String cusAddress,String cusEmail);
    boolean deleteCustomer(int cusID);
    String printList();
    
    /*PackageGateway methods*/
    boolean buildPackageList();
    boolean addPackage(int packageID, String name, String description, int price);
    String printPackageList();
    
}
