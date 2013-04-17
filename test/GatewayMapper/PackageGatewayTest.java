/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;

import DBConnection.ConnectionTools;
import Resources.Packages;
import Resources.Product;
import java.sql.Connection;
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
public class PackageGatewayTest {
    Connection con;
    ControllerInterface cont;
    
    public PackageGatewayTest() {
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
    public void tearDown() {
    }

    /**
     * Test of getPackageList method, of class PackageGateway.
     */
    @Test
    public void testGetPackageList() {
        System.out.println("getPackageList");
        int i = 0;
        PackageGateway instance = new PackageGateway();
        Packages expResult = null;
        Packages result = instance.getPackageList(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPackageListSize method, of class PackageGateway.
     */
    @Test
    public void testGetPackageListSize() {
        System.out.println("getPackageListSize");
        PackageGateway instance = new PackageGateway();
        int expResult = 0;
        int result = instance.getPackageListSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPackageProductList method, of class PackageGateway.
     */
    @Test
    public void testGetPackageProductList() {
        System.out.println("getPackageProductList");
        int i = 0;
        PackageGateway instance = new PackageGateway();
        Product expResult = null;
        Product result = instance.getPackageProductList(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPackageProductListSize method, of class PackageGateway.
     */
    @Test
    public void testGetPackageProductListSize() {
        System.out.println("getPackageProductListSize");
        PackageGateway instance = new PackageGateway();
        int expResult = 0;
        int result = instance.getPackageProductListSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentPackage method, of class PackageGateway.
     */
    @Test
    public void testSetCurrentPackage() {
        System.out.println("setCurrentPackage");
        Packages pack = null;
        PackageGateway instance = new PackageGateway();
        instance.setCurrentPackage(pack);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItemToPackageList method, of class PackageGateway.
     */
    @Test
    public void testAddItemToPackageList() {
        System.out.println("addItemToPackageList");
        Product prod = null;
        PackageGateway instance = new PackageGateway();
        boolean expResult = false;
        boolean result = instance.addItemToPackageList(prod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromPackageList method, of class PackageGateway.
     */
    @Test
    public void testRemoveFromPackageList() {
        System.out.println("removeFromPackageList");
        Product prod = null;
        PackageGateway instance = new PackageGateway();
        instance.removeFromPackageList(prod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildPackageList method, of class PackageGateway.
     */
    @Test
    public void testBuildPackageList() {
        System.out.println("buildPackageList");
        PackageGateway instance = new PackageGateway();
        boolean expResult = false;
        boolean result = instance.buildPackageList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPackage method, of class PackageGateway.
     */
    @Test
    public void testAddPackage() {
        System.out.println("addPackage");
        String name = "";
        String description = "";
        int price = 0;
        PackageGateway instance = new PackageGateway();
        boolean expResult = false;
        boolean result = instance.addPackage(name, description, price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printList method, of class PackageGateway.
     */
    @Test
    public void testPrintList() {
        System.out.println("printList");
        PackageGateway instance = new PackageGateway();
        String expResult = "";
        String result = instance.printList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProductsToPackageInDB method, of class PackageGateway.
     */
    @Test
    public void testAddProductsToPackageInDB() {
        System.out.println("addProductsToPackageInDB");
        PackageGateway instance = new PackageGateway();
        boolean expResult = false;
        boolean result = instance.addProductsToPackageInDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadPackageProducts method, of class PackageGateway.
     */
    @Test
    public void testLoadPackageProducts() {
        System.out.println("loadPackageProducts");
        PackageGateway instance = new PackageGateway();
        boolean expResult = false;
        boolean result = instance.loadPackageProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePackageProducts method, of class PackageGateway.
     */
    @Test
    public void testDeletePackageProducts() {
        System.out.println("deletePackageProducts");
        PackageGateway instance = new PackageGateway();
        boolean expResult = false;
        boolean result = instance.deletePackageProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePackage method, of class PackageGateway.
     */
    @Test
    public void testDeletePackage() {
        System.out.println("deletePackage");
        PackageGateway instance = new PackageGateway();
        boolean expResult = false;
        boolean result = instance.deletePackage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
