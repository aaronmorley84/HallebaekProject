/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;
import Resources.Customer;
import DBConnection.ConnectionTools;
import java.sql.Connection;
import java.util.ArrayList;
/**
 *
 * @author Andrew
 */
public class CustomerGateway {
   
    ArrayList<Customer> listOfCustomers = new ArrayList<>();
    
    
/*Used to build a list of customers. */
public void buildCustomerList(){
Connection con = ConnectionTools.getInstance().getCurrentConnection();
String SQLStatment1 = "Select * from Customer";



}//end of buildCustomer




}
