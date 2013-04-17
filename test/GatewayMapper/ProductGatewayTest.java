/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;

import Resources.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */
public class ProductGatewayTest {
    Connection con;
    private String id ="CLCOSV12E2";
    private String pw = "CLCOSV12E2";
    Controller cont;
    
    public ProductGatewayTest() {
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
        FixtureForTestOfProductGateway.setUp(con);
        cont = new Controller();
    
        
    }
    
    @After
    public void tearDown() {
         releaseConnection();
    }

    /**
     * Test of addProduct method, of class ProductGateway.
     */
    @Test
    public void testAddProduct_Product() {
        System.out.println("addProduct");
        Product product = new Product(2,"Khann",2,3,"Wrath",4);
        ProductGateway instance = new ProductGateway();
        int result = instance.getProductListsize();
        instance.addProduct(product);
        assertTrue(result+1 == instance.getProductListsize());
        
    }

    /**
     * Test of getProductListsize method, of class ProductGateway.
     */
    @Test
    public void testGetProductListsize() {
        System.out.println("getProductListsize");
        ProductGateway instance = new ProductGateway();
        int expResult = instance.getProductListsize();
        instance.addProduct(new Product(0,"Khanny",4,5,"Wrathy",10));
        int result = instance.getProductListsize();
        assertTrue(expResult+1 == result);
        
    }

    /**
     * Test of searchProdByName method, of class ProductGateway.
     */
    @Test
    public void testSearchProdByName() {
        System.out.println("searchProdByName");
        String name = "tent";
        ProductGateway instance = new ProductGateway();
        Product expResult = null;
        Product result = instance.searchProdByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showProducts method, of class ProductGateway.
     */
    @Test
    public void testShowProducts() {
        System.out.println("showProducts");
        int index = 0;
        ProductGateway instance = new ProductGateway();
        String expResult = "(1,tent,1,1,a tent,100)";
        Product result = instance.showProducts(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of getProduct method, of class ProductGateway.
     */
    @Test
    public void testGetProduct() {
        System.out.println("getProduct");
        int ID = 1;
        ProductGateway instance = new ProductGateway();
        int expResult = 1;
        Product result = instance.getProduct(ID);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addProduct method, of class ProductGateway.
     */
    @Test
    public void testAddProduct_5args() {
        System.out.println("addProduct");
        String name = "Wealth";
        int volume = 100;
        int quantity = 3;
        String description = "For the fuck";
        int price = 200;
        ProductGateway instance = new ProductGateway();
        boolean expResult = true;
        boolean result = instance.addProduct(name, volume, quantity, description, price);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of editProduct method, of class ProductGateway.
     */
    @Test
    public void testEditProduct() {
        System.out.println("editProduct");
        int ID = 2;
        String name = "chairs";
        int volume = 3;
        int quantity = 13;
        String description = "Changed";
        int price = 12;
        ProductGateway instance = new ProductGateway();
        boolean expResult = true;
        boolean result = instance.editProduct(ID, name, volume, quantity, description, price);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteProduct method, of class ProductGateway.
     */
    @Test
    public void testDeleteProduct() {
        System.out.println("deleteProduct");
        int ID = 1;
        ProductGateway instance = new ProductGateway();
        boolean expResult = true;
        boolean result = instance.deleteProduct(ID);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of searchForProduct method, of class ProductGateway.
     */
    @Test
    public void testSearchForProduct_String() {
        System.out.println("searchForProduct_string");
        String name = "tent";
        ProductGateway instance = new ProductGateway();
        instance.getAllProducts();
        boolean expResult = true;
        boolean result = instance.searchForProduct(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchForProduct method, of class ProductGateway.
     */
    @Test
    public void testSearchForProduct_int() {
        System.out.println("searchForProduct__int");
        int ID = 0;
        ProductGateway instance = new ProductGateway();
        boolean expResult = false;
        boolean result = instance.searchForProduct(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllProducts method, of class ProductGateway.
     */
    @Test
    public void testGetAllProducts() {
        System.out.println("getAllProducts");
        ProductGateway instance = new ProductGateway();
        boolean expResult = false;
        boolean result = instance.getAllProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUniqueProductId method, of class ProductGateway.
     */
    @Test
    public void testGetUniqueProductId() {
        System.out.println("getUniqueProductId");
        ProductGateway instance = new ProductGateway();
        int expResult = 0;
        int result = instance.getUniqueProductId();
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
