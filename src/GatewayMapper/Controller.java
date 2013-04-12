package GatewayMapper;
import Resources.Customer;
import Resources.Product;

public class Controller implements ControllerInterface{
    ProductGateway prodController;
    OrderGateway orderController;
    CustomerGateway customerController;
    PackageGateway packageController;

    public Controller() {
        prodController = new ProductGateway();
        orderController = new OrderGateway();
        customerController = new CustomerGateway();
        packageController = new PackageGateway();
    }
    /*
     * methods for ProductGateway()
     */
    public Product getProduct(int ID){
        return prodController.getProduct(ID);
    }
    public Product searchProdByName(String name) {
        return prodController.searchProdByName(name);
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
        return prodController.showProducts(index);
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
    public void currentOrder(){
        orderController.currentOrder();
    }
    public boolean addItemToList(Product prod){
        return orderController.addItemToList(prod);
    }
    public void removeFromOrder(Product prod){
        orderController.removeFromOrder(prod);
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
    public boolean bookTrucks(int trucksForOrder){
        boolean success = false;
        if (orderController.bookTrucks(trucksForOrder)){
            success = orderController.commitTruckOrder();
        }
        return success;
    }
    public int getUniqueOrderID(){
        return orderController.getUniqueOrderID();
    }
    /*
     * Methods for CustomerGateway()
     */
    public Customer getlist(int i) {
        return customerController.getlist(i);
    }
    public int getListSize() {
        return customerController.getListSize();
    }
    public int getUniqueCustomerID() {
        return customerController.getUniqueCustomerID();
    }
    public boolean buildCustomerList() {
        return customerController.buildCustomerList();
    }
    public boolean addCustomer(String name, String address, String email) {
        return customerController.addCustomer(name, address, email);
    }
    public boolean saveEditedCustomer(int cusID, String cusName, String cusAddress, String cusEmail) {
        return customerController.saveEditedCustomer(cusID, cusName, cusAddress, cusEmail);
    }
    public boolean deleteCustomer(int cusID) {
        return customerController.deleteCustomer(cusID);
    }
    public String printList() {
        return customerController.printList();
    }
    /*
     * Methods for PackageGateway()
     */
    public boolean buildPackageList(){
        return packageController.buildPackageList();
    }
    public boolean addPackage(int packageID, String name, String description, int price){
        return packageController.addPackage(packageID, name, description, price);
    }
    public String printPackageList(){
        return packageController.printList();
    }
}
