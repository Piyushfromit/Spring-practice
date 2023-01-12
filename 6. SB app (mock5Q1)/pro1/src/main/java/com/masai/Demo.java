package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	
	public static void main(String[] args) {
		
	
	
	ApplicationContext app=new AnnotationConfigApplicationContext(AppConfigure.class);
	
	PersonService std=	app.getBean(PersonService.class);
	
	
	
	std.printList();
	
	System.out.println("******************************************");
	
	std.printMap();
	
	System.out.println("**********************************");
	
	std.printAppName();
	
	System.out.println("*************************************************");
	
	}
	

}
