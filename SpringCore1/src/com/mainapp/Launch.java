package com.mainapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Launch {

	public static void main(String[] args) {
		 
		
		ClassPathResource resource =new ClassPathResource("bean.xml");
		
		XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(resource);
		
		Demo demo=(Demo)xmlBeanFactory.getBean("demo");
		demo.test();
		
		Femo femo=(Femo)xmlBeanFactory.getBean("femo");
		femo.test();
		
		System.out.println("Exit");
	}

}
