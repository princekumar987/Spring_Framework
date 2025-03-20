package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
    
	static {
		System.out.println("Employee is loading");
	}
	
	public Employee() {
		System.out.println("Employee Instantition");
	}
	
//	public void myXmlInit() {
//		System.out.println("hhResource Allocation");
//	}
	
	@PostConstruct
	public void myAnnotationInit() {
		System.out.println("Resource Allocation");
	}
	
	public void test() {
		System.out.println("test method");
	}
	
//	public void myXmlDestroy() {
//		System.out.println("jhgfghResource Deallocation");
//	}
	
	
	@PreDestroy
	public void myAnnotationDestroy() {
		System.out.println("Resource Deallocation");
	}
}
