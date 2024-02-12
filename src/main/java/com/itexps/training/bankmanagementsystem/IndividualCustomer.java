/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.bankmanagementsystem;

/**
 *
 * @author mimi
 */
public class IndividualCustomer extends Customer{
    
    private int iid;

    @Override
    public String toString() {
        return "IndividualCustomer{" + "iid=" + iid + '}';
    }
    

    public IndividualCustomer(int iid, int cid, String first, String last, String email, String phone) {
        super(cid, first, last, email, phone);
        this.iid = iid;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }
    
    
}
