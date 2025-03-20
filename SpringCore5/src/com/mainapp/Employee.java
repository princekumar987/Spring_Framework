package com.mainapp;

public class Employee {
    
	static {
		System.out.println("Employee is loading");
	}
	
	public Employee() {
		System.out.println("Employee Instantition");
	}
	
	public void myXmlInit() {
		System.out.println("Resource Allocation");
	}
	
	public void test() {
		System.out.println("test method");
	}
	
	public void myXmlDestroy() {
		System.out.println("Resource Deallocation");
	}
}
