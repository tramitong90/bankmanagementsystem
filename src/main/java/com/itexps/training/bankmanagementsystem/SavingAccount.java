/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.bankmanagementsystem;

/**
 *
 * @author mimi
 */
public class SavingAccount implements Account{
    
    private String SAC;
    private double balance;

    public SavingAccount(String SAC, double balance) {
        this.SAC = SAC;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "SavingAccount{" + "SAC=" + SAC + ", balance=" + balance + '}';
    }

    @Override
    public String getAccountNumber(){
        return this.SAC;
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
        balance += (balance * 5.00)/100; 
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    public String getSAC() {
        return SAC;
    }

    public void setSAC(String SAC) {
        this.SAC = SAC;
    }
    
    
    
}
