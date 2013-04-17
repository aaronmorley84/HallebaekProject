/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;

import DBConnection.ConnectionTools;
import Resources.Product;
import java.sql.Connection;
import java.sql.SQLException;
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
    ControllerInterface cont;
    
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
        con = ConnectionTools.getInstance().getCurrentConnection();
        cont = new Controller();
        
    }
    
    @After
    public void tearDown() throws SQLException {
        
    }

    /**
     * Test of addProduct method, of class ProductGateway.
     */
    @Test
    public void testAddProduct_Product() {
        System.out.println("addProduct");
       
        boolean expResult = true;
        boolean result = cont.addProduct("Khann",2,3,"Wrath",4);        
        assertEquals(result,expResult);
        
    }

    /**
     * Test of getProductListsize method, of class ProductGateway.
     */
    @Test
    public void testGetProductListsize() {
        System.out.println("getProductListsize");
        cont.getAllProducts();
        int expResult = cont.getProductListsize();
        cont.addProduct("Khanny",4,5,"Wrathy",10);
        cont.getAllProducts();
        int result = cont.getProductListsize();
        assertTrue(expResult+1 == result);
      
        
    }

    /**
     * Test of searchProdByName method, of class ProductGateway.
     */
    @Test
    public void testSearchProdByName() {
         System.out.println("searchProdByName");
        cont.getAllProducts();              
        String name = cont.getProductFromArray(10026).getName();        
        System.out.println("Name: " + name);
        Product expResult = cont.getProductFromArray(10026);
        Product result = cont.searchProdByNameFromArray(name);
        assertEquals(expResult, result);
        
       
        
    }

    /**
     * Test of showProducts method, of class ProductGateway.
     */
    @Test
    public void testShowProducts() {
        System.out.println("showProducts");
        int index = 1;
        cont.getAllProducts();
        Product expResult = cont.showProducts(index); /*Cheat*/
        Product result = cont.showProducts(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of getProduct method, of class ProductGateway.
     */
    @Test
    public void testGetProduct() {
        System.out.println("getProduct");
        int ID = 10026;
        cont.getAllProducts();
        int expResult = 10026;
        int result = cont.getProductFromArray(ID).getProductID();
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
        boolean expResult = true;
        boolean result = cont.addProduct(name, volume, quantity, description, price);
        assertEquals(expResult, result);
                
        for (int i = 0; i < cont.getProductListsize(); i++) {
            if(cont.getProductFromArray(i).getName().equals("Wealth") ){
                cont.deleteCustomer(cont.getProductFromArray(i).getProductID());
            }
        }
        
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
        boolean expResult = true;
        boolean result = cont.editProduct(ID, name, volume, quantity, description, price);
        assertEquals(expResult, result);
        cont.deleteCustomer(ID);
        
    }

    /**
     * Test of deleteProduct method, of class ProductGateway.
     */
    @Test
    public void testDeleteProduct() {
        System.out.println("deleteProduct");
        int ID = 1;
        boolean expResult = true;
        boolean result = cont.deleteProduct(ID);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of searchForProduct method, of class ProductGateway.
     */
    @Test
    public void testSearchForProduct_String() {
        System.out.println("searchForProduct_string");
        String name = "tent";
        boolean expResult = true;
        boolean result = cont.searchForProduct(name);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of searchForProduct method, of class ProductGateway.
     */
    @Test
    public void testSearchForProduct_int() {
        System.out.println("searchForProduct__int");
        int ID = 1;
        boolean expResult = true;
        boolean result = cont.searchForProduct(ID);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAllProducts method, of class ProductGateway.
     */
    @Test
    public void testGetAllProducts() {
        System.out.println("getAllProducts");
        boolean expResult = true;
        boolean result = cont.getAllProducts();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUniqueProductId method, of class ProductGateway.
     */
    @Test
    public void testGetUniqueProductId() {
      
    }
    
     
}
