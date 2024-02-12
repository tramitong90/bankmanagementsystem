/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.bankmanagementsystem;

/**
 *
 * @author mimi
 */
public class Employee {
    
    private int eid;
    private String first;
    private String last;
    private String email;
    private String phone;
    private String SSN;
    private String type;

    @Override
    public String toString() {
        return "Employee{" + "eid=" + eid + ", first=" + first + ", last=" + last + ", email=" + email + ", phone=" + phone + ", type=" + type + '}';
    }

    public Employee(int eid, String first, String last, String email, String phone, String type) {
        this.eid = eid;
        this.first = first;
        this.last = last;
        this.email = email;
        this.phone = phone;
        this.type = type;
    }

 

    
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
