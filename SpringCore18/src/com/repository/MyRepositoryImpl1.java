package com.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.entity.Employee;

@Component("repo1")
public class MyRepositoryImpl1 implements MyRepository{
	
	
//	@Value("10")
	@Value("#{23+45}")   //spel #{}
	private int testid;
	
	
	@Value("hello jii")
	private String testString;
	
	
	@Value("#{list}")
	private List<String>testList;

	@Override
	public String add(Employee empBean) {
		
		
		System.out.println(empBean +" Saved Successfully "+testid+" "+testString+" "+testList);
		
		return "success1";
		
	}

}
