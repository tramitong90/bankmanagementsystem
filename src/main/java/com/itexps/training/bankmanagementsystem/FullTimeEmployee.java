/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.bankmanagementsystem;

/**
 *
 * @author mimi
 */
public class FullTimeEmployee extends Employee{
    
    private String insurance_no;
    private String benefit;

    @Override
    public String toString() {
        return "FullTimeEmployee{" + "eid=" + super.getEid() + "first=" + super.getFirst() + "last=" + super.getLast() + "insuranceNo=" + insurance_no + "benefit=" + benefit +"}";
    }

    
    public FullTimeEmployee(String insurance_no, String benefit, int eid, String first, String last, String email, String phone, String type) {
        super(eid, first, last, email, phone, type);
        this.insurance_no = insurance_no;
        this.benefit = benefit;
    }



    public String getInsurance_no() {
        return insurance_no;
    }

    public void setInsurance_no(String insurance_no) {
        this.insurance_no = insurance_no;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }
    
    
}
