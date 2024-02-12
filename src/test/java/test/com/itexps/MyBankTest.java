/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexps.training.bankmanagementsystem.MyBank;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
//import com.itexps.training.bankmanagementsystem.Employee;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author Tanka2
 */
public class MyBankTest {

    MyBank myBank = new MyBank();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    public MyBankTest() {
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
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    public void testDefaultConstructor() {

        assertNotNull(myBank); // Assert that the object is created successfully
//        assertEquals(myBank.getEmployees().size(), 0); // Assert empty employee list initially
//        assertEquals(myBank.getCustomers().size(), 0); // Assert empty customer list initially
//        // Additional assertions for default initialization of arrays or collections if present
    }
//

    @Test
    public void testMainMethod() {

        // Simulate user input
        String input = "12\n"; // Simulate choosing option 16 to exit
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);

    }
    
    @Test
    public void testAddFullTimeEmployeeDetails() {
        // Arrange
        MyBank myBank = new MyBank();

        // Simulate user input
        String input = "1\n1\nMi\nTong\nmi@abc.com\n6122343456\n1234\nFullTime\n1233\nhealthcare\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
    
    @Test
    public void testAddPartTimeEmployeeDetails() {

        // Simulate user input
        String input = "1\n2\nMi\nTong\nmi@abc.com\n1233233456\n4444\nPartTime\n40\nW2\n40\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
    
    @Test
    public void testSearchEmployee() {

        // Simulate user input
        String input = "2\n2\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
    
    @Test
    public void testSaveEmployee() {

        // Simulate user input
        String input = "3\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
    
    @Test
    public void testViewAllEmployees() {

        // Simulate user input
        String input = "4\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
    
    @Test
    public void testViewAllEmployees_Fail() {

        // Simulate user input
        String input = "4\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
    
    @Test
    public void testAddBusinessCustomer() {

        // Simulate user input
        String input = "8\n1\nMi\nTong\nmi@email.com\n1232343456\nBusiness\n1\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
    
    @Test
    public void testAddIndividualCustomer() {

        // Simulate user input
        String input = "8\n2\nQuang\nQuang\nquang@email.com\n1232343456\nIndividual\n1\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
    
    @Test
    public void testSearchCustomer() {

        // Simulate user input
        String input = "9\n1\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
     @Test
    public void testAddCheckingAccount() {

        // Simulate user input
        String input = "5\n1\nChecking\n1\n10000\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
    
    @Test
    public void testAddSavingAccount() {

        // Simulate user input
        String input = "5\n2\nSaving\n1\n555555\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
    
    
     @Test
    public void testViewAllAccounts() {

        // Simulate user input
        String input = "7\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
    
    @Test
    public void testSaveCustomerAccount() {

        // Simulate user input
        String input = "10\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
    
    @Test
    public void testViewAllCustomers() {

        // Simulate user input
        String input = "11\n12\n";
        InputStream sysInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       

        // Act
        myBank.main(new String[]{});

        // Restore System.in to its original state
        System.setIn(sysInBackup);
    }
    
    
    
    
    
    
    

//    @Test
//    void testAddFullTimeEmployeeDetails() {
//        
//        String input = "1\n1\nMi\nTong\nmi@abc.com\n6122343456\n1234\nFullTime\n1233\nhealthcare\n12\n";
//        System.setIn(new ByteArrayInputStream(input.getBytes()));
//
//        MyBank.main(new String[]{});
//
//        String expectedOutput = "----------------Welcome to Bank Management System-----------------\n"
//                + "Please select one of the options below:\n"
//                + "1. Add Employee Details\n"
//                + "2. Search Employee\n"
//                + "3. Save Employees\n"
//                + "4. View All Employees\n"
//                + "\n"
//                + "5. Add Account Details\n"
//                + "6. Search Account\n"
//                + "7. View all Accounts\n"
//                + "\n"
//                + "8. Add Customer Details\n"
//                + "9. Search Customer\n"
//                + "10. Save Customers & Accounts\n"
//                + "11. View All Customers\n"
//                + "\n"
//                + "12. Exit Banking Management System\n"
//                + "Enter your choice: \n"
//                + "=====Add Employee Details=====\n"
//                + "Enter employee id: \n"
//                + "Enter employees first name: \n"
//                + "Enter employees last name: \n"
//                + "Enter employees email: \n"
//                + "Enter employees phone: \n"
//                + "Enter employees SSN: \n"
//                + "Enter employee type: \n"
//                + "Enter employees insurance number: \n"
//                + "Enter employees benefit: \n"
//                + "Bank{id=1, name=Group 2, phone=612 234 3456, webUrl=group2bank, employees=[FullTimeEmployee{eid=1first=Milast=TonginsuranceNo=1233benefit=healthcare}], customers=[]}\n"
//                + "----------------Welcome to Bank Management System-----------------\n"
//                + "Please select one of the options below:\n"
//                + "1. Add Employee Details\n"
//                + "2. Search Employee\n"
//                + "3. Save Employees\n"
//                + "4. View All Employees\n"
//                + "\n"
//                + "5. Add Account Details\n"
//                + "6. Search Account\n"
//                + "7. View all Accounts\n"
//                + "\n"
//                + "8. Add Customer Details\n"
//                + "9. Search Customer\n"
//                + "10. Save Customers & Accounts\n"
//                + "11. View All Customers\n"
//                + "\n"
//                + "12. Exit Banking Management System\n"
//                + "Enter your choice: \n"
//                + "Exit from bank management system.\n";
//        assertEquals(expectedOutput, outContent.toString());
//    }
    
//     @Test
//    void testAddPartTimeEmployeeDetails() {
//        
//         String input = "1\n2\nMi\nTong\nmi@abc.com\n1233233456\n4444\nPartTime\n40\nW2\n40\n12\n";
//         System.setIn(new ByteArrayInputStream(input.getBytes()));
//
//         MyBank.main(new String[]{});
//
//         String expectedOutput = "----------------Welcome to Bank Management System-----------------\n"
//                 + "Please select one of the options below:\n"
//                 + "1. Add Employee Details\n"
//                 + "2. Search Employee\n"
//                 + "3. Save Employees\n"
//                 + "4. View All Employees\n"
//                 + "\n"
//                 + "5. Add Account Details\n"
//                 + "6. Search Account\n"
//                 + "7. View all Accounts\n"
//                 + "\n"
//                 + "8. Add Customer Details\n"
//                 + "9. Search Customer\n"
//                 + "10. Save Customers & Accounts\n"
//                 + "11. View All Customers\n"
//                 + "\n"
//                 + "12. Exit Banking Management System\n"
//                 + "Enter your choice: \n"
//                 + "=====Add Employee Details=====\n"
//                 + "Enter employee id: \n"
//                 + "Enter employees first name: \n"
//                 + "Enter employees last name: \n"
//                 + "Enter employees email: \n"
//                 + "Enter employees phone: \n"
//                 + "Enter employees SSN: \n"
//                 + "Enter employee type: \n"
//                 + "Enter employees insurance number: \n"
//                 + "Enter employees benefit: \n"
//                 + "Bank{id=1, name=Group 2, phone=612 234 3456, webUrl=group2bank, employees=[FullTimeEmployee{eid=1first=Milast=TonginsuranceNo=1233benefit=healthcare}], customers=[]}\n"
//                 + "----------------Welcome to Bank Management System-----------------\n"
//                 + "Please select one of the options below:\n"
//                 + "1. Add Employee Details\n"
//                 + "2. Search Employee\n"
//                 + "3. Save Employees\n"
//                 + "4. View All Employees\n"
//                 + "\n"
//                 + "5. Add Account Details\n"
//                 + "6. Search Account\n"
//                 + "7. View all Accounts\n"
//                 + "\n"
//                 + "8. Add Customer Details\n"
//                 + "9. Search Customer\n"
//                 + "10. Save Customers & Accounts\n"
//                 + "11. View All Customers\n"
//                 + "\n"
//                 + "12. Exit Banking Management System\n"
//                 + "Enter your choice: \n"
//                 + "Exit from bank management system.\n"
//                 + "----------------Welcome to Bank Management System-----------------\n"
//                 + "Please select one of the options below:\n"
//                 + "1. Add Employee Details\n"
//                 + "2. Search Employee\n"
//                 + "3. Save Employees\n"
//                 + "4. View All Employees\n"
//                 + "\n"
//                 + "5. Add Account Details\n"
//                 + "6. Search Account\n"
//                 + "7. View all Accounts\n"
//                 + "\n"
//                 + "8. Add Customer Details\n"
//                 + "9. Search Customer\n"
//                 + "10. Save Customers & Accounts\n"
//                 + "11. View All Customers\n"
//                 + "\n"
//                 + "12. Exit Banking Management System\n"
//                 + "Enter your choice: \n"
//                 + "=====Add Employee Details=====\n"
//                 + "Enter employee id: \n"
//                 + "Enter employees first name: \n"
//                 + "Enter employees last name: \n"
//                 + "Enter employees email: \n"
//                 + "Enter employees phone: \n"
//                 + "Enter employees SSN: \n"
//                 + "Enter employee type: \n"
//                 + "Enter employees rate: \n"
//                 + "Enter employees contract type: \n"
//                 + "Enter employees hours per week: \n"
//                 + "Bank{id=1, name=Group 2, phone=612 234 3456, webUrl=group2bank, employees=[PartTimeEmployee{rate=40.0, contract_type=W2, hours_per_week=40.0}], customers=[]}\n"
//                 + "----------------Welcome to Bank Management System-----------------\n"
//                 + "Please select one of the options below:\n"
//                 + "1. Add Employee Details\n"
//                 + "2. Search Employee\n"
//                 + "3. Save Employees\n"
//                 + "4. View All Employees\n"
//                 + "\n"
//                 + "5. Add Account Details\n"
//                 + "6. Search Account\n"
//                 + "7. View all Accounts\n"
//                 + "\n"
//                 + "8. Add Customer Details\n"
//                 + "9. Search Customer\n"
//                 + "10. Save Customers & Accounts\n"
//                 + "11. View All Customers\n"
//                 + "\n"
//                 + "12. Exit Banking Management System\n"
//                 + "Enter your choice: \n"
//                 + "Exit from bank management system.\n";
//        assertEquals(expectedOutput, outContent.toString());
//    }

//    @Test
//    void testSearchEmployee(){
//        String input = "2\n1\n12\n";
//        System.setIn(new ByteArrayInputStream(input.getBytes()));
//        
//        MyBank.main(new String[]{});
//        
//        String expectedOutput = "----------------Welcome to Bank Management System-----------------\n"
//                + "Please select one of the options below:\n"
//                + "1. Add Employee Details\n"
//                + "2. Search Employee\n"
//                + "3. Save Employees\n"
//                + "4. View All Employees\n"
//                + "\n"
//                + "5. Add Account Details\n"
//                + "6. Search Account\n"
//                + "7. View all Accounts\n"
//                + "\n"
//                + "8. Add Customer Details\n"
//                + "9. Search Customer\n"
//                + "10. Save Customers & Accounts\n"
//                + "11. View All Customers\n"
//                + "\n"
//                + "12. Exit Banking Management System\n"
//                + "Enter your choice: \n"
//                + "=====Add Employee Details=====\n"
//                + "Enter employee id: \n"
//                + "Enter employees first name: \n"
//                + "Enter employees last name: \n"
//                + "Enter employees email: \n"
//                + "Enter employees phone: \n"
//                + "Enter employees SSN: \n"
//                + "Enter employee type: \n"
//                + "Enter employees insurance number: \n"
//                + "Enter employees benefit: \n"
//                + "Bank{id=1, name=Group 2 , phone=612 234 3456, webUrl=group2bank., employees=[FullTimeEmployee{eid=1first=Milast=TonginsuranceNo=1233benefit=healthcare}], customers=[]}\n"
//                + "----------------Welcome to Bank Management System-----------------\n"
//                + "Please select one of the options below:\n"
//                + "1. Add Employee Details\n"
//                + "2. Search Employee\n"
//                + "3. Save Employees\n"
//                + "4. View All Employees\n"
//                + "\n"
//                + "5. Add Account Details\n"
//                + "6. Search Account\n"
//                + "7. View all Accounts\n"
//                + "\n"
//                + "8. Add Customer Details\n"
//                + "9. Search Customer\n"
//                + "10. Save Customers & Accounts\n"
//                + "11. View All Customers\n"
//                + "\n"
//                + "12. Exit Banking Management System\n"
//                + "Enter your choice: \n"
//                + "Exit from bank management system.\n"
//                + "----------------Welcome to Bank Management System-----------------\n"
//                + "Please select one of the options below:\n"
//                + "1. Add Employee Details\n"
//                + "2. Search Employee\n"
//                + "3. Save Employees\n"
//                + "4. View All Employees\n"
//                + "\n"
//                + "5. Add Account Details\n"
//                + "6. Search Account\n"
//                + "7. View all Accounts\n"
//                + "\n"
//                + "8. Add Customer Details\n"
//                + "9. Search Customer\n"
//                + "10. Save Customers & Accounts\n"
//                + "11. View All Customers\n"
//                + "\n"
//                + "12. Exit Banking Management System\n"
//                + "Enter your choice: \n"
//                + "=====Search Employee=====\n"
//                + "Enter employee id: \n"
//                + "FullTimeEmployee{eid=1first=Milast=TonginsuranceNo=1233benefit=healthcare}\n"
//                + "----------------Welcome to Bank Management System-----------------\n"
//                + "Please select one of the options below:\n"
//                + "1. Add Employee Details\n"
//                + "2. Search Employee\n"
//                + "3. Save Employees\n"
//                + "4. View All Employees\n"
//                + "\n"
//                + "5. Add Account Details\n"
//                + "6. Search Account\n"
//                + "7. View all Accounts\n"
//                + "\n"
//                + "8. Add Customer Details\n"
//                + "9. Search Customer\n"
//                + "10. Save Customers & Accounts\n"
//                + "11. View All Customers\n"
//                + "\n"
//                + "12. Exit Banking Management System\n"
//                + "Enter your choice: \n"
//                + "Exit from bank management system.\n";
//        assertEquals(expectedOutput, outContent.toString());
//    }
//    
//    @Test
//    void testSaveEmployee() {
//        String input = "3\n12\n";
//        System.setIn(new ByteArrayInputStream(input.getBytes()));
//
//        MyBank.main(new String[]{});
//
//        String expectedOutput = "----------------Welcome to Bank Management System-----------------\n"
//                + "Please select one of the options below:\n"
//                + "1. Add Employee Details\n"
//                + "2. Search Employee\n"
//                + "3. Save Employees\n"
//                + "4. View All Employees\n"
//                + "\n"
//                + "5. Add Account Details\n"
//                + "6. Search Account\n"
//                + "7. View all Accounts\n"
//                + "\n"
//                + "8. Add Customer Details\n"
//                + "9. Search Customer\n"
//                + "10. Save Customers & Accounts\n"
//                + "11. View All Customers\n"
//                + "\n"
//                + "12. Exit Banking Management System\n"
//                + "Enter your choice: \n"
//                + "=====Add Employee Details=====\n"
//                + "Enter employee id: \n"
//                + "Enter employees first name: \n"
//                + "Enter employees last name: \n"
//                + "Enter employees email: \n"
//                + "Enter employees phone: \n"
//                + "Enter employees SSN: \n"
//                + "Enter employee type: \n"
//                + "Enter employees insurance number: \n"
//                + "Enter employees benefit: \n"
//                + "Bank{id=1, name=Group 2, phone=612 234 3456, webUrl=group2bank, employees=[FullTimeEmployee{eid=1first=Milast=TonginsuranceNo=1233benefit=healthcare}], customers=[]}\n"
//                + "----------------Welcome to Bank Management System-----------------\n"
//                + "Please select one of the options below:\n"
//                + "1. Add Employee Details\n"
//                + "2. Search Employee\n"
//                + "3. Save Employees\n"
//                + "4. View All Employees\n"
//                + "\n"
//                + "5. Add Account Details\n"
//                + "6. Search Account\n"
//                + "7. View all Accounts\n"
//                + "\n"
//                + "8. Add Customer Details\n"
//                + "9. Search Customer\n"
//                + "10. Save Customers & Accounts\n"
//                + "11. View All Customers\n"
//                + "\n"
//                + "12. Exit Banking Management System\n"
//                + "Enter your choice: \n"
//                + "Exit from bank management system.\n"
//                + "----------------Welcome to Bank Management System-----------------\n"
//                + "Please select one of the options below:\n"
//                + "1. Add Employee Details\n"
//                + "2. Search Employee\n"
//                + "3. Save Employees\n"
//                + "4. View All Employees\n"
//                + "\n"
//                + "5. Add Account Details\n"
//                + "6. Search Account\n"
//                + "7. View all Accounts\n"
//                + "\n"
//                + "8. Add Customer Details\n"
//                + "9. Search Customer\n"
//                + "10. Save Customers & Accounts\n"
//                + "11. View All Customers\n"
//                + "\n"
//                + "12. Exit Banking Management System\n"
//                + "Enter your choice: \n"
//                + "=====Add Employee Details=====\n"
//                + "Enter employee id: \n"
//                + "Enter employees first name: \n"
//                + "Enter employees last name: \n"
//                + "Enter employees email: \n"
//                + "Enter employees phone: \n"
//                + "Enter employees SSN: \n"
//                + "Enter employee type: \n"
//                + "Enter employees rate: \n"
//                + "Enter employees contract type: \n"
//                + "Enter employees hours per week: \n"
//                + "Bank{id=1, name=Group 2, phone=612 234 3456, webUrl=group2bank, employees=[PartTimeEmployee{rate=40.0, contract_type=W2, hours_per_week=40.0}], customers=[]}\n"
//                + "----------------Welcome to Bank Management System-----------------\n"
//                + "Please select one of the options below:\n"
//                + "1. Add Employee Details\n"
//                + "2. Search Employee\n"
//                + "3. Save Employees\n"
//                + "4. View All Employees\n"
//                + "\n"
//                + "5. Add Account Details\n"
//                + "6. Search Account\n"
//                + "7. View all Accounts\n"
//                + "\n"
//                + "8. Add Customer Details\n"
//                + "9. Search Customer\n"
//                + "10. Save Customers & Accounts\n"
//                + "11. View All Customers\n"
//                + "\n"
//                + "12. Exit Banking Management System\n"
//                + "Enter your choice: \n"
//                + "Exit from bank management system.\n"
//                + "----------------Welcome to Bank Management System-----------------\n"
//                + "Please select one of the options below:\n"
//                + "1. Add Employee Details\n"
//                + "2. Search Employee\n"
//                + "3. Save Employees\n"
//                + "4. View All Employees\n"
//                + "\n"
//                + "5. Add Account Details\n"
//                + "6. Search Account\n"
//                + "7. View all Accounts\n"
//                + "\n"
//                + "8. Add Customer Details\n"
//                + "9. Search Customer\n"
//                + "10. Save Customers & Accounts\n"
//                + "11. View All Customers\n"
//                + "\n"
//                + "12. Exit Banking Management System\n"
//                + "Enter your choice: \n"
//                + "Exit from bank management system.\n"
//                + "----------------Welcome to Bank Management System-----------------\n"
//                + "Please select one of the options below:\n"
//                + "1. Add Employee Details\n"
//                + "2. Search Employee\n"
//                + "3. Save Employees\n"
//                + "4. View All Employees\n"
//                + "\n"
//                + "5. Add Account Details\n"
//                + "6. Search Account\n"
//                + "7. View all Accounts\n"
//                + "\n"
//                + "8. Add Customer Details\n"
//                + "9. Search Customer\n"
//                + "10. Save Customers & Accounts\n"
//                + "11. View All Customers\n"
//                + "\n"
//                + "12. Exit Banking Management System\n"
//                + "Enter your choice: \n"
//                + "Save Employees\n"
//                + "----------------Welcome to Bank Management System-----------------\n"
//                + "Please select one of the options below:\n"
//                + "1. Add Employee Details\n"
//                + "2. Search Employee\n"
//                + "3. Save Employees\n"
//                + "4. View All Employees\n"
//                + "\n"
//                + "5. Add Account Details\n"
//                + "6. Search Account\n"
//                + "7. View all Accounts\n"
//                + "\n"
//                + "8. Add Customer Details\n"
//                + "9. Search Customer\n"
//                + "10. Save Customers & Accounts\n"
//                + "11. View All Customers\n"
//                + "\n"
//                + "12. Exit Banking Management System\n"
//                + "Enter your choice: \n"
//                + "Exit from bank management system.\n";
//        assertEquals(expectedOutput, outContent.toString());
//    }
}


