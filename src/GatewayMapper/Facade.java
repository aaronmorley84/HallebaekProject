/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;
import Domain.CustomerList;
import Domain.OrderList;
import Domain.PackageList;
import Domain.ProductList;
import Domain.TruckList;

/**
 *
 * @author Aaron
 */
public class Facade {
    
    
    //Customer gateway
    public boolean buildCustomerList(CustomerList customerList){
        CustomerGateway cg = new CustomerGateway();
        return cg.buildCustomerList(customerList);
    }
    public boolean addCustomer(String name, String address, String email){
        CustomerGateway cg = new CustomerGateway();
        return cg.addCustomer(name, address, email);
    }
    public boolean saveEditedCustomer(int cusID, String cusName, String cusAddress, String cusEmail) {
         CustomerGateway cg = new CustomerGateway();
        return cg.saveEditedCustomer(cusID, cusName, cusAddress, cusEmail);
    }
    public boolean deleteCustomer(int cusID) {
         CustomerGateway cg = new CustomerGateway();
        return cg.deleteCustomer(cusID);
    }
    
    //Product Gateway
    public boolean buildProductList(ProductList productList){
        ProductGateway pg = new ProductGateway();
        return pg.buildProductList(productList);
    }
    public boolean addProduct(String prodName, int prodVol, int prodQTY, String prodDisc, int prodPrice){
        ProductGateway pg = new ProductGateway();
        return pg.addProduct(prodName, prodVol, prodQTY, prodDisc, prodPrice);
    }
    public boolean saveEditedProduct(int prodID, String prodName, int prodVol, int prodQTY, String prodDisc, int prodPrice) {
         ProductGateway pg = new ProductGateway();
        return pg.saveEditedProduct(prodID, prodName, prodVol, prodQTY, prodDisc, prodPrice);
    }
    public boolean deleteProduct(int ProdID) {
         ProductGateway pg = new ProductGateway();
        return pg.deleteProduct(ProdID);
    }
    
    //Order Gateway
    public boolean buildOrderList(OrderList orderlist){
        OrderGateway og = new OrderGateway();
        return og.buildOrderList(orderlist);
    }
    public boolean addOrder(){
        OrderGateway og = new OrderGateway();
        return og.addOrder();
    }
    public boolean addCustomerOrder(int customerID, String startDate, String finishDate){
        OrderGateway og = new OrderGateway();
        return og.addCustomerOrder(customerID, startDate, finishDate);
    }
    public int getUniqueOrderID(){
        OrderGateway og = new OrderGateway();
        return og.getUniqueOrderID();
    }
    
    //Package Gateway
    public boolean buildPackageList(PackageList packageList){
        PackageGateway pg = new PackageGateway();
        return pg.buildPackageList(packageList);
    }
    public boolean addPackage(String packName, String packDesc, int packPrice){
        PackageGateway pg = new PackageGateway();
        return pg.addPackage(packName, packDesc, packPrice);
    }
    public boolean addProductsToPackageInDB(){
        PackageGateway pg = new PackageGateway();
        return pg.addProductsToPackageInDB();
    }
    public boolean loadPackageProducts(){
        PackageGateway pg = new PackageGateway();
        return pg.loadPackageProducts();
    }
    public boolean deletePackageProducts(){
        PackageGateway pg = new PackageGateway();
        return pg.deletePackageProducts();
    }
    public boolean deletePackage(){
        PackageGateway pg = new PackageGateway();
        return pg.deletePackage();
    }
    
    //Truck Gateway
    public boolean buildTruckList(TruckList trucklist){
        TruckGateway tg = new TruckGateway();
        return tg.buildTruckList(trucklist);
    }
    public boolean buildTruckOrderList(TruckList trucklist){        
        TruckGateway tg = new TruckGateway();
        return tg.buildTruckOrderList(trucklist);
    }
    public boolean addTruckOrder(int orderid, int truckid, String status, String date){
        TruckGateway tg = new TruckGateway();
        return tg.addTruckOrder(orderid, truckid, status, date);
    }
    public boolean addTruck(int truckid, String model, int capacity, String bookeddate){
        TruckGateway tg = new TruckGateway();
        return tg.addTruck(truckid, model, capacity, bookeddate);
    }
            
}
