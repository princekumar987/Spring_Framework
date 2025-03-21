package com.mainapp;

import java.util.Scanner;




public class Employee {
    
	
	private String companyCode;
	
	
	static {
		System.out.println("Employee is loading");
	}
	
	public Employee(String companyCode) {
		this.companyCode=companyCode;
		System.out.println("Employee Instantition "+companyCode);
	}
	

}
