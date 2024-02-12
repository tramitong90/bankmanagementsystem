///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package com.itexps.training.bankmanagementsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

///**
// *
// * @author mimi
// */

public class MyBank {

    private Bank myBank;
    private Scanner sc;

    public MyBank() {
        myBank = new Bank(1, "Group 2", "612 234 3456", "group2bank");
        sc = new Scanner(System.in);
    }

    public void handleMenu() {
        int choice = 0;
        try {
            do {
                menu();
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addEmployeeDetails();
                        break;

                    case 2:
                        searchEmployee();
                        break;

                    case 3:
                        saveEmployees();
                        break;

                    case 4:
                        viewAllEmployees();
                        break;

                    case 5:
                        addAccountDetails();
                        break;

                    case 6:
                        searchAccount();
                        break;

                    case 7:
                        viewAllAccounts();
                        break;

                    case 8:
                        addCustomerDetails();
                        break;

                    case 9:
                        searchCustomer();
                        break;

                    case 10:
                        saveCustomersAndAccounts();
                        break;

                    case 11:
                        viewAllCustomers();
                        break;

                    default:
                        System.out.println("Exit from bank management system.");
                        break;
                }

            } while (choice != 12);
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input.");
        }
    }

    private void addEmployeeDetails() {
       System.out.println("=====Add Employee Details=====");
        Employee emp1 = null;

        // add employee
        System.out.println("Enter employee id: ");
        int eid = sc.nextInt();

        System.out.println("Enter employees first name: ");
        String empFirst = sc.next();

        System.out.println("Enter employees last name: ");
        String empLast = sc.next();

        System.out.println("Enter employees email: ");
        String empEmail = sc.next();

        System.out.println("Enter employees phone: ");
        String empPhone = sc.next();

        System.out.println("Enter employees SSN: ");
        String empSSN = sc.next();

        System.out.println("Enter employee type: ");
        String empType = sc.next();
        if (empType.equalsIgnoreCase("fulltime")) {
            System.out.println("Enter employees insurance number: ");
            String empInsuranceNo = sc.next();

            System.out.println("Enter employees benefit: ");
            String empBenefit = sc.next();
            emp1 = new FullTimeEmployee(empInsuranceNo, empBenefit, eid, empFirst, empLast, empEmail,
                    empPhone, empType);

        } else if (empType.equalsIgnoreCase("parttime")) {
            System.out.println("Enter employees rate: ");
            float empRate = sc.nextFloat();

            System.out.println("Enter employees contract type: ");
            String empContractType = sc.next();

            System.out.println("Enter employees hours per week: ");
            float empHourPerWeek = sc.nextFloat();
            emp1 = new PartTimeEmployee(empRate, empContractType, empHourPerWeek, eid, empFirst,
                    empLast, empEmail, empPhone, empType);

        }

        myBank.getEmployees().add(emp1);
        System.out.println(myBank);
    
    }

    private void searchEmployee() {
        try {
            System.out.println("=====Search Employee=====");

            System.out.println("Enter employee id: ");
            int id = sc.nextInt();
            boolean found = false;
            for (Employee e : myBank.getEmployees()) {
                if (e.getEid() == id) {
                    System.out.println(e);
                    found = true;
                }
            }
            if (found = false) {
                System.out.println("For this id - Employee does not exit.");
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private void saveEmployees() {
       System.out.println("Save Employees");

        try {
            FileWriter fw = new FileWriter("employees.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("===============Bank===============\n");
            bw.write(myBank.getId() + "|" + myBank.getName() + "|" + myBank.getPhone() + "|"
                    + myBank.getWebUrl() + "\n");

            bw.write("===============Employee[s]===============\n");

            for (Employee e : myBank.getEmployees()) {

                bw.write(e.getEid() + "|" + e.getFirst() + "|" + e.getLast() + "|" + e.getEmail() + "|"
                        + e.getPhone() + "|" + e.getType() + "\n");
                if (e instanceof FullTimeEmployee) {
                    bw.write(((FullTimeEmployee) e).getBenefit() + "|"
                            + ((FullTimeEmployee) e).getInsurance_no());
                } else {
                    bw.write((((PartTimeEmployee) e).getRate()) + "|"
                            + ((PartTimeEmployee) e).getContract_type() + "|"
                            + ((PartTimeEmployee) e).getHours_per_week());
                }
                bw.write("\n");
            }
            bw.close();
            fw.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }

    private void viewAllEmployees() {
 
        System.out.println("=====View All Employees=====");

        try {
            FileReader fr = new FileReader("employees.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = "";

            try {
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
                fr.close();
            } catch (IOException ex) {
                System.out.println("exception happened");

            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");

        }
    }

    private void addAccountDetails() {
        System.out.println("=====Add Account Details=====");
        Account acct1 = null;

        System.out.println("Enter customer ID: ");
        int custID1 = sc.nextInt();
        boolean cfound1 = false;

        for (Customer c : myBank.getCustomers()) {
            if (c.getCid() == custID1) {
                // check if getting correct customer
                System.out.println(c);

                System.out.println("Do you want to add Checking account or Saving account?");
                String atype = sc.next();

                if (atype.equalsIgnoreCase("Checking")) {
                    System.out.println("Enter checking account id: ");
                    String cac = sc.next();

                    System.out.println("Enter checking account balance: ");
                    double cbalance = sc.nextDouble();

                    acct1 = new CheckingAccount(cac, cbalance);
                } else {
                    System.out.println("Enter saving account id: ");
                    String sac = sc.next();

                    System.out.println("Enter saving account balance: ");
                    double sblance = sc.nextDouble();

                    acct1 = new SavingAccount(sac, sblance);
                }

                myBank.getCustomers().get(custID1 - 1).getAccounts().add(acct1);
                System.out.println(myBank.getCustomers().get(custID1 - 1).getAccounts());

                cfound1 = true;
            }
        }
        if (cfound1 = false) {
            System.out.println("For this id - Customer does not exit.");
        }
    }

    private void searchAccount() {
        System.out.println("====Search Account====");

        try{
        System.out.println("Enter customer ID: ");
        int custID2 = sc.nextInt();
        boolean cfound2 = false;

        for (Customer c : myBank.getCustomers()) {
            if (c.getCid() == custID2) {
                System.out.println(c);

                System.out.println("Enter account number: ");
                String acctNumber = sc.next();

                boolean afound = false;
                for (Account a : myBank.getCustomers().get(custID2 - 1).getAccounts()) {

                    if (a.getAccountNumber().equalsIgnoreCase(acctNumber)) {
                        System.out.println(a);
                        afound = true;
                    }
                }
                if (afound = false) {
                    System.out.println("For this id - Account does not exit.");
                }

            }
        }
        if (cfound2 = false) {
            System.out.println("For this id - Account does not exit.");
        }
        } catch (Exception e){
            System.out.println("exception");
        }
    }

    private void viewAllAccounts() {
        System.out.println("====View all Accounts====");

        FileReader fr;
        try {
            fr = new FileReader("customer.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = "";

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void addCustomerDetails() {
        System.out.println("====Add Customers====");

        System.out.println("Enter customer id: ");
        int cid = sc.nextInt();

        System.out.println("Enter customer first name: ");
        String custFirst = sc.next();

        System.out.println("Enter customer last name: ");
        String custLast = sc.next();

        System.out.println("Enter customer email: ");
        String custEmail = sc.next();

        System.out.println("Enter customer phone: ");
        String custPhone = sc.next();

        System.out.println("Enter customer type (business/individual): ");
        String custType = sc.next();

        Customer cust1 = null;
        if (custType.equalsIgnoreCase("business")) {
            System.out.println("Enter business id: ");
            int bid = sc.nextInt();
            cust1 = new BusinessCustomer(bid, cid, custFirst, custLast, custEmail, custPhone);
        } else {
            System.out.println("Enter individual customer id: ");
            int iid = sc.nextInt();
            cust1 = new IndividualCustomer(iid, cid, custFirst, custLast, custEmail, custPhone);
        }

        myBank.getCustomers().add(cust1);
    }

    private void searchCustomer() {
        System.out.println("====Search Customer====");

            System.out.println("Enter customer id: ");
            int custId = sc.nextInt();
            boolean cfound = false;
            for (Customer c : myBank.getCustomers()) {
                if (c.getCid() == custId) {
                    System.out.println(c);
                    cfound = true;
                }
            }
            if (cfound = false) {
                System.out.println("For this id - Customer does not exit.");
            }
    }


    private void saveCustomersAndAccounts() {
        System.out.println("====Save Customers====");

        {
            try {
                FileWriter fw = new FileWriter("customer.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write("===============Bank===============\n");
                bw.write(myBank.getId() + "|" + myBank.getName() + "|" + myBank.getPhone() + "|"
                        + myBank.getWebUrl() + "\n");

                for (Customer c : myBank.getCustomers()) {
                    bw.write(c.getCid() + "|" + c.getFirst() + "|" + c.getLast() + "|" + c.getEmail() + "|"
                            + c.getPhone());
                    if (c instanceof BusinessCustomer) {
                        bw.write(((BusinessCustomer) c).getBid());
                    } else {
                        bw.write(((IndividualCustomer) c).getIid());
                    }
                    bw.write("\n");

                    // add accounts based on customer
                    bw.write("=================Account[s]==================\n");

                    for (Account a : myBank.getCustomers().get(c.getCid() - 1).getAccounts()) {

                        bw.write(a.getAccountNumber() + "|" + a.getBalance() + "\n");
                    }
                }
                bw.close();
                fw.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                ;
            }
        }
    }

    private void viewAllCustomers() {
        try {
            FileReader fr = new FileReader("customer.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = "";

            try {
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
                fr.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());

            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");

    }
    }
    
    public void menu() {
        System.out.println("----------------Welcome to Bank Management System-----------------");
        System.out.println("Please select one of the options below:");
        System.out.println("1. Add Employee Details");
        System.out.println("2. Search Employee");
        System.out.println("3. Save Employees");
        System.out.println("4. View All Employees" + "\n");

        System.out.println("5. Add Account Details");
        System.out.println("6. Search Account");
        System.out.println("7. View all Accounts" + "\n");

        System.out.println("8. Add Customer Details");
        System.out.println("9. Search Customer");
        System.out.println("10. Save Customers & Accounts");
        System.out.println("11. View All Customers" + "\n");

        System.out.println("12. Exit Banking Management System");
    }

    public static void main(String[] args) {
        MyBank myBank = new MyBank();
        myBank.handleMenu();
    }
}



//package com.itexps.training.bankmanagementsystem;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//

//public class MyBank {
//
//    public static Bank myBank = new Bank(1, "Group 2 ", "612 234 3456", "group2bank.");
//
//    public static void main(String args[]) {
//        int choice = 0;
//        Scanner sc = new Scanner(System.in);
//
//        Bank myBank = new Bank(1, "Group 2 ", "612 234 3456", "group2bank.");
//
//        try {
//            do {
//                menu();
//                System.out.println("Enter your choice: ");
//                choice = sc.nextInt();
//
//                switch (choice) {
//
//                    case 1:
//                        addEmployeeDetails(sc);
//                        break;
//
//                    case 2:
//                        searchEmployee(sc);
//                        break;
//
//                    case 3:
//                        saveEmployee();
//                        break;
//
//                    case 4:
//                        viewAllEmployees();
//                        break;
//
//                    case 5:
//                        addAccountDetails(sc);
//                        break;
//
//                    case 6:
//                        searchAccount(sc);
//                        break;
//
//                    case 7:
//                        viewAllAccounts();
//                        break;
//
//                    case 8:
//                        addCustomer(sc);
//                        break;
//
//                    case 9:
//                        searchCustomers(sc);
//                        break;
//
//                    case 10:
//                        System.out.println("====Print Customer's Transactions");
//
//                        break;
//
//                    case 11:
//                        saveCustomers();
//                        break;
//
//                    case 12:
//                        viewAllCustomers();
//                        break;
//
//                    default:
//                        System.out.println("Exit from bank management system.");
//                        break;
//
//                }
//
//            } while (choice != 16);
//        } catch (InputMismatchException ex) {
//            System.out.println("Invalid input.");
//        }
//    }
//
//    public static void menu() {
//        System.out.println("----------------Welcome to Bank Management System-----------------");
//        System.out.println("Please select one of the options below:");
//        System.out.println("1. Add Employee Details");
//        System.out.println("2. Search Employee");
//        System.out.println("3. Save Employees");
//        System.out.println("4. View All Employees" + "\n");
//
//        System.out.println("5. Add Account Details");
//        System.out.println("6. Search Account");
//        System.out.println("7. View all Accounts" + "\n");
//
//        System.out.println("8. Add Customer Details");
//        System.out.println("9. Search Customer");
//        System.out.println("10. Print Customer's Transactions");
//        System.out.println("11. Save Customers & Accounts");
//        System.out.println("12. View All Customers" + "\n");
//
//        // System.out.println("13. Check balance by accountID");
//        // System.out.println("14. Deposit into account");
//        // System.out.println("15. Check balance" + "\n");
//
//        System.out.println("16. Exit Banking Management System");
//
//    }
//
//    public static void addEmployeeDetails(Scanner sc) {
//        System.out.println("=====Add Employee Details=====");
//        Employee emp1 = null;
//
//        // add employee
//        System.out.println("Enter employee id: ");
//        int eid = sc.nextInt();
//
//        System.out.println("Enter employees first name: ");
//        String empFirst = sc.next();
//
//        System.out.println("Enter employees last name: ");
//        String empLast = sc.next();
//
//        System.out.println("Enter employees email: ");
//        String empEmail = sc.next();
//
//        System.out.println("Enter employees phone: ");
//        String empPhone = sc.next();
//
//        System.out.println("Enter employees SSN: ");
//        String empSSN = sc.next();
//
//        System.out.println("Enter employee type: ");
//        String empType = sc.next();
//        if (empType.equalsIgnoreCase("fulltime")) {
//            System.out.println("Enter employees insurance number: ");
//            String empInsuranceNo = sc.next();
//
//            System.out.println("Enter employees benefit: ");
//            String empBenefit = sc.next();
//            emp1 = new FullTimeEmployee(empInsuranceNo, empBenefit, eid, empFirst, empLast, empEmail,
//                    empPhone, empType);
//
//        } else if (empType.equalsIgnoreCase("parttime")) {
//            System.out.println("Enter employees rate: ");
//            float empRate = sc.nextFloat();
//
//            System.out.println("Enter employees contract type: ");
//            String empContractType = sc.next();
//
//            System.out.println("Enter employees hours per week: ");
//            float empHourPerWeek = sc.nextFloat();
//            emp1 = new PartTimeEmployee(empRate, empContractType, empHourPerWeek, eid, empFirst,
//                    empLast, empEmail, empPhone, empType);
//
//        }
//
//        myBank.getEmployees().add(emp1);
//        System.out.println(myBank);
//    }
//
//    public static void searchEmployee(Scanner sc) {
//        try {
//            System.out.println("=====Search Employee=====");
//
//            System.out.println("Enter employee id: ");
//            int id = sc.nextInt();
//            boolean found = false;
//            for (Employee e : myBank.getEmployees()) {
//                if (e.getEid() == id) {
//                    System.out.println(e);
//                    found = true;
//                }
//            }
//            if (found = false) {
//                System.out.println("For this id - Employee does not exit.");
//            }
//        } catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }
//    }
//
//    public static void saveEmployee() {
//        System.out.println("Save Employees");
//
//        try {
//            FileWriter fw = new FileWriter("employees.txt", true);
//            BufferedWriter bw = new BufferedWriter(fw);
//
//            bw.write("===============Bank===============\n");
//            bw.write(myBank.getId() + "|" + myBank.getName() + "|" + myBank.getPhone() + "|"
//                    + myBank.getWebUrl() + "\n");
//
//            bw.write("===============Employee[s]===============\n");
//
//            for (Employee e : myBank.getEmployees()) {
//
//                bw.write(e.getEid() + "|" + e.getFirst() + "|" + e.getLast() + "|" + e.getEmail() + "|"
//                        + e.getPhone() + "|" + e.getType() + "\n");
//                if (e instanceof FullTimeEmployee) {
//                    bw.write(((FullTimeEmployee) e).getBenefit() + "|"
//                            + ((FullTimeEmployee) e).getInsurance_no());
//                } else {
//                    bw.write((((PartTimeEmployee) e).getRate()) + "|"
//                            + ((PartTimeEmployee) e).getContract_type() + "|"
//                            + ((PartTimeEmployee) e).getHours_per_week());
//                }
//                bw.write("\n");
//            }
//            bw.close();
//            fw.close();
//
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//
//        }
//    }
//
//    public static void viewAllEmployees() {
//        System.out.println("=====View All Employees=====");
//
//        try {
//            FileReader fr = new FileReader("employees.txt");
//            BufferedReader br = new BufferedReader(fr);
//
//            String line = "";
//
//            try {
//                while ((line = br.readLine()) != null) {
//                    System.out.println(line);
//                }
//                br.close();
//                fr.close();
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//
//        }
//    }
//
//    public static void addAccountDetails(Scanner sc) {
//        System.out.println("=====Add Account Details=====");
//        Account acct1 = null;
//
//        System.out.println("Enter customer ID: ");
//        int custID1 = sc.nextInt();
//        boolean cfound1 = false;
//
//        for (Customer c : myBank.getCustomers()) {
//            if (c.getCid() == custID1) {
//                // check if getting correct customer
//                System.out.println(c);
//
//                System.out.println("Do you want to add Checking account or Saving account?");
//                String atype = sc.next();
//
//                if (atype.equalsIgnoreCase("Checking")) {
//                    System.out.println("Enter checking account id: ");
//                    String cac = sc.next();
//
//                    System.out.println("Enter checking account balance: ");
//                    double cbalance = sc.nextDouble();
//
//                    acct1 = new CheckingAccount(cac, cbalance);
//                } else {
//                    System.out.println("Enter saving account id: ");
//                    String sac = sc.next();
//
//                    System.out.println("Enter saving account balance: ");
//                    double sblance = sc.nextDouble();
//
//                    acct1 = new SavingAccount(sac, sblance);
//                }
//
//                myBank.getCustomers().get(custID1 - 1).getAccounts().add(acct1);
//                System.out.println(myBank.getCustomers().get(custID1 - 1).getAccounts());
//
//                cfound1 = true;
//            }
//        }
//        if (cfound1 = false) {
//            System.out.println("For this id - Customer does not exit.");
//        }
//    }
//
//    public static void searchAccount(Scanner sc) {
//        System.out.println("====Search Account====");
//
//        System.out.println("Enter customer ID: ");
//        int custID2 = sc.nextInt();
//        boolean cfound2 = false;
//
//        for (Customer c : myBank.getCustomers()) {
//            if (c.getCid() == custID2) {
//                System.out.println(c);
//
//                System.out.println("Enter account number: ");
//                String acctNumber = sc.next();
//
//                boolean afound = false;
//                for (Account a : myBank.getCustomers().get(custID2 - 1).getAccounts()) {
//
//                    if (a.getAccountNumber().equalsIgnoreCase(acctNumber)) {
//                        System.out.println(a);
//                        afound = true;
//                    }
//                }
//                if (afound = false) {
//                    System.out.println("For this id - Account does not exit.");
//                }
//
//            }
//        }
//        if (cfound2 = false) {
//            System.out.println("For this id - Account does not exit.");
//        }
//    }
//
//    public static void viewAllAccounts() {
//        System.out.println("====View all Accounts====");
//
//        FileReader fr;
//        try {
//            fr = new FileReader("account.txt");
//            BufferedReader br = new BufferedReader(fr);
//
//            String line = "";
//
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//            br.close();
//            fr.close();
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//            ;
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//            ;
//        }
//    }
//
//    public static void addCustomer(Scanner sc) {
//        System.out.println("====Add Customers====");
//
//        System.out.println("Enter customer id: ");
//        int cid = sc.nextInt();
//
//        System.out.println("Enter customer first name: ");
//        String custFirst = sc.next();
//
//        System.out.println("Enter customer last name: ");
//        String custLast = sc.next();
//
//        System.out.println("Enter customer email: ");
//        String custEmail = sc.next();
//
//        System.out.println("Enter customer phone: ");
//        String custPhone = sc.next();
//
//        System.out.println("Enter customer type (business/individual): ");
//        String custType = sc.next();
//
//        Customer cust1 = null;
//        if (custType.equalsIgnoreCase("business")) {
//            System.out.println("Enter business id: ");
//            int bid = sc.nextInt();
//            cust1 = new BusinessCustomer(bid, cid, custFirst, custLast, custEmail, custPhone);
//        } else {
//            System.out.println("Enter individual customer id: ");
//            int iid = sc.nextInt();
//            cust1 = new IndividualCustomer(iid, cid, custFirst, custLast, custEmail, custPhone);
//        }
//
//        myBank.getCustomers().add(cust1);
//    }
//
//    public static void searchCustomers(Scanner sc) {
//        System.out.println("====Search Customer====");
//
//        System.out.println("Enter customer id: ");
//        int custId = sc.nextInt();
//        boolean cfound = false;
//        for (Customer c : myBank.getCustomers()) {
//            if (c.getCid() == custId) {
//                System.out.println(c);
//                cfound = true;
//            }
//        }
//        if (cfound = false) {
//            System.out.println("For this id - Customer does not exit.");
//        }
//    }
//
//    public static void saveCustomers() {
//        System.out.println("====Save Customers====");
//
//        {
//            try {
//                FileWriter fw = new FileWriter("customer.txt", true);
//                BufferedWriter bw = new BufferedWriter(fw);
//
//                bw.write("===============Bank===============\n");
//                bw.write(myBank.getId() + "|" + myBank.getName() + "|" + myBank.getPhone() + "|"
//                        + myBank.getWebUrl() + "\n");
//
//                for (Customer c : myBank.getCustomers()) {
//                    bw.write(c.getCid() + "|" + c.getFirst() + "|" + c.getLast() + "|" + c.getEmail() + "|"
//                            + c.getPhone());
//                    if (c instanceof BusinessCustomer) {
//                        bw.write(((BusinessCustomer) c).getBid());
//                    } else {
//                        bw.write(((IndividualCustomer) c).getIid());
//                    }
//                    bw.write("\n");
//
//                    // add accounts based on customer
//                    bw.write("=================Account[s]==================\n");
//
//                    for (Account a : myBank.getCustomers().get(c.getCid() - 1).getAccounts()) {
//
//                        bw.write(a.getAccountNumber() + "|" + a.getBalance() + "\n");
//                    }
//                }
//                bw.close();
//                fw.close();
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//                ;
//            }
//        }
//    }
//
//    public static void viewAllCustomers() {
//        try {
//            FileReader fr = new FileReader("customer.txt");
//            BufferedReader br = new BufferedReader(fr);
//
//            String line = "";
//
//            try {
//                while ((line = br.readLine()) != null) {
//                    System.out.println(line);
//                }
//                br.close();
//                fr.close();
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//
//        }
//    }
//}
