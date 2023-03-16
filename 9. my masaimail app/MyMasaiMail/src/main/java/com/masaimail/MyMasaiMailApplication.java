package com.masaimail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MyMasaiMailApplication {

	public static void main(String[] args) {
	 ApplicationContext ctx=	SpringApplication.run(MyMasaiMailApplication.class, args);
	
	 Hello obj= ctx.getBean("hello", Hello.class);
	 
	 obj.printMessage();
	
	}

}
