package com.mainapp;

public class Account {
    
    private int an;
    private String aname;

    // Non-parameterized constructor
    public Account() {
    }
    
    public Account(int an,String aname) {
    	this.an=an;
    	this.aname=aname;
    }

    // Getters and Setters
    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    // toString method
    @Override
    public String toString() {
        return "Account{" +
                "an=" + an +
                ", aname='" + aname + '\'' +
                '}';
    }
}
