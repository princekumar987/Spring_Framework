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
	
	public static Employee customObject() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key");
		int key=sc.nextInt();
		Employee e;
		if(key==1212) {
			e=new Employee("QWERt");
		}
		else {
			e=new Employee("PQRST");
		}
		
		return e;
	}
	


}
