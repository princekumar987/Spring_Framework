package com.dao;

import javax.annotation.PostConstruct;

public class Dao {
     
	private String Connection;
	
	@PostConstruct
	public String init() {
		
		String connection ="connection established";
		this.Connection=connection; 
		return Connection;
	}
	
	public void testDao(){
		System.out.println("Test Dao :-- "+Connection);
	}
}
