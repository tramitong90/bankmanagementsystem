/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexps.training.bankmanagementsystem.Employee;
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
public class EmployeeTest {
    
    Employee employee;
    
    public EmployeeTest() {
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
        employee = new Employee(1, "Mi", "Tong", "mi@abc.com", "6123212345", "FullTime");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void can_testToString(){
        assertEquals(employee.toString(), "Employee{eid=1, first=Mi, last=Tong, email=mi@abc.com, phone=6123212345, type=FullTime}");
    }
    
    @Test
    public void can_testContractor(){
        assertEquals(employee.getEid(), 1);
        assertEquals(employee.getFirst(), "Mi");
        assertEquals(employee.getLast(), "Tong");
        assertEquals(employee.getEmail(), "mi@abc.com");
        assertEquals(employee.getPhone(), "6123212345");
        assertEquals(employee.getType(), "FullTime");
    }
    
    @Test
    public void can_getEid(){
        employee.setEid(10);
        assertEquals(employee.getEid(), 10);
    }
    
    @Test
    public void can_getFirst(){
        employee.setFirst("Marry");
        assertEquals(employee.getFirst(), "Marry");
    }
    
    @Test
    public void can_getLast(){
        employee.setLast("Smith");
        assertEquals(employee.getLast(), "Smith");
    }
    
    @Test
    public void can_getEmail(){
        employee.setEmail("marry@abc.com");
        assertEquals(employee.getEmail(), "marry@abc.com");
    }
    
    @Test
    public void can_getPhone(){
        employee.setPhone("1232343456");
        assertEquals(employee.getPhone(), "1232343456");
    }
    
    @Test
    public void can_getSSN(){
        employee.setSSN("1232343457");
        assertEquals(employee.getSSN(), "1232343457");
    }
    
    @Test
    public void can_getType(){
        employee.setType("PartTime");
        assertEquals(employee.getType(), "PartTime");
    }
    

}
