package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.entity.Employee;
import com.repository.MyRepository;


@Component
public class MyServiceImpl implements MyService{
   
	
//	@Autowired
//	@Qualifier("repo1")     // field injection
	private MyRepository myRepository;
	
	
	
	
//	@Autowired
//	@Qualifier("repo1")          //setter injection 
	public void setMyRepository(MyRepository myRepository) {
		System.out.println("**************");
		this.myRepository = myRepository;
	}
	 
	
	
	@Autowired     // constructor injectionn
	public MyServiceImpl( @Qualifier("repo1") MyRepository myRepository) {
		super();
		this.myRepository=myRepository;
	}
	
	
	@Override
	public String add(Employee empBean) {
		
		return myRepository.add(empBean);
		
	}

}
