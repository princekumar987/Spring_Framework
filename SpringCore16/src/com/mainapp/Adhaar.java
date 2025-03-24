package com.mainapp;

public class Adhaar {
    
    private int adno;
    private String adharname;

    // No-argument constructor
    public Adhaar() {}

    // Parameterized constructor
    public Adhaar(int adno, String adharname) {
        this.adno = adno;
        this.adharname = adharname;
    }

    // Getters and Setters
    public int getAdno() {
        return adno;
    }

    public void setAdno(int adno) {
        this.adno = adno;
    }

    public String getAdharname() {
        return adharname;
    }

    public void setAdharname(String adharname) {
        this.adharname = adharname;
    }

    // toString method
    @Override
    public String toString() {
        return "Adhaar{" +
                "adno=" + adno +
                ", adharname='" + adharname + '\'' +
                '}';
    }
}
