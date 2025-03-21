package com.mainapp;

import java.util.Scanner;




public class Employee {
    
    private int countryCode;
    private String countryName;
    private String policy;
    
    private int eid;
    private String ename;

    // No-argument constructor
    public Employee() {}

    // Getters and Setters
    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

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

    // toString method
    @Override
    public String toString() {
        return "Employee{" +
                "countryCode=" + countryCode +
                ", countryName='" + countryName + '\'' +
                ", policy='" + policy + '\'' +
                ", eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }
}

