/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.bankmanagementsystem;

/**
 *
 * @author mimi
 */
public interface Account {
    
    public String getAccountNumber();
    public void deposit(double amount);
    public void withdraw(double amount);
    public void interestRate();
    public double getBalance();
   
    
}
