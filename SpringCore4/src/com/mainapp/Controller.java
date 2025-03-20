package com.mainapp;

public class Controller {
	
	
	private Service service;  //Dependency
	
	
	public Controller(Service service) {
		this.service=service;
	}
	
	
	
//	public void setService(Service service) {   //setter injection
//		this.service=service;
//	}
	
	public void doPost() {
		System.out.println("DoPost controller");
		service.test1();
	}
	
	public void doGet() {
		
		System.out.println("DoGet controller");
		service.test2();
	}

}
