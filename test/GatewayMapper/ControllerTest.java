/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;

import DBConnection.ConnectionTools;
import Resources.Customer;
import Resources.Product;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Andrew
 */
public class ControllerTest {    
    Connection con;
    private String id ="";
    private String pw = "";
    Controller cont;
    
    public ControllerTest() {
    }
    
    @BeforeClass
    public void setUpClass() throws Exception{
        getConnection();
        Fixture.setUp(con);
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getProduct method, of class Controller.
     */
    @Test
    public void testGetProduct() {
        System.out.println("getProduct");
        int ID = 0;
        Controller instance = new Controller();
        Product expResult = null;
        Product result = instance.getProduct(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchProdByName method, of class Controller.
     */
    @Test
    public void testSearchProdByName() {
        System.out.println("searchProdByName");
        String name = "";
        Controller instance = new Controller();
        Product expResult = null;
        Product result = instance.searchProdByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class Controller.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        String name = "";
        int volume = 0;
        int quantity = 0;
        String description = "";
        int price = 0;
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.addProduct(name, volume, quantity, description, price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editProduct method, of class Controller.
     */
    @Test
    public void testEditProduct() {
        System.out.println("editProduct");
        int ID = 0;
        String name = "";
        int volume = 0;
        int quantity = 0;
        String description = "";
        int price = 0;
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.editProduct(ID, name, volume, quantity, description, price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProduct method, of class Controller.
     */
    @Test
    public void testDeleteProduct() {
        System.out.println("deleteProduct");
        int ID = 0;
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.deleteProduct(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductListsize method, of class Controller.
     */
    @Test
    public void testGetProductListsize() {
        System.out.println("getProductListsize");
        Controller instance = new Controller();
        int expResult = 0;
        int result = instance.getProductListsize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showProducts method, of class Controller.
     */
    @Test
    public void testShowProducts() {
        System.out.println("showProducts");
        int index = 0;
        Controller instance = new Controller();
        Product expResult = null;
        Product result = instance.showProducts(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllProducts method, of class Controller.
     */
    @Test
    public void testGetAllProducts() {
        System.out.println("getAllProducts");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.getAllProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchForProduct method, of class Controller.
     */
    @Test
    public void testSearchForProduct_String() {
        System.out.println("searchForProduct");
        String name = "";
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.searchForProduct(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchForProduct method, of class Controller.
     */
    @Test
    public void testSearchForProduct_int() {
        System.out.println("searchForProduct");
        int ID = 0;
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.searchForProduct(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrders method, of class Controller.
     */
    @Test
    public void testGetOrders() {
        System.out.println("getOrders");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.getOrders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderListSize method, of class Controller.
     */
    @Test
    public void testGetOrderListSize() {
        System.out.println("getOrderListSize");
        Controller instance = new Controller();
        int expResult = 0;
        int result = instance.getOrderListSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of currentOrder method, of class Controller.
     */
    @Test
    public void testCurrentOrder() {
        System.out.println("currentOrder");
        Controller instance = new Controller();
        instance.currentOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItemToList method, of class Controller.
     */
    @Test
    public void testAddItemToList() {
        System.out.println("addItemToList");
        Product prod = null;
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.addItemToList(prod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromOrder method, of class Controller.
     */
    @Test
    public void testRemoveFromOrder() {
        System.out.println("removeFromOrder");
        Product prod = null;
        Controller instance = new Controller();
        instance.removeFromOrder(prod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToCustomerOrderTable method, of class Controller.
     */
    @Test
    public void testAddToCustomerOrderTable() {
        System.out.println("addToCustomerOrderTable");
        int customerID = 0;
        String startDate = "";
        String finishDate = "";
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.addToCustomerOrderTable(customerID, startDate, finishDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addOrderToDB method, of class Controller.
     */
    @Test
    public void testAddOrderToDB() {
        System.out.println("addOrderToDB");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.addOrderToDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrucksRequired method, of class Controller.
     */
    @Test
    public void testGetTrucksRequired() {
        System.out.println("getTrucksRequired");
        int totalVolume = 0;
        Controller instance = new Controller();
        int expResult = 0;
        int result = instance.getTrucksRequired(totalVolume);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrucks method, of class Controller.
     */
    @Test
    public void testGetTrucks() {
        System.out.println("getTrucks");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.getTrucks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bookTrucks method, of class Controller.
     */
    @Test
    public void testBookTrucks() {
        System.out.println("bookTrucks");
        int trucksForOrder = 0;
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.bookTrucks(trucksForOrder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUniqueOrderID method, of class Controller.
     */
    @Test
    public void testGetUniqueOrderID() {
        System.out.println("getUniqueOrderID");
        Controller instance = new Controller();
        int expResult = 0;
        int result = instance.getUniqueOrderID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkTruckAvailability method, of class Controller.
     */
    @Test
    public void testCheckTruckAvailability() {
        System.out.println("checkTruckAvailability");
        int startDate = 0;
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.checkTruckAvailability(startDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getlist method, of class Controller.
     */
    @Test
    public void testGetlist() {
        System.out.println("getlist");
        int i = 0;
        Controller instance = new Controller();
        Customer expResult = null;
        Customer result = instance.getlist(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListSize method, of class Controller.
     */
    @Test
    public void testGetListSize() {
        System.out.println("getListSize");
        Controller instance = new Controller();
        int expResult = 0;
        int result = instance.getListSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildCustomerList method, of class Controller.
     */
    @Test
    public void testBuildCustomerList() {
        System.out.println("buildCustomerList");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.buildCustomerList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomer method, of class Controller.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String name = "";
        String address = "";
        String email = "";
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.addCustomer(name, address, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveEditedCustomer method, of class Controller.
     */
    @Test
    public void testSaveEditedCustomer() {
        System.out.println("saveEditedCustomer");
        int cusID = 0;
        String cusName = "";
        String cusAddress = "";
        String cusEmail = "";
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.saveEditedCustomer(cusID, cusName, cusAddress, cusEmail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class Controller.
     */
    @Test
    public void testDeleteCustomer() {
        System.out.println("deleteCustomer");
        int cusID = 0;
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.deleteCustomer(cusID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printList method, of class Controller.
     */
    @Test
    public void testPrintList() {
        System.out.println("printList");
        Controller instance = new Controller();
        String expResult = "";
        String result = instance.printList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildPackageList method, of class Controller.
     */
    @Test
    public void testBuildPackageList() {
        System.out.println("buildPackageList");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.buildPackageList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPackage method, of class Controller.
     */
    @Test
    public void testAddPackage() {
        System.out.println("addPackage");
        int packageID = 0;
        String name = "";
        String description = "";
        int price = 0;
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.addPackage(packageID, name, description, price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPackageList method, of class Controller.
     */
    @Test
    public void testPrintPackageList() {
        System.out.println("printPackageList");
        Controller instance = new Controller();
        String expResult = "";
        String result = instance.printPackageList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
