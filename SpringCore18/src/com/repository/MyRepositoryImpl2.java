package com.repository;

import org.springframework.stereotype.Component;

import com.entity.Employee;

@Component("repo2")
public class MyRepositoryImpl2 implements MyRepository {

	@Override
	public String  add(Employee empBean) {
		return null;
		
		
	}

}
