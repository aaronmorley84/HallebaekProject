/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Resources.Customer;
import GatewayMapper.Facade;
import java.util.ArrayList;

/**
 *
 * @author Aaron, Lars, 18/04/2013
 */
public class CustomerList {

    private ArrayList<Customer> customerList = new ArrayList<>();
    private Customer currentCustomer;
    Facade facade = new Facade();

    public void addToCustomerList(int cusID, String cusName, String cusAddress, int phoneID, String cusEmail) {
        customerList.add(new Customer(cusID, cusName, cusAddress, phoneID, cusEmail));
    }

//    public int getCurrentCusID(int j) {
//        
//        for (int i = 0; i < customerList.size(); i++) {
//            if (j == customerList.get(i).getCustomerID()) {
//                return i;
//            }
//        }
//        return 0;
//    }
    public Customer getCurrentCustomer(int i){
        currentCustomer = customerList.get(i);
        return currentCustomer;
    }

    public int getCustomerListSize() {
        return customerList.size();
    }
    
    

    //These are the getters
    public int getCusID() {
        return currentCustomer.getCustomerID();
    }
    
    public String getCusName() {
        return currentCustomer.getName();
    }
    
    public String getCusAddress() {
        return currentCustomer.getAdress();
    }
    
    public int getCusPhoneID() {
        return currentCustomer.getPhoneID();
    }
    
    public String getCusEmail() {
        return currentCustomer.getEmail();
    }
    
    //These are the setters
    public void editCusName(String newName) {
        currentCustomer.setName(newName);
    }
    
    public void editCusAddress(String newAddress) {
        currentCustomer.setAdress(newAddress);
    }
    
    public void editCusEmail(String newEmail) {
        currentCustomer.setEmail(newEmail);
    }
    
    //communication to customerGateway
    public boolean buildCustomerList(){
        customerList.clear();
        return facade.buildCustomerList();
    }
    public boolean addCustomer(String name, String address, String email){
        return facade.addCustomer(name, address, email);
    }
    public boolean saveEditedCustomer(int cusID, String cusName, String cusAddress, String cusEmail) {
        return facade.saveEditedCustomer(cusID, cusName, cusAddress, cusEmail);
    }
    public boolean deleteCustomer(int cusID) {
        return facade.deleteCustomer(cusID);
    }
}
