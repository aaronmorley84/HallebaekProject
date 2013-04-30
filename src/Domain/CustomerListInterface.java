package Domain;

import Resources.Customer;
import java.sql.SQLException;

/**
 *
 * @author Adrian
 */
public interface CustomerListInterface {
    public void addToCustomerList(int cusID, String cusName, String cusAddress, int phoneID, String cusEmail);
    public Customer getCurrentCustomer(int i);
    public int getCustomerListSize();
    public void clearCustomerList();
    //Getters
    public int getCusID();
     public String getCusName();
     public String getCusAddress();
     public int getCusPhoneID();
     public String getCusEmail();
     //Setters
     public void editCusName(String newName) ;
     public void editCusAddress(String newAddress);
     public void editCusEmail(String newEmail);
     //communication to customerGateway
     public boolean addCustomer(String name, String address, String email);
     public boolean saveEditedCustomer(int cusID, String cusName, String cusAddress, String cusEmail) throws SQLException;
     public boolean deleteCustomer(int cusID);
     public boolean lockCustomer(int cusID);
     public boolean buildCustomerList(CustomerListInterface customerList);
}

