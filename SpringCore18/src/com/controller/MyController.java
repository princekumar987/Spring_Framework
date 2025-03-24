package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entity.Employee;
import com.service.MyService;

@Component
public class MyController {
	

	@Autowired                       //field injection
	private MyService myService;
	
	public String  doPost(Employee empBean) {
		 
		return myService.add(empBean);
	}

}
