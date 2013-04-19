package Domain;
import GatewayMapper.CheckerGateway;
import GatewayMapper.OrderGateway;
import Resources.Product;
import Resources.Packages;

public class Controller{
    OrderGateway orderController;
    CustomerList customerList = new CustomerList();
    ProductList productList = new ProductList();
    PackageList packageList = new PackageList();
    CheckerGateway checkerController;

    public Controller() {
        orderController = new OrderGateway();
        checkerController = new CheckerGateway(orderController);
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
    public boolean getOrders(){
        return orderController.getOrders();
    }
    public int getOrderListSize(){
        return orderController.getOrderListSize();
    }
    public void currentOrder(){
        orderController.currentOrder();
    }
    public void currentTruckOrder(){
        orderController.currentTruckOrder();
    }
    public boolean addItemToOrderList(Product prod){
        return orderController.addItemToOrderList(prod);
    }
    public void removeFromOrderList(Product prod){
        orderController.removeFromOrderList(prod);
    }
    public boolean addToCustomerOrderTable(int customerID, String startDate, String finishDate){
        return orderController.addToCustomerOrderTable(customerID, startDate, finishDate);
    }
    public boolean addOrderToDB(){
        return orderController.addOrderToDB();
    }
    public int getTrucksRequired(int totalVolume){
        return orderController.getTrucksRequired(totalVolume);
    }
    public boolean getTrucks(){
        return orderController.getTrucks();
    }
    public boolean commitTruckOrder(){
        return orderController.commitTruckOrder();
    }
    public int getUniqueOrderID(){
        return orderController.getUniqueOrderID();
    }
    /*
     * Methods for CustomerList()
     */
    
    
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
