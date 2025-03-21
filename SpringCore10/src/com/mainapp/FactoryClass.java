package com.mainapp;

import java.util.Scanner;

public class FactoryClass {
	
      public  Employee customObject() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key");
		int key=sc.nextInt();
		Employee e;
		if(key==1212) {
			e=new Employee("QWERt");
		}
		else {
			e=new Employee("PQRST");
		}
		
		return e;
	}

}
