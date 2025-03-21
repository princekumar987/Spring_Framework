package com.mainapp;

public class Client {
	 private int countryCode;
	 private String countryName;
	 private String policy;
     private int cid;
     private String cname;

    // Non-parameterized Constructor
    public Client() {
    }

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

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    // toString method
    @Override
    public String toString() {
        return "Client{" +
                "countryCode=" + countryCode +
                ", countryName='" + countryName + '\'' +
                ", ploicy='" + policy + '\'' +
                ", cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
