/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;

import DBConnection.ConnectionTools;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author Andrew, 17-04-2013
 */
public class CustomerGatewayTest {

    private String id ="Count";
    Connection con;
    ControllerInterface cont;
 
    public CustomerGatewayTest() {
    
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
      
    }
    
    @Before
    public void setUp() {
        con = ConnectionTools.getInstance().getCurrentConnection();
        cont = new Controller();
        
    }
    
    @After
    public void tearDown() throws SQLException {    
     
    }

    /**
     * Test of getCustomerList method, of class CustomerGateway.
     */
    @Test
    public void testGetCustomerList() {
        System.out.println("getCustomerList");
        int i = 0;
        cont.addCustomer(id, id, id);
        cont.buildCustomerList();
        String expResult = id;
        String result = cont.getCustomerList(i).getName();
        assertEquals(expResult,result);
        
        cont.buildCustomerList();
        for (int j = 0; j < cont.getCustomerListSize(); j++) {
            if(cont.getCustomerList(j).getName().equals(id)){
                cont.deleteCustomer(cont.getCustomerList(i).getCustomerID());
            }
        } 
    }

    /**
     * Test of getCustomerListSize method, of class CustomerGateway.
     */
    @Test
    public void testGetCustomerListSize() {
        System.out.println("getCustomerListSize");
        cont.buildCustomerList();                
        int expResult = cont.getCustomerListSize();
        cont.addCustomer(id, id, id);
        cont.buildCustomerList();
        int result = cont.getCustomerListSize();
        
        assertTrue(expResult+1 == result);
           cont.buildCustomerList();
        for (int i = 0; i < cont.getCustomerListSize(); i++) {
            if(cont.getCustomerList(i).getName().equals(id)){
                cont.deleteCustomer(cont.getCustomerList(i).getCustomerID());
            }
        }
    }

    /**
     * Test of buildCustomerList method, of class CustomerGateway.
     */
    @Test
    public void testBuildCustomerList() {
        System.out.println("buildCustomerList");
        boolean expResult = true;
        boolean result = cont.buildCustomerList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addCustomer method, of class CustomerGateway.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String name = "Test";
        String address = "fda";
        String email = "Con@Con";
        
        boolean expResult = true;
        boolean result = cont.addCustomer(name, address, email);        
        assertEquals(expResult, result);
        
        cont.buildCustomerList();
        for (int i = 0; i < cont.getCustomerListSize(); i++) {
            if(cont.getCustomerList(i).getName().equals(name)){
                cont.deleteCustomer(cont.getCustomerList(i).getCustomerID());
            }
            
        }
        
        
    }


    /**
     * Test of saveEditedCustomer method, of class CustomerGateway.
     */
    @Test
    public void testSaveEditedCustomer() {
        System.out.println("saveEditedCustomer");
        int cusID = 100002;
        String cusName = "fuck";
        String cusAddress = "fucking";
        String cusEmail = "gimp@khann.con";
        boolean expResult = true;
        boolean result = cont.saveEditedCustomer(cusID, cusName, cusAddress, cusEmail);
        assertEquals(expResult, result);
        cont.buildCustomerList();
        for (int i = 0; i < cont.getCustomerListSize(); i++) {
            if(cont.getCustomerList(i).getName().equals(cusName)){
                cont.deleteCustomer(cont.getCustomerList(i).getCustomerID());
            }
            
        }
    }

    /**
     * Test of deleteCustomer method, of class CustomerGateway.
     */
    @Test
    public void testDeleteCustomer() {
        System.out.println("deleteCustomer");
        int cusID = 100001;
        boolean expResult = true;
        boolean result = cont.deleteCustomer(cusID);
        assertEquals(expResult, result);
        
    }


    
          
}

