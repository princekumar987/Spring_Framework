package com.mainapp;


import java.util.Map;


public class Employee {
    
    private int eid;
    private String ename;
    private String eddress;
    
    private Map<String,Account> mapOfBooks;
    
    // Non-parameterized constructor
    public Employee() {
    }
    
    // Constructor for defaultListOfBooks
    public Employee(Map<String,Account> mapOfBooks) {
        this.mapOfBooks = mapOfBooks;
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
    
    public Map<String,Account> getMapOfBooks() {
        return mapOfBooks;
    }
    
    public void setMapOfBooks(Map<String,Account> mapOfBooks) {
        this.mapOfBooks = mapOfBooks;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", eddress='" + eddress + '\'' +
                ",mapOfBooks=" + mapOfBooks +
                '}';
    }
}
