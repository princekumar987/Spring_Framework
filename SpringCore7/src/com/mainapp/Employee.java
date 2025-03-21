package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
    
	static {
		System.out.println("Employee is loading");
	}
	
	public Employee() {
		System.out.println("Employee Instantition");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Resource Allocation--callback");
		
	}
	
	public void myXmlInit() {
		System.out.println("Resource Allocation--xml");
	}
	
	@PostConstruct
	public void myAnnotationInit() {
		System.out.println("Resource Allocation--annotation");
	}
	
	public void test() {
		System.out.println("test method");
	}
    
	
	
	@Override
	public void destroy() throws Exception {
		
		System.out.println("Resource Deallocation--callback");
	}


	
	public void myXmlDestroy() {
		System.out.println("jhgfghResource Deallocation--xml");
	}
	
	
	@PreDestroy
	public void myAnnotationDestroy() {
		System.out.println("Resource Deallocation--Annotation");
	}
}
