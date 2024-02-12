/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.bankmanagementsystem;

/**
 *
 * @author mimi
 */
public class PartTimeEmployee extends Employee{
    
    private float rate;
    private String contract_type;
    private float hours_per_week;

    public PartTimeEmployee(float rate, String contract_type, float hours_per_week, int eid, String first, String last, String email, String phone, String type) {
        super(eid, first, last, email, phone, type);
        this.rate = rate;
        this.contract_type = contract_type;
        this.hours_per_week = hours_per_week;
    }

  

    @Override
    public String toString() {
        return "PartTimeEmployee{" + "rate=" + rate + ", contract_type=" + contract_type + ", hours_per_week=" + hours_per_week + '}';
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getContract_type() {
        return contract_type;
    }

    public void setContract_type(String contract_type) {
        this.contract_type = contract_type;
    }

    public float getHours_per_week() {
        return hours_per_week;
    }

    public void setHours_per_week(float hours_per_week) {
        this.hours_per_week = hours_per_week;
    }
    
    
}
