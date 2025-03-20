package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) {
		 
		
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml"); //here program are riun constructor wala
		
		Demo demo=(Demo)ac.getBean("demo");
		int a=demo.test();
		
		if(a==2) {
		    Femo femo=(Femo)ac.getBean("femo");
		    femo.test();
		}
		
		System.out.println("exit");
	}

}
