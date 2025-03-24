package com.mainapp;

import java.util.ArrayList;
import java.util.LinkedList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.MyConfig;
import com.controller.MyController;
import com.entity.Employee;

public class Launch {

	public static void main(String[] args) {
		 
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
      
        Employee emp=ac.getBean(Employee.class);
        emp.setEid(5);
        emp.setEname("Prince");
        emp.setEaddress("anahri");
        emp.setEsalary(2000);
        
        MyController mc=ac.getBean(MyController.class);
        String result=mc.doPost(emp);
        
        System.out.println(result);
	}

}
