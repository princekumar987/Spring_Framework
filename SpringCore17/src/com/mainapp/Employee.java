package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Lazy
//@Scope(scopeName = "prototype")
public class Employee {
    
    static {
    	System.out.println("bean loading");
    }
    
    
    public Employee(){
    	
    	System.out.println("bean instatntition");
    }
    
    @PostConstruct
    public void init() {
    	System.out.println("BEAN INIT");
    }
    
    @PreDestroy
    public void destroy() {
    	System.out.println("BEAN destroy");
    }
    
    public void test() {
    	System.out.println("Method called ");
    }
  
}