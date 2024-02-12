/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexps.training.bankmanagementsystem.CheckingAccount;
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
public class CheckingAccountTest {
    
    CheckingAccount checkAccount;
    
    
    public CheckingAccountTest() {
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
            checkAccount = new CheckingAccount("CAC123", 10000);
            
           
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void can_getBalance(){
        checkAccount.setBalance(10000);
        assertEquals(10000.0d, checkAccount.getBalance());
    }
    
    @Test
    public void can_getAccountNumber(){
        checkAccount.setCAC("CAC8989");
        assertEquals("CAC8989", checkAccount.getAccountNumber());
    }
    
    @Test
    public void can_getCAC(){
        checkAccount.setCAC("CAC9090");
        
        assertEquals(checkAccount.getCAC(), "CAC9090");
    }
    
    @Test
    public void can_testDefaultContractor(){
        
        assertEquals(checkAccount.getCAC(), "CAC123");
        assertEquals(checkAccount.getBalance(), 10000.0d);
    }
    
    @Test
    public void can_testToString(){
        
        assertEquals(checkAccount.toString(), "CheckingAccount{CAC=CAC123, balance=10000.0}");
    }
    
    @Test
    public void can_testDeposit(){
        
        checkAccount.deposit(2000);
        assertEquals(checkAccount.getBalance(), 12000.0d);
        
    }
    
    @Test
    public void can_testWithdraw(){
        
        checkAccount.withdraw(2000);
        assertEquals(checkAccount.getBalance(), 8000.0d);
        
    }
    
    @Test
    public void can_testInterestRate(){
        
        checkAccount.interestRate();
        assertEquals(checkAccount.getBalance(), 10105.0d);
        
    }
    
}
