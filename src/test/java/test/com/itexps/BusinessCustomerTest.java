/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexps.training.bankmanagementsystem.BusinessCustomer;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author mimi
 */
public class BusinessCustomerTest {
    
    BusinessCustomer bizCust;
    
    public BusinessCustomerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        bizCust = new BusinessCustomer(1, 1, "US", "Bank", "usbank@abc.com", "6122341234");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void can_testContractor(){
        assertEquals(bizCust.getBid(), 1);
        assertEquals(bizCust.getCid(), 1);
        assertEquals(bizCust.getFirst(), "US");
        assertEquals(bizCust.getLast(), "Bank");
        assertEquals(bizCust.getEmail(),"usbank@abc.com");
        assertEquals(bizCust.getPhone(), "6122341234");
    }
    
    @Test
    public void can_testGetId(){
        bizCust.setBid(10);
        assertEquals(bizCust.getBid(), 10);
    }
    
    @Test
    public void can_testToString(){
        assertEquals(bizCust.toString(), "BusinessCustomer{bid=1}");
    }
    
}
