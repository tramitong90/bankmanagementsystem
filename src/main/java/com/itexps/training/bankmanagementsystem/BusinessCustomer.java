/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.bankmanagementsystem;

/**
 *
 * @author mimi
 */
public class BusinessCustomer extends Customer {

    private int bid;

    @Override
    public String toString() {
        return "BusinessCustomer{" + "bid=" + bid + '}';
    }

    public BusinessCustomer(int bid, int cid, String first, String last, String email, String phone) {
        super(cid, first, last, email, phone);
        this.bid = bid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

}
