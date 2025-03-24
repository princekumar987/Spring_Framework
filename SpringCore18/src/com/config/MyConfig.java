package com.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.entity","com.controller","com.service","com.repository"})
public class MyConfig{
	
	
	@Bean
	public List<String> list(){
		
		return Arrays.asList("java","pyhton", "ai");
	}
	
}