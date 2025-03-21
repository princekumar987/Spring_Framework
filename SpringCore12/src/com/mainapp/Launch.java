package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) {
		 
		
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml"); //here program are riun constructor wala
		
		Employee e=(Employee)ac.getBean("emp");
		e.setEid(1);
		e.setEname("Prince");
		
		Student s=(Student)ac.getBean("stu");
		s.setSid(1256);
		s.setSname("raj");
		
		Client c=(Client)ac.getBean("client");
		c.setCid(345);
		c.setCname("pooja");
		
		System.out.println(e);
		System.out.println(s);
		System.out.println(c);
	}

}
