package com.mainapp;

import java.util.ArrayList;
import java.util.LinkedList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.MyConfig;
import com.controller.MyController;
import com.entity.Employee;
import com.repository.Crud;

public class Launch {

	public static void main(String[] args) {
		 
		
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		
		Crud bean=(Crud)ac.getBean("crud");
		
//		bean.insert(14, "ram");
//		bean.update(11, "ram");
		
//		bean.delete(11);
		
//		bean.readAlldeafult();
		
//		bean.readAllPojo();
		
		bean.readSingle(12);
	}

}
