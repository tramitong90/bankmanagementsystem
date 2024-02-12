/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexps.training.bankmanagementsystem.Bank;
import com.itexps.training.bankmanagementsystem.Customer;
import com.itexps.training.bankmanagementsystem.Employee;
import java.util.ArrayList;
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
public class BankTest {
    
    Bank bank;
    
    public BankTest() {
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
        bank = new Bank(1, "Group 2", "6122343456", "group2bank@abc.com");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void can_testDefaultContractor(){
        assertEquals(bank.getId(), 1);
        assertEquals(bank.getName(), "Group 2");
        assertEquals(bank.getPhone(), "6122343456");
        assertEquals(bank.getWebUrl(), "group2bank@abc.com");
    }
    
    @Test
    public void can_testGetId(){
        bank.setId(10);
        assertEquals(bank.getId(), 10);
    }
    
    @Test
    public void can_testGetName(){
        bank.setName("Group2 Company");
        assertEquals(bank.getName(), "Group2 Company");
    }
    
    @Test
    public void can_testGetPhone(){
        bank.setPhone("1232343456");
        assertEquals(bank.getPhone(), "1232343456");
    }
    
    @Test
    public void can_testGetWebUrl(){
        bank.setWebUrl("group2bank@abc.com");
        assertEquals(bank.getWebUrl(), "group2bank@abc.com");
    }
    
    @Test
    public void can_testToString(){
        
        assertEquals(bank.toString(), "Bank{id=1, name=Group 2, phone=6122343456, webUrl=group2bank@abc.com, employees=[], customers=[]}");
    }
    
    @Test
    public void testCustomer(){
        ArrayList<Customer> customerList = new ArrayList<>();
        Customer cust1 = new Customer(1, "US", "Bank", "usbank@gmail.com", "6122348987");
        Customer cust2 = new Customer(2, "Mi", "Tong", "mi@abc.com", "6127895678");
        
        customerList.add(cust1);
        customerList.add(cust2);
        
        bank.setCustomers(customerList);
        
        assertEquals(2, bank.getCustomers().size());
        
        assertEquals(1, bank.getCustomers().get(0).getCid());
        assertEquals("US", bank.getCustomers().get(0).getFirst());
    }
    
    @Test
    public void testEmployee(){
        ArrayList<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee(1, "Marry", "Smool", "msmool@gmail.com", "1232343456", "FullTime");
        Employee emp2 = new Employee(2, "John", "Smith", "jsmith@gmail.com", "6123212345", "PartTime");
        
        employeeList.add(emp1);
        employeeList.add(emp2);
        
        bank.setEmployees(employeeList);
        
        assertEquals(2, bank.getEmployees().size());
        
        assertEquals("Marry", bank.getEmployees().get(0).getFirst());
    }
}
