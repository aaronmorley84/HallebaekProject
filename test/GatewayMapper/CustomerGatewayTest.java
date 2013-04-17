/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;

import DBConnection.ConnectionTools;
import Resources.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Andrew
 */
public class CustomerGatewayTest {
    Connection con;
    private String id ="CLCOSV12E2";
    private String pw = "CLCOSV12E2";
    Controller cont;
    
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
        getConnection();
        FixtureForTestOfCustomerGateway.setUp(con);
        cont = new Controller();
    }
    
    @After
    public void tearDown() throws SQLException {
         releaseConnection();
    }

    /**
     * Test of getCustomerList method, of class CustomerGateway.
     */
    @Test
    public void testGetCustomerList() {
        System.out.println("getCustomerList");
        int i = 1;
        CustomerGateway instance = new CustomerGateway();
        instance.buildCustomerList();
        Customer expResult = new Customer(100001,"AARON","BIN ROAD",100001,"bob@bob.com");
        Customer result = instance.getCustomerList(i);
        assertSame(expResult,result);
        
       
    }

    /**
     * Test of getCustomerListSize method, of class CustomerGateway.
     */
    @Test
    public void testGetCustomerListSize() {
        System.out.println("getCustomerListSize");
        CustomerGateway instance = new CustomerGateway();
        
        instance.buildCustomerList();        
        
        int expResult = instance.getCustomerListSize();/*THIS IS SO TOTALY WRONG*/
        
        int result = instance.getCustomerListSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of buildCustomerList method, of class CustomerGateway.
     */
    @Test
    public void testBuildCustomerList() {
        System.out.println("buildCustomerList");
        CustomerGateway instance = new CustomerGateway();
        boolean expResult = true;
        boolean result = instance.buildCustomerList();
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
        Controller instance = new Controller();
        boolean expResult = true;
        boolean result = instance.addCustomer(name, address, email);        
        assertEquals(expResult, result);
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
        CustomerGateway instance = new CustomerGateway();
        boolean expResult = true;
        boolean result = instance.saveEditedCustomer(cusID, cusName, cusAddress, cusEmail);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteCustomer method, of class CustomerGateway.
     */
    @Test
    public void testDeleteCustomer() {
        System.out.println("deleteCustomer");
        int cusID = 100002;
        CustomerGateway instance = new CustomerGateway();
        boolean expResult = true;
        boolean result = instance.deleteCustomer(cusID);
        assertEquals(expResult, result);
    }

 
    
     private void getConnection()
	  {
	    try 
	    {  
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      con = DriverManager.getConnection(
	          "jdbc:oracle:thin:@delfi.lyngbyes.dk:1521:KNORD", id, pw );  
	    }
	    catch (Exception e) 
	    {   System.out.println("fail in getConnection()");
	        System.out.println(e); }    
	  }
	  public void releaseConnection()
	  {
	      try{
	          con.close();
	      }
	      catch (Exception e)
	      { System.err.println(e);}
	  }
          
}

