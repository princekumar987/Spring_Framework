package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mainapp.Employee;

@Configuration
@ComponentScan(basePackages = {"com.mainapp","com.beanpost"})
public class MyConfig {
	
	
	@Bean
	public Employee employeeBean() {
		System.out.println("custom logic");
		
		return new Employee();
	}

}
