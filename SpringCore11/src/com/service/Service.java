package com.service;



import com.dao.Dao;

public class Service {
	
    private Dao dao;
	
   
	public void setDao(Dao dao) {
		this.dao=dao;
	}
	
	public void testService() {
		System.out.println("Test service");
		dao.testDao();
	}
}
