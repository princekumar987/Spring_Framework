package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) {
		 
		
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml"); //here program are riun constructor wala
		
		Account acc1=(Account)ac.getBean("acc");
		acc1.setAccountno(1);
		acc1.setAccountname("cbi");
		acc1.setAccountaddress("anhari");
		
		System.out.println(acc1);
		
		Account acc2=(Account)ac.getBean("acc");
		acc2.setAccountno(2);
		acc2.setAccountname("sbi");
		acc2.setAccountaddress("sitamarhi");
		
		System.out.println(acc2);
		
		
		System.out.println(" after both constructor ");
		
		System.out.println(acc1);
		System.out.println(acc2);
	}

}
