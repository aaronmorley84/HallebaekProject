package Domain;

import Resources.Product;


public class Controller{
    CustomerList customerList = new CustomerList();
    ProductList productList = new ProductList();
    PackageList packageList = new PackageList();
    OrderList orderList = new OrderList();
    TruckList truckList = new TruckList();
    

    public Controller() {
        
        
    }
    /*
     * methods for ProductList()
     */
    
    public void clearProductList(){
        productList.clearProductList();
    }
    public int getProductId(int i){
        productList.getCurrentProduct(i);
        return productList.getProdID();
    }
    public String getProductName(int i){
        productList.getCurrentProduct(i);
        return productList.getProdName();
    }
    public int getProductVolume(int i){
        productList.getCurrentProduct(i);
        return productList.getProdVol();
    }
    public int getProductQuantiy(int i){
        productList.getCurrentProduct(i);
        return productList.getProdQTY();
    }
    public String getProductDescription(int i){
        productList.getCurrentProduct(i);
        return productList.getProdDisc();
    }
    public int getProductPrice(int i){
        productList.getCurrentProduct(i);
        return productList.getProdPrice();
    }
    public int getProductListSize() {
        return productList.getProductListsize();
    }
    public boolean buildProductList() {
        return productList.buildProductList(productList);
    }
    public boolean addProduct(String prodName, int prodVol, int prodQTY, String prodDisc, int prodPrice) {
        return productList.addProduct(prodName, prodVol, prodQTY, prodDisc, prodPrice);
    }
    public boolean saveEditedProduct(int prodID, String prodName, int prodVol, int prodQTY, String prodDisc, int prodPrice) {
        return productList.saveEditedProduct(prodID, prodName, prodVol, prodQTY, prodDisc, prodPrice);
    }
    public boolean deleteProduct(int cusID) {
        return productList.deleteProduct(cusID);
    }
    public String searchProdByNameinArray(String name){
        return productList.searchProdByNameinArray(name);
    }
    public int searchProdByIDinArray(int ID){
        return productList.searchProdByIDinArray(ID);
    }

    /*
     * Methods for OrderList()
     */
    public void clearOrderList(){
        orderList.clearOrderList();
    }
    public int getOrderID(int i){
        orderList.getCurrentOrder(i);
        return orderList.getOrderID();
    }
    public int getOrderArrDate(int i){
        orderList.getCurrentOrder(i);
        return orderList.getOrderArrDate();
    }
    public int getOrderPickUpDate(int i){
        orderList.getCurrentOrder(i);
        return orderList.getOrderPickUpDate();
    }
    public int getOrderTruckAmount(int i){
        orderList.getCurrentOrder(i);
        return orderList.getTrucksAmount();
    }
    public int getOrderCutomerID(int i){
        orderList.getCurrentOrder(i);
        return orderList.getCustomerID();
    }
    public int getOrderBalance(int i){
        orderList.getCurrentOrder(i);
        return orderList.getOrderBalance();
    }
    public Product getOrderProductList(int i){
        return orderList.getProductList(i);
    }
    public int getOrderListSize(){
        return orderList.getOrderListSize();
    }
    public boolean addItemToOrderList(Product prod){
        return orderList.addProductToOrderList(prod);
    }
    public void removeFromOrderList(Product prod){
        orderList.removeProductFromOrderList(prod);
    }
    public boolean buildOrderList(OrderList orderlist){
        return orderList.buildOrderList(orderlist);
    }
    public boolean addOrder(){
        return orderList.addOrder();
    }
    public boolean addCustomerOrder(int customerID, String startDate, String finishDate){
        return orderList.addCustomerOrder(customerID, startDate, finishDate);
    }
    
