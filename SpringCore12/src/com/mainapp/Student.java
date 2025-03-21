package com.mainapp;

public class Student {
	
	 private int countryCode;
	 private String countryName;
	 private String policy;
     private int sid;
     private String sname;

    // Parameterized Constructor
    public Student() {
    	
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

    public int getSid() {
        return sid;
    }

    public void setSid(int eid) {
        this.sid = eid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String ename) {
        this.sname = ename;
    }

    // toString method
    @Override
    public String toString() {
        return "Student{" +
                "countryCode=" + countryCode +
                ", countryName='" + countryName + '\'' +
                ", policy='" + policy + '\'' +
                ", eid=" + sid +
                ", ename='" + sname + '\'' +
                '}';
    }
}