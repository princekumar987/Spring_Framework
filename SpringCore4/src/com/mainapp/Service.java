package com.mainapp;

public class Service {
	
	private Dao dao;
	
	
	public Service(Dao dao) {
		this.dao=dao;
	}
	
//	public void setDao(Dao dao) {
//		this.dao=dao;
//	}
	
	public void test1() {
		System.out.println("test1 service");
		dao.test1();
	}
	
	public void test2() {
		System.out.println("test2 service");
		dao.test2();
	}

}