    //Methods for TruckList()
    public void clearTruckOrderList(){
        truckList.clearTruckOrderList();
    }
    public int getTruckID(int i){
        truckList.getcurrTruck(i);
        return truckList.getTruckID();
    }
    public int getTruckCapacity(int i){
        truckList.getcurrTruck(i);
        return truckList.getTruckCapacity();
    }
    public String getTruckModel(int i){
        truckList.getcurrTruck(i);
        return truckList.getTruckmodel();
    }
    public String getTruckDate(int i){
        truckList.getcurrTruck(i);
        return truckList.getTruckDate();
    }
    public int getTruckOrderID(int i){
        truckList.getcurrTruckOrder(i);
        return truckList.getTruckOrderID();
    }
    public int getTruckOrderTruckID(int i){
        truckList.getcurrTruckOrder(i);
        return truckList.getTruckOrderTruckID();
    }
    public String getTruckOrderStatus(int i){
        truckList.getcurrTruckOrder(i);
        return truckList.getTruckOrderStatus();
    }
    public String getTruckOrderDate(int i){
        truckList.getcurrTruckOrder(i);
        return truckList.getTruckOrderDate();
    }
    public boolean buildTruckList(TruckList trucklist){
        return truckList.buildTruckList(trucklist);
    }
    public boolean buildTruckOrderList(TruckList trucklist){
        return truckList.buildTruckOrderList(trucklist);
    }
    public boolean addTruckOrder(int orderid, int truckid, String status, String date){
        return truckList.addTruckOrder(orderid,truckid,status,date);
    }
    public boolean addTruck(int truckid, String model, int capacity, String bookeddate){
        return truckList.addTruck(truckid, model, capacity, bookeddate);
    }
    
    
    
    
    
    
    //Methods for CustomerList()
    public void clearCustomerList(){
        customerList.clearCustomerList();
    }
    public int getCustomerID(int i){
        customerList.getCurrentCustomer(i);
        return customerList.getCusID();
    }
    public String getCustomerName(int i){
        customerList.getCurrentCustomer(i);
        return customerList.getCusName();
    }
    public String getCustomerAddress(int i){
        customerList.getCurrentCustomer(i);
        return customerList.getCusAddress();
    }
    public String getCustomerEmail(int i){
        customerList.getCurrentCustomer(i);
        return customerList.getCusEmail();
    }
    public int getCustomerListSize() {
        return customerList.getCustomerListSize();
    }
    public boolean buildCustomerList() {
        return customerList.buildCustomerList(customerList);
    }
    public boolean addCustomer(String name, String address, String email) {
        return customerList.addCustomer(name, address, email);
    }
    public boolean saveEditedCustomer(int cusID, String cusName, String cusAddress, String cusEmail) {
        return customerList.saveEditedCustomer(cusID, cusName, cusAddress, cusEmail);
    }
    public boolean deleteCustomer(int cusID) {
        return customerList.deleteCustomer(cusID);
    }
    
    /*
     * Methods for PackageList()
     */
    public void clearPackageList(){
        packageList.clearPackageList();
    }
    public int getPackageListSize() {
        return packageList.getPackageListSize();
    }
    public int getPackageID(int i){
        packageList.getCurrentPackage(i);
        return packageList.getPackID();
    }
    public String getPackageName(int i){
        packageList.getCurrentPackage(i);
        return packageList.getPackName();
    }
    public String getPackageDiscription(int i){
        packageList.getCurrentPackage(i);
        return packageList.getPackDisc();
    }
    public int getPackagePrice(int i){
        packageList.getCurrentPackage(i);
        return packageList.getPackPrice();
    }
    public Product getPackageProductList(int i) {
        return packageList.getPackageProductList(i);
    }
    public int getPackageProductListSize() {
        return packageList.getPackageProductListSize();
    }
    public boolean buildPackageList(){
        return packageList.buildPackageList(packageList);
    }
    public boolean addPackage(String name, String description, int price){
        return packageList.addPackage(name, description, price);
    }
    public boolean addItemToPackageList(Product prod){
        return packageList.addItemToPackageList(prod);
    }
    public void removeFromPackageList(Product prod){
        packageList.removeFromPackageList(prod);
    }
    public boolean addProductsToPackageInDB(){
        return packageList.addProductsToPackageInDB();
    }
    public boolean loadPackageProducts(){
        return packageList.loadPackageProducts();
    }
    public boolean deletePackageProducts(){
        return packageList.deletePackageProducts();
    }
    public boolean deletePackage(){
        return packageList.deletePackage();
    }
    
    
    
    
    /*
     * Methods for CheckerGateway(
     */
//    public boolean checkTruckAvailability(int truckID, String date){
//        return checkerController.checkTruckAvailability(truckID, date);
//    }
}
