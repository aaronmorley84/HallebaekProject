package Resources;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew, date 05-04-2013, v0.01
 */
public class Customer {
    private int customerID,phoneID;
    private String name,adress,email;
    
    public Customer(int customerid, String name, String adress,int phoneid, String email){
        this.adress = adress;
        this.customerID = customerid;
        this.phoneID = phoneid;
        this.name = name;
        this.email = email;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(int phoneID) {
        this.phoneID = phoneID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        
        return "Customer name: "+ getName()+ "CustomerID: " + getCustomerID()+ "Email: " + getEmail() + "Adress: " + getAdress();
    }
    
}
