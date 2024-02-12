/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.bankmanagementsystem;

/**
 *
 * @author mimi
 */
public class CheckingAccount implements Account{
    
    private String CAC;
    private double balance;

    public CheckingAccount(String CAC, double balance) {
        this.CAC = CAC;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + "CAC=" + CAC + ", balance=" + balance + '}';
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getAccountNumber(){
        return this.CAC;
    }
    
    @Override
    public void deposit(double amount){
        balance += amount; 
    }
    
    @Override
    public void withdraw(double amount){
        balance -= amount;
    }
    
    @Override
    public void interestRate(){
        balance += (balance *1.05)/100;
    }

    public String getCAC() {
        return CAC;
    }

    public void setCAC(String CAC) {
        this.CAC = CAC;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    

    
}
