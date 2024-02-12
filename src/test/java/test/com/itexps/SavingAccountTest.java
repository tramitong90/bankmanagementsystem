/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexps.training.bankmanagementsystem.SavingAccount;
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
public class SavingAccountTest {
    
    SavingAccount savingAccount;
    
    public SavingAccountTest() {
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
        savingAccount = new SavingAccount("SAC123", 250000);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void can_getBalance(){
        savingAccount.setBalance(10000);
        assertEquals(10000.0d, savingAccount.getBalance());
    }
    
    @Test
    public void can_getAccountNumber(){
        savingAccount.setSAC("CAC8989");
        assertEquals("CAC8989", savingAccount.getAccountNumber());
    }
    
    @Test
    public void can_getSAC(){
        savingAccount.setSAC("CAC9090");
        
        assertEquals(savingAccount.getSAC(), "CAC9090");
    }
    
    @Test
    public void can_testDefaultContractor(){
        
        assertEquals(savingAccount.getSAC(), "SAC123");
        assertEquals(savingAccount.getBalance(), 250000.0d);
    }
    
    @Test
    public void can_testToString(){
        
        assertEquals(savingAccount.toString(), "SavingAccount{SAC=SAC123, balance=250000.0}");
    }
    
    @Test
    public void can_testDeposit(){
        
        savingAccount.deposit(2000);
        assertEquals(savingAccount.getBalance(), 252000.0d);
        
    }
    
    @Test
    public void can_testWithdraw(){
        
        savingAccount.withdraw(2000);
        assertEquals(savingAccount.getBalance(), 248000.0d);
        
    }
    
    @Test
    public void can_testInterestRate(){
        
        savingAccount.interestRate();
        assertEquals(savingAccount.getBalance(), 262500.0d);
        
    }
}
