/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexps.training.bankmanagementsystem.Account;
import com.itexps.training.bankmanagementsystem.CheckingAccount;
import com.itexps.training.bankmanagementsystem.Customer;
import com.itexps.training.bankmanagementsystem.SavingAccount;
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
public class CustomerTest {
    
    Customer customer;
    
    public CustomerTest() {
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
        customer = new Customer(1, "US", "Bank", "info@usbank.com", "6123122345");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testCustomerAccounts() {
        // Creating accounts
        CheckingAccount chekingAccount1 = new CheckingAccount("CA001", 500.0);
        SavingAccount savingAccount1 = new SavingAccount("SAC001", 1000.0);

        // Adding accounts to the customer
        ArrayList<Account> accounts = new ArrayList<>();
//        accounts.add(account1);
        accounts.add(savingAccount1);
         accounts.add(chekingAccount1);
        customer.setAccounts(accounts);

        // Verifying the customer's account list
        assertEquals(2, customer.getAccounts().size());
//        assertTrue(customer.getAccounts().contains(account1));
        assertTrue(customer.getAccounts().contains(savingAccount1));
        assertTrue(customer.getAccounts().contains(chekingAccount1));
    }
    
    @Test
    public void can_testDefaultContractor(){
        assertEquals(customer.getCid(), 1);
        assertEquals(customer.getFirst(), "US");
        assertEquals(customer.getLast(), "Bank");
        assertEquals(customer.getEmail(), "info@usbank.com");
        assertEquals(customer.getPhone(), "6123122345");
       
    }
    
    @Test
    public void can_testGetId(){
        customer.setCid(10);
        assertEquals(customer.getCid(), 10);
    }
    
    @Test
    public void can_testGetFirst(){
        customer.setFirst("Group2");
        assertEquals(customer.getFirst(), "Group2");
    }
    
    @Test
    public void can_testGetLast(){
        customer.setLast("Bank");
        assertEquals(customer.getLast(), "Bank");
    }
    
    @Test
    public void can_testGetEmail(){
        customer.setEmail("group2bank@bank.com");
        assertEquals(customer.getEmail(), "group2bank@bank.com");
    }
    
    @Test
    public void can_testGetPhone(){
        customer.setPhone("6123215432");
        assertEquals(customer.getPhone(), "6123215432");
    }
    
    @Test
    public void can_TestToString(){
        assertEquals(customer.toString(), "Customer{cid=1, first=US, last=Bank, email=info@usbank.com, phone=6123122345, accounts=[]}");
    }
    
    
  
}
