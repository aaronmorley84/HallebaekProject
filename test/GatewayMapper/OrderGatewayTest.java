/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;

import Resources.Product;
import Resources.Truck;
import Resources.TruckOrder;
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
public class OrderGatewayTest {
    
    public OrderGatewayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of currentOrder method, of class OrderGateway.
     */
    @Test
    public void testCurrentOrder() {
        System.out.println("currentOrder");
        OrderGateway instance = new OrderGateway();
        instance.currentOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of currentTruckOrder method, of class OrderGateway.
     */
    @Test
    public void testCurrentTruckOrder() {
        System.out.println("currentTruckOrder");
        OrderGateway instance = new OrderGateway();
        instance.currentTruckOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItemToOrderList method, of class OrderGateway.
     */
    @Test
    public void testAddItemToOrderList() {
        System.out.println("addItemToOrderList");
        Product prod = null;
        OrderGateway instance = new OrderGateway();
        boolean expResult = false;
        boolean result = instance.addItemToOrderList(prod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromOrderList method, of class OrderGateway.
     */
    @Test
    public void testRemoveFromOrderList() {
        System.out.println("removeFromOrderList");
        Product prod = null;
        OrderGateway instance = new OrderGateway();
        instance.removeFromOrderList(prod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToCustomerOrderTable method, of class OrderGateway.
     */
    @Test
    public void testAddToCustomerOrderTable() {
        System.out.println("addToCustomerOrderTable");
        int customerID = 0;
        String startDate = "";
        String finishDate = "";
        OrderGateway instance = new OrderGateway();
        boolean expResult = false;
        boolean result = instance.addToCustomerOrderTable(customerID, startDate, finishDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addOrderToDB method, of class OrderGateway.
     */
    @Test
    public void testAddOrderToDB() {
        System.out.println("addOrderToDB");
        OrderGateway instance = new OrderGateway();
        boolean expResult = false;
        boolean result = instance.addOrderToDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrders method, of class OrderGateway.
     */
    @Test
    public void testGetOrders() {
        System.out.println("getOrders");
        OrderGateway instance = new OrderGateway();
        boolean expResult = false;
        boolean result = instance.getOrders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderListSize method, of class OrderGateway.
     */
    @Test
    public void testGetOrderListSize() {
        System.out.println("getOrderListSize");
        OrderGateway instance = new OrderGateway();
        int expResult = 0;
        int result = instance.getOrderListSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTruckListSize method, of class OrderGateway.
     */
    @Test
    public void testGetTruckListSize() {
        System.out.println("getTruckListSize");
        OrderGateway instance = new OrderGateway();
        int expResult = 0;
        int result = instance.getTruckListSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTruckOrderListSize method, of class OrderGateway.
     */
    @Test
    public void testGetTruckOrderListSize() {
        System.out.println("getTruckOrderListSize");
        OrderGateway instance = new OrderGateway();
        int expResult = 0;
        int result = instance.getTruckOrderListSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTruck method, of class OrderGateway.
     */
    @Test
    public void testGetTruck() {
        System.out.println("getTruck");
        int index = 0;
        OrderGateway instance = new OrderGateway();
        Truck expResult = null;
        Truck result = instance.getTruck(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTruckOrder method, of class OrderGateway.
     */
    @Test
    public void testGetTruckOrder() {
        System.out.println("getTruckOrder");
        int index = 0;
        OrderGateway instance = new OrderGateway();
        TruckOrder expResult = null;
        TruckOrder result = instance.getTruckOrder(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrucksRequired method, of class OrderGateway.
     */
    @Test
    public void testGetTrucksRequired() {
        System.out.println("getTrucksRequired");
        int totalVolume = 0;
        OrderGateway instance = new OrderGateway();
        int expResult = 0;
        int result = instance.getTrucksRequired(totalVolume);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrucks method, of class OrderGateway.
     */
    @Test
    public void testGetTrucks() {
        System.out.println("getTrucks");
        OrderGateway instance = new OrderGateway();
        boolean expResult = false;
        boolean result = instance.getTrucks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkFreeTrucks method, of class OrderGateway.
     */
    @Test
    public void testCheckFreeTrucks() {
        System.out.println("checkFreeTrucks");
        String date = "";
        OrderGateway instance = new OrderGateway();
        instance.checkFreeTrucks(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of commitTruckOrder method, of class OrderGateway.
     */
    @Test
    public void testCommitTruckOrder() {
        System.out.println("commitTruckOrder");
        OrderGateway instance = new OrderGateway();
        boolean expResult = false;
        boolean result = instance.commitTruckOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAssemblerAvailable method, of class OrderGateway.
     */
    @Test
    public void testCheckAssemblerAvailable() {
        System.out.println("checkAssemblerAvailable");
        int startDate = 0;
        OrderGateway instance = new OrderGateway();
        boolean expResult = false;
        boolean result = instance.checkAssemblerAvailable(startDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUniqueOrderID method, of class OrderGateway.
     */
    @Test
    public void testGetUniqueOrderID() {
        System.out.println("getUniqueOrderID");
        OrderGateway instance = new OrderGateway();
        int expResult = 0;
        int result = instance.getUniqueOrderID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderBalance method, of class OrderGateway.
     */
    @Test
    public void testGetOrderBalance() {
        System.out.println("getOrderBalance");
        OrderGateway instance = new OrderGateway();
        int expResult = 0;
        int result = instance.getOrderBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
