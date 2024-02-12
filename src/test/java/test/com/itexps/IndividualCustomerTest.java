/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexps.training.bankmanagementsystem.IndividualCustomer;
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
public class IndividualCustomerTest {
    
    IndividualCustomer indiCust;
    
    public IndividualCustomerTest() {
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
        indiCust = new IndividualCustomer(1, 1, "Mi", "Tong", "mi@abc.com", "6126787890");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void can_testContractor(){
        assertEquals(indiCust.getIid(), 1);
        assertEquals(indiCust.getCid(), 1);
        assertEquals(indiCust.getFirst(), "Mi");
        assertEquals(indiCust.getLast(), "Tong");
        assertEquals(indiCust.getEmail(),"mi@abc.com");
        assertEquals(indiCust.getPhone(), "6126787890");
    }
    
    @Test
    public void can_testGetId(){
        indiCust.setIid(10);
        assertEquals(indiCust.getIid(), 10);
    }
    
    @Test
    public void can_testToString(){
        assertEquals(indiCust.toString(), "IndividualCustomer{iid=1}");
    }
    
}
