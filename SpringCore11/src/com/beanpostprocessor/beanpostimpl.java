package com.beanpostprocessor;



import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.controller.Controller;
import com.dao.Dao;
import com.service.Service;

public class beanpostimpl implements BeanPostProcessor {
   @Override
   public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	  
	   if(bean instanceof Controller) {
		   System.out.println("controller initilized successfully");
	   }
	   else if(bean instanceof Service) {
		   System.out.println("Service initized successfully");
	   }
	   else {
		      Dao dao=(Dao)bean;
		      String result=dao.init();
		      if(result==null) {
		    	  System.out.println("connection problems");
		      }
		      else if(result.equals("connection established")) {
		    	  System.out.println("connection success");
		      }
		      else {
		    	  System.out.println("connection problems");
		      }
	   }
	   
	  
	   return bean;
   }
   
   @Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
	    if(bean instanceof Controller) {
	    	System.out.println("Controller instatantion+ "+beanName);
	    }
	    else if(bean instanceof Service) {
	    	System.out.println("Service instatntion+ "+beanName);
	    }
	    else {
	    	System.out.println("Dao instatntion+ "+beanName);
	    }
		return bean;
	}
}
