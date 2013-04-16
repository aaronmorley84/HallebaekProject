/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;

import Resources.Customer;
import Resources.Product;
import Resources.Packages;

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
    boolean addItemToOrderList(Product prod);
    void removeFromOrderList(Product prod);
    boolean addToCustomerOrderTable(int customerID, String startDate, String finishDate);
    boolean addOrderToDB();
    int getTrucksRequired(int totalVolume);
    boolean getTrucks();
    boolean bookTrucks(int trucksForOrder);
    int getUniqueOrderID();
    boolean getOrders();
    int getOrderListSize();
    boolean commitTruckOrder(int truckID, int orderID, String status, String date);
            
    /*CustomerGateway methods*/
    Customer getCustomerList(int i);
    int getCustomerListSize();
    boolean buildCustomerList();
    boolean addCustomer( String name, String address, String email);
    boolean saveEditedCustomer(int cusID,String cusName,String cusAddress,String cusEmail);
    boolean deleteCustomer(int cusID);
    String printList();
    
    /*PackageGateway methods*/
    Packages getPackageList(int i);
    int getPackageListSize();
    Product getPackageProductList(int i);
    int getPackageProductListSize();
    boolean buildPackageList();
    boolean addPackage(String name, String description, int price);
    String printPackageList();
    boolean addItemToPackageList(Product prod);
    void removeFromPackageList(Product prod);
    void setCurrentPackage(Packages pack);
    boolean addProductsToPackageInDB();
    boolean loadPackageProducts();
    
    /*CheckerGateway methods*/
    boolean checkTruckAvailability(int truckID, String date);
}
