/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexps.training.bankmanagementsystem.PartTimeEmployee;
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
public class PartTimeEmployeeTest {
    
    PartTimeEmployee pte;
    
    public PartTimeEmployeeTest() {
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
        pte = new PartTimeEmployee(20, "W2", 40, 1, "amy", "nguyen", "anguyen@abc.com", "1236576789", "PartTime");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void can_testToString(){
        assertEquals(pte.toString(), "PartTimeEmployee{rate=20.0, contract_type=W2, hours_per_week=40.0}");
    }
    
    @Test
    public void can_testContractor(){
        assertEquals(pte.getRate(), 20.0f);
        assertEquals(pte.getContract_type(), "W2");
        assertEquals(pte.getHours_per_week(), 40.0f);
        assertEquals(pte.getEid(), 1);
        assertEquals(pte.getFirst(), "amy");
        assertEquals(pte.getLast(), "nguyen");
        assertEquals(pte.getEmail(), "anguyen@abc.com");
        assertEquals(pte.getPhone(), "1236576789");
        assertEquals(pte.getType(), "PartTime");
    }
    
    @Test
    public void can_getRate(){
        pte.setRate(40);
        assertEquals(pte.getRate(), 40.0f);
    }
    
    @Test
    public void can_getContractType(){
        pte.setContract_type("C2C");
        assertEquals(pte.getContract_type(), "C2C");
    }
    
    @Test
    public void can_getHoursPerWeek(){
        pte.setHours_per_week(50.0f);
        assertEquals(pte.getHours_per_week(), 50.0f);
    }
}
