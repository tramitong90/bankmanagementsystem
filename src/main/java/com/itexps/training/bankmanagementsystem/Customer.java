/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.bankmanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author mimi
 */
public class Customer {

    private int cid;
    private String first;
    private String last;
    private String email;
    private String phone;
    private ArrayList<Account> accounts = new ArrayList<>();

    @Override
    public String toString() {
        return "Customer{" + "cid=" + cid + ", first=" + first + ", last=" + last + ", email=" + email + ", phone="
                + phone + ", accounts=" + accounts + '}';
    }

    public Customer(int cid, String first, String last, String email, String phone) {
        this.cid = cid;
        this.first = first;
        this.last = last;
        this.email = email;
        this.phone = phone;
    }


    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

}
