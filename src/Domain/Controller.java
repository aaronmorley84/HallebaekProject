package Domain;

import Resources.Product;
import java.sql.SQLException;
import java.util.ArrayList;


public class Controller{
    CustomerList customerList = new CustomerList();
    ProductList productList = new ProductList();
    PackageList packageList = new PackageList();
    OrderList orderList = new OrderList();
    TruckList truckList = new TruckList();
    PickUpList pickupList = new PickUpList();
    UserList userlist = new UserList();

    public Controller() {

        
        
    }
    /*
     * methods for PickUpList()
     */
    public boolean addPickUp(int orderID, int customerID, String startDate, String finishDate){
        return pickupList.addPickUp(orderID, customerID, startDate, finishDate);

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
    public boolean searchProdByNameinArray(String name){
        return productList.searchProdByNameinArray(name);
    }
    public int searchProdByIDinArray(int ID){
        return productList.searchProdByIDinArray(ID);
    }
    public int getProductSearchListsize() {
        return productList.getProductSearchListsize();
    }
    public int getSearchProductId(int i){
        productList.getCurrentSearchProduct(i);
        return productList.getProdID();
    }
    public String getSearchProductName(int i){
        productList.getCurrentSearchProduct(i);
        return productList.getProdName();
    }

    /*
     * Methods for OrderList()
     */
     public int getOrderID(int i){
        orderList.getCurrentOrder(i);
        return orderList.getOrderID();
    }
    public String getOrderStartDate(int i){
        orderList.getCurrentOrder(i);
        return orderList.getOrderStartDate();
    }
    public String getOrderFinishDate(int i){
        orderList.getCurrentOrder(i);
        return orderList.getOrderFinishDate();
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
    public int getCurrentOrderProductListSize(){
        return orderList.getCurrentOrderProductListSize();
    }
    public int getOrderListSize(){
        return orderList.getOrderListSize();        
    }
    public boolean addItemToOrderList(int prodID, String name, int vol, int quantity, String descrip, int price, int availableQuantity){
        return orderList.addItemToOrderList(prodID, name, vol, quantity, descrip, price, availableQuantity);
    }
    public void removeFromOrderList(int index){
        orderList.removeProductFromOrderList(index);
    }
    public boolean checkProdForOrderQuantity(int quantityForOrder, int existingQuantity){
        return orderList.checkProdForOrderQuantity(quantityForOrder, existingQuantity);
    }
    public boolean buildOrderList(){
        return orderList.buildOrderList(orderList);
    }
    public boolean addOrder(){
        return orderList.addOrder(orderList);
    }
    public boolean addCustomerOrder(int customerID, String startDate, String finishDate){
        return orderList.addCustomerOrder(customerID, startDate, finishDate);
    }
    public boolean editCustomerOrder(int customerID, String startdate, String finishdate, int balance){
        return orderList.editCustomerOrder(customerID, startdate, finishdate, balance);
    }
    public int getNewOrderID(int custID, String startDate, String endDate){
        return orderList.getNewOrderID(custID, startDate, endDate);
    }
     public int getOrderProductID(int i){
        return orderList.getOrderProductID(i);
    }
    public String getOrderProductName(int i){
        return orderList.getOrderProductName(i);
    }
    public int getOrderProductQTY(int i){
        return orderList.getOrderProductQTY(i);
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
    public int getAvailableTruckListSize(){
        return truckList.getAvailableTruckListSize();
    }
    public String getTruckOrderStatus(int i){
        truckList.getcurrTruckOrder(i);
        return truckList.getTruckOrderStatus();
    }
    public String getTruckOrderDate(int i){
        truckList.getcurrTruckOrder(i);
        return truckList.getTruckOrderDate();
    }
    public int getAvailableTruck(int index){
        return truckList.getAvailableTruck(index);
    }
    public int getTrucksRequired(int totalVolume){
        return truckList.getTrucksRequired(totalVolume);
    }
    public void checkFreeTrucks(String date){
        truckList.checkFreeTrucks(date);
    }
    public boolean buildTruckList(){
        return truckList.buildTruckList(truckList);
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
    public boolean saveEditedCustomer(int cusID, String cusName, String cusAddress, String cusEmail) throws SQLException {
        return customerList.saveEditedCustomer(cusID, cusName, cusAddress, cusEmail);
    }
    public boolean deleteCustomer(int cusID) {
        return customerList.deleteCustomer(cusID);
    }

    public boolean lockCustomer(int cusID){
        return customerList.lockCustomer(cusID);
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
    public boolean addItemToPackageList(int prodID, String name, int vol, int quantity, String descrip, int price){
        return packageList.addItemToPackageList(prodID, name, vol, quantity, descrip, price);
    }
    public void removeFromPackageList(int index){
        packageList.removeFromPackageList(index);
    }
    public boolean addProductsToPackageInDB(){
        return packageList.addProductsToPackageInDB();
    }
    public boolean loadPackageProducts(int packID){
        return packageList.loadPackageProducts(packID);
    }
    public boolean deletePackageProducts(){
        return packageList.deletePackageProducts();
    }
    public boolean deletePackage(){
        return packageList.deletePackage();
    }
    public int getNewPackageID(String packName, String packDis, int packPrice){
        return packageList.getNewPackageID(packName, packDis, packPrice);
    }
    public int getPackageProductID(int i){
        return packageList.getPackageProductID(i);
    }
    public String getPackageProductName(int i){
        return packageList.getPackageProductName(i);
    }
    public int getPackageProductQTY(int i){
        return packageList.getPackageProductQTY(i);
    }
    public int searchPackProdByIDinArray(int ID){
        return packageList.searchPackProdByIDinArray(ID);
    }
    
    //UserList functionality 
    
    public boolean buildUserList(){
        return userlist.buildUserListFromDB(userlist);
    }//end of buildUserList, added by Andrew
    
    public boolean addUserToDB(String id, String pw, int pou ){
        boolean succes = false;
        if(userlist.addUserToDB(id, pw, pou)){
            userlist.buildUserListFromDB(userlist);
            succes = true;
        }
        return succes;
    }//end of addUserToDB, added by Andrew
    
    public boolean editUserInDB(String id, String pw, int pou){
        boolean succes = false;
        if(userlist.editUserInDB(id, pw, pou)){
            userlist.buildUserListFromDB(userlist);
            succes = true;
        }
        return succes;
    }//end of editUserInDB, added by Andrew
    
    public String getCurrUserName(int i){
        userlist.getCurrentUser(i);
        return userlist.getUserName();
    }//end of gerCurrUserName, added by Andrew
    
    public String getCurrUserPw(int i){
        userlist.getCurrentUser(i);
        return userlist.getUserPassword();
    }//end of getCurrUserPw, added by Andrew
    
    public int getCurrUserRank(){
        return userlist.getUserPowerOfUser();
    }//end of buildgetCurrUserRank, added by Andrew
    
    public boolean checkUserNPw(String id, String pw){
       return userlist.checkUserNPw(id,pw);
    }
}
