package com.mainapp;


import java.util.List;
import java.util.Map;


import java.util.List;

public class Employee {
    
    private int eid;
    private String ename;
    private String eddress;
    
    private Account account;
    private Adhaar adhaar;
    private List<String> listofbooks;

    // No-argument constructor
    public Employee() {}

    // Parameterized constructor
    public Employee( Account account, Adhaar adhaar, List<String> listofbooks) {
       
        this.account = account;
        this.adhaar = adhaar;
        this.listofbooks = listofbooks;
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Adhaar getAdhaar() {
        return adhaar;
    }

    public void setAdhaar(Adhaar adhaar) {
        this.adhaar = adhaar;
    }

    public List<String> getListofbooks() {
        return listofbooks;
    }

    public void setListofbooks(List<String> listofbooks) {
        this.listofbooks = listofbooks;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", eddress='" + eddress + '\'' +
                ", account=" + account +
                ", adhaar=" + adhaar +
                ", listofbooks=" + listofbooks +
                '}';
    }
}