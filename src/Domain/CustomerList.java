/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Resources.Customer;
import GatewayMapper.Facade;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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

    public Customer getCurrentCustomer(int i){
        currentCustomer = customerList.get(i);
        return currentCustomer;
    }

    public int getCustomerListSize() {
        return customerList.size();
    }
    
    public void clearCustomerList(){
        customerList.clear();
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
    public boolean buildCustomerList(CustomerList customerList){
        return facade.buildCustomerList(customerList);
    }
    public boolean addCustomer(String name, String address, String email){
        String empty = "";
        boolean success = false;
        if (!name.equals(empty) && !address.equals(empty) && !email.equals(empty)) {
        
        if (facade.addCustomer(name, address, email)){
            JOptionPane.showMessageDialog(null, "Customer Added to Database", "Success", JOptionPane.INFORMATION_MESSAGE);
            success = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Error Adding Cutomer", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
        else {
            JOptionPane.showInternalMessageDialog(null, "One or More Fields Is Empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }
    public boolean saveEditedCustomer(int cusID, String cusName, String cusAddress, String cusEmail) {
        String empty = "";
        boolean success = false;
        if (!cusName.equals(empty) && !cusAddress.equals(empty) && !cusEmail.equals(empty)) {
        if (facade.saveEditedCustomer(cusID, cusName, cusAddress, cusEmail)){
            JOptionPane.showMessageDialog(null, "Customer Edited and saved to database", "Success", JOptionPane.INFORMATION_MESSAGE);
            success = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Error Editing Cutomer", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
        else {
            JOptionPane.showInternalMessageDialog(null, "One or More Fields Is Empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }
    
    public boolean deleteCustomer(int cusID) {
        boolean success = false;
        if (facade.deleteCustomer(cusID)){
            JOptionPane.showMessageDialog(null, "Customer Deleted From database", "Success", JOptionPane.INFORMATION_MESSAGE);
            success = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Error Deleting Cutomer", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }
    
}
