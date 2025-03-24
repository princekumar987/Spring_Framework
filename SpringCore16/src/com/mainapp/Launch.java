package com.mainapp;

import java.util.ArrayList;
import java.util.LinkedList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) {
		 
		
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml"); //here program are riun constructor wala
		
		Employee e=(Employee)ac.getBean("emp");
		e.setEid(11);
		e.setEname("prince");
    	e.setEddress("anhari");
		
		System.out.println(e);
		

	}

}
