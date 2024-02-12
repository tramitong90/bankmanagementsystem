/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexps.training.bankmanagementsystem.FullTimeEmployee;
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
public class FullTimeEmployeeTest {
    
    FullTimeEmployee fte;
    
    public FullTimeEmployeeTest() {
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
        
        fte = new FullTimeEmployee("ISN123", "healthcare", 1, "amy", "wood", "awood@abc.com", "1236785678", "FulllTime");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void can_testToString(){
        assertEquals(fte.toString(), "FullTimeEmployee{eid=1first=amylast=woodinsuranceNo=ISN123benefit=healthcare}");
    }
    
    @Test
    public void can_testContractor(){
        assertEquals(fte.getInsurance_no(), "ISN123");
        assertEquals(fte.getBenefit(), "healthcare");
        assertEquals(fte.getEid(), 1);
        assertEquals(fte.getFirst(), "amy");
        assertEquals(fte.getLast(), "wood");
        assertEquals(fte.getEmail(), "awood@abc.com");
        assertEquals(fte.getPhone(), "1236785678");
        assertEquals(fte.getType(), "FulllTime");
    }
    
    @Test
    public void can_getInsuranceNo(){
        fte.setInsurance_no("ISN9090");
        assertEquals(fte.getInsurance_no(), "ISN9090");
    }
    
    @Test
    public void can_getbenefit(){
        fte.setBenefit("dental");
        assertEquals(fte.getBenefit(), "dental");
    }
}
