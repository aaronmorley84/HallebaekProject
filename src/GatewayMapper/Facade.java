/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;
import Domain.CustomerList;

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
}
