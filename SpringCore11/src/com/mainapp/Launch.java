package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.Controller;

public class Launch {

	public static void main(String[] args) {
		 
		
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml"); //here program are riun constructor wala
		
		Controller controller=(Controller)ac.getBean("controller");
		controller.doPost();
		
	}

}
