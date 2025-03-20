package com.mainapp;

public class Account {
    private int accountno;
    private String accountname;
    private String accountaddress;

    // Non-parameterized constructor
    public Account() {
    	
    	System.out.println("constructor instationa");
    }

//    // Parameterized constructor
//    public Account(int accountno, String accountname, String accountaddress) {
//        this.accountno = accountno;
//        this.accountname = accountname;
//        this.accountaddress = accountaddress;
//    }

    // Getters
    public int getAccountno() {
        return accountno;
    }

    public String getAccountname() {
        return accountname;
    }

    public String getAccountaddress() {
        return accountaddress;
    }

    // Setters
    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public void setAccountaddress(String accountaddress) {
        this.accountaddress = accountaddress;
    }

    // toString method
    @Override
    public String toString() {
        return "Account{" +
                "accountno=" + accountno +
                ", accountname='" + accountname + '\'' +
                ", accountaddress='" + accountaddress + '\'' +
                '}';
    }
}