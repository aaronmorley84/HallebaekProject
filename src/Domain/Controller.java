package Domain;
import GatewayMapper.CheckerGateway;
import GatewayMapper.OrderGateway;
import GatewayMapper.PackageGateway;
import GatewayMapper.ProductGateway;
import Resources.Product;
import Resources.Packages;

public class Controller{
    ProductGateway prodController;
    OrderGateway orderController;
    CustomerList customerList = new CustomerList();
    PackageGateway packageController;
    CheckerGateway checkerController;

    public Controller() {
        prodController = new ProductGateway();
        orderController = new OrderGateway();
        packageController = new PackageGateway();
        checkerController = new CheckerGateway(orderController);
    }
    /*
     * methods for ProductGateway()
     */
    public Product getProductFromArray(int ID){
        return prodController.getProductFromArray(ID);
    }
    public Product searchProdByNameFromArray(String name) {
        return prodController. searchProdByNameinArray(name);
    }
    public boolean addProduct(String name, int volume, int quantity, String description, int price){
        return prodController.addProduct(name, volume, quantity, description, price);
    }
    public boolean editProduct(int ID, String name, int volume, int quantity, String description, int price){
        return prodController.editProduct(ID, name, volume, quantity, description, price);
    }
    public boolean deleteProduct(int ID){
        return prodController.deleteProduct(ID);
    }
    public int getProductListsize() {
        return prodController.getProductListsize();
    }
    public Product showProducts(int index) {
        return prodController.getProductFromArray(index);
    }
    public boolean getAllProducts() {
        return prodController.getAllProducts();
    }
    public boolean searchForProduct(String name) {
        return prodController.searchForProduct(name);
    }
    public boolean searchForProduct(int ID) {
        return prodController.searchForProduct(ID);
    }
    /*
     * Methods for OrderGateway()
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
     * Methods for CustomerGateway()
     */
    
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
        return customerList.buildCustomerList();
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
     * Methods for PackageGateway()
     */
    public Packages getPackageList(int i) {
        return packageController.getPackageList(i);
    }
    public int getPackageListSize() {
        return packageController.getPackageListSize();
    }
    public Product getPackageProductList(int i) {
        return packageController.getPackageProductList(i);
    }
    public int getPackageProductListSize() {
        return packageController.getPackageProductListSize();
    }
    public boolean buildPackageList(){
        return packageController.buildPackageList();
    }
    public boolean addPackage(String name, String description, int price){
        return packageController.addPackage(name, description, price);
    }
    public String printPackageList(){
        return packageController.printList();
    }
    public boolean addItemToPackageList(Product prod){
        return packageController.addItemToPackageList(prod);
    }
    public void removeFromPackageList(Product prod){
        packageController.removeFromPackageList(prod);
    }
    public void setCurrentPackage(Packages pack){
        packageController.setCurrentPackage(pack);
    }
    public boolean addProductsToPackageInDB(){
        return packageController.addProductsToPackageInDB();
    }
    public boolean loadPackageProducts(){
        return packageController.loadPackageProducts();
    }
    public boolean deletePackageProducts(){
        return packageController.deletePackageProducts();
    }
    public boolean deletePackage(){
        return packageController.deletePackage();
    }
    /*
     * Methods for CheckerGateway(
     */
//    public boolean checkTruckAvailability(int truckID, String date){
//        return checkerController.checkTruckAvailability(truckID, date);
//    }
}
