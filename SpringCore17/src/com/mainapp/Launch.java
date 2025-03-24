package com.mainapp;

import java.util.ArrayList;
import java.util.LinkedList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.MyConfig;

public class Launch {

	public static void main(String[] args) {
		 
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
        Employee emp1=ac.getBean(Employee.class);
        emp1.test();
        ac.close();
        
        
        
//        Employee emp2=ac.getBean(Employee.class);
//        emp2.test();
	}

}
