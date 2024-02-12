/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.itexps.training.bankmanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author mimi
 */
public class Bank {

    private int id;
    private String name;
    private String phone;
    private String webUrl;
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(int id, String name, String phone, String webUrl) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.webUrl = webUrl;
    }

    @Override
    public String toString() {
        return "Bank{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", webUrl=" + webUrl + ", employees=" + employees + ", customers=" + customers + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    
    
}
