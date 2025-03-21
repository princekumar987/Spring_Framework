package com.mainapp;

import java.util.List;


public class Employee {
    
    private int eid;
    private String ename;
    private String eddress;
    
    private List<Account> accounts;
    
    // Non-parameterized constructor
    public Employee() {
    }
    
    // Constructor for defaultListOfBooks
    public Employee(List<Account> accounts) {
        this.accounts = accounts;
    }
    
    // Getters and Setters
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEddress() {
        return eddress;
    }

    public void setEddress(String eddress) {
        this.eddress = eddress;
    }
    
    public List<Account> getAccounts() {
        return accounts;
    }
    
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", eddress='" + eddress + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
