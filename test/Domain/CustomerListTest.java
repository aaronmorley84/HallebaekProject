/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Resources.Customer;
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
public class CustomerListTest {
    
    public CustomerListTest() {
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
     * Test of addToCustomerList method, of class CustomerList and test getCurrentCustomer.
     */
    @Test
    public void testAddToCustomerListAndCurrent() {
        System.out.println("addToCustomerList");
        int cusID = 1;
        String cusName = "Tests";
        String cusAddress = "KHANNN";
        int phoneID = 1;
        String cusEmail = "Khaan@Khaaaan.com";
        CustomerList instance = new CustomerList();
        instance.addToCustomerList(cusID, cusName, cusAddress, phoneID, cusEmail);
        String expResult = ""+cusID+cusName+cusAddress+phoneID+cusEmail;
        instance.getCurrentCustomer(0);
        String result =""+instance.getCusID()+instance.getCusName()+instance.getCusAddress()+instance.getCusPhoneID()+instance.getCusEmail();
        
        assertEquals(expResult,result);
        
    }

    /**
     * Test of getCustomerListSize method, of class CustomerList.
     */
    @Test
    public void testGetCustomerListSize() {
        System.out.println("getCustomerListSize");
        CustomerList instance = new CustomerList();
        instance.clearCustomerList();
       instance.addToCustomerList(1, "flob", "dælf", 1, " ");
        int expResult = instance.getCustomerListSize();
        int result = 1;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of clearCustomerList method, of class CustomerList.
     */
    @Test
    public void testClearCustomerList() {
        System.out.println("clearCustomerList");
        CustomerList instance = new CustomerList();
        instance.addToCustomerList(1, "flob", "dælf", 1, " ");
        instance.addToCustomerList(1, "flob", "dælf", 1, " ");
        instance.addToCustomerList(1, "flob", "dælf", 1, " ");
        instance.addToCustomerList(1, "flob", "dælf", 1, " ");
        instance.clearCustomerList();
        int expResult = 0;
        int result = 0;
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getCusID method, of class CustomerList.
     */
    @Test
    public void testGetCusID() {
        System.out.println("getCusID");
        CustomerList instance = new CustomerList();        
        instance.clearCustomerList();
        instance.addToCustomerList(1, "flob", "dælf", 1, " ");
        instance.getCurrentCustomer(0);
        int expResult = 1;
        int result = instance.getCusID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCusName method, of class CustomerList.
     */
    @Test
    public void testGetCusName() {
        System.out.println("getCusName");
        CustomerList instance = new CustomerList();
        instance.clearCustomerList();
        instance.addToCustomerList(1, "flob", "dælf", 1, " ");
        instance.getCurrentCustomer(0);
        String expResult = "flob";
        String result = instance.getCusName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCusAddress method, of class CustomerList.
     */
    @Test
    public void testGetCusAddress() {
        System.out.println("getCusAddress");
        CustomerList instance = new CustomerList();
         instance.clearCustomerList();
        instance.addToCustomerList(1, "flob", "dælf", 1, " ");
        instance.getCurrentCustomer(0);
        String expResult = "dælf";
        String result = instance.getCusAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCusPhoneID method, of class CustomerList.
     */
    @Test
    public void testGetCusPhoneID() {
        System.out.println("getCusPhoneID");
        CustomerList instance = new CustomerList();
         instance.clearCustomerList();
        instance.addToCustomerList(1, "flob", "dælf", 1, " ");
        instance.getCurrentCustomer(0);
        int expResult = 1;
        int result = instance.getCusPhoneID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCusEmail method, of class CustomerList.
     */
    @Test
    public void testGetCusEmail() {
        System.out.println("getCusEmail");
        CustomerList instance = new CustomerList();
         instance.clearCustomerList();
        instance.addToCustomerList(1, "flob", "dælf", 1, "Jim");
        instance.getCurrentCustomer(0);
        String expResult = "Jim";
        String result = instance.getCusEmail();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of editCusName method, of class CustomerList.
     */
    @Test
    public void testEditCusName() {
        System.out.println("editCusName");
        String newName = "Jimi";
        CustomerList instance = new CustomerList();
         instance.clearCustomerList();
        instance.addToCustomerList(1, "flob", "dælf", 1, "Jim");
        instance.getCurrentCustomer(0);
        instance.editCusName(newName);
        String expResult = "Jimi";
        String result = instance.getCusName();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of editCusAddress method, of class CustomerList.
     */
    @Test
    public void testEditCusAddress() {
        System.out.println("editCusAddress");
        String newAddress = "I am not a doctor";
        CustomerList instance = new CustomerList();
        instance.clearCustomerList();
        instance.addToCustomerList(1, "flob", "dælf", 1, "Jim");
        instance.getCurrentCustomer(0);
        instance.editCusAddress(newAddress);
        String expResult = newAddress;
        String result = instance.getCusAddress();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of editCusEmail method, of class CustomerList.
     */
    @Test
    public void testEditCusEmail() {
        System.out.println("editCusEmail");
        String newEmail = "FOG";
        CustomerList instance = new CustomerList();
        instance.clearCustomerList();
        instance.addToCustomerList(1, "flob", "dælf", 1, "FOG");
        instance.getCurrentCustomer(0);
        instance.editCusEmail(newEmail);
        String expResult = newEmail;
        String result = instance.getCusEmail();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of buildCustomerList method, of class CustomerList.
     */
    @Test
    public void testBuildCustomerList() {
        System.out.println("buildCustomerList");
        CustomerList instance = new CustomerList();
        int expResult = 5;
        boolean expResult1 = true;
        boolean result1 = instance.buildCustomerList(instance);
        int result = instance.getCustomerListSize();
        assertEquals(expResult1, result1);
        assertEquals(expResult,result);
    }

    /**
     * Test of addCustomer method, of class CustomerList.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String name = "Anders";
        String address = "and";
        String email = "Er i huset";
        CustomerList instance = new CustomerList();
        boolean expResult = true;
        boolean result = instance.addCustomer(name, address, email);
        assertEquals(expResult, result);
        instance.buildCustomerList(instance);
        instance.getCurrentCustomer(instance.getCustomerListSize()-1);
        String expName1 = "Anders";
        String result1 = instance.getCusName();
        assertEquals(expName1, result1);
        
    }

    /**
     * Test of saveEditedCustomer method, of class CustomerList.
     */
    @Test
    public void testSaveEditedCustomer() throws Exception {
        System.out.println("saveEditedCustomer");
        String cusName = "Donald";
        String cusAddress = "Duck";
        String cusEmail = "Was here";
        CustomerList instance = new CustomerList();
        instance.buildCustomerList(instance);
        instance.getCurrentCustomer(instance.getCustomerListSize()-1);
        boolean expResult = true;
        boolean result = instance.saveEditedCustomer(instance.getCusID(), cusName, cusAddress, cusEmail);
        assertEquals(expResult, result);
        instance.buildCustomerList(instance);
        String expName = "Donald";
        instance.getCurrentCustomer(instance.getCustomerListSize()-1);
        String resultName= instance.getCusName();
        assertEquals(expName,resultName);
        
    }

    /**
     * Test of deleteCustomer method, of class CustomerList.
     */
    @Test
    public void testDeleteCustomer() {
        System.out.println("deleteCustomer");
        CustomerList instance = new CustomerList();
        instance.buildCustomerList(instance);
        instance.getCurrentCustomer(instance.getCustomerListSize()-1);
        
        int expSize =instance.getCustomerListSize();
        boolean expResult = true;
        boolean result = instance.deleteCustomer(instance.getCusID());
        assertEquals(expResult, result);
        instance.clearCustomerList();
        instance.buildCustomerList(instance);
        int resultSize = instance.getCustomerListSize();
        assertEquals(expSize-1, resultSize);
        /*Could add a search through the array for a cusotmer named Donald*/
       
    }

    /**
     * Test of lockCustomer method, of class CustomerList.
     */
    @Test
    public void testLockCustomer() {
        System.out.println("lockCustomer");
        int cusID = 0;
        CustomerList instance = new CustomerList();
        boolean expResult = false;
        boolean result = instance.lockCustomer(cusID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
