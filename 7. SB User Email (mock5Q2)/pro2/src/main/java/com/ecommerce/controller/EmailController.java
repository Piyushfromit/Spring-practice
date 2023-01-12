package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.EmailService;



@RestController
@RequestMapping("/emailController")
public class EmailController {
	
	
	@Autowired
	private EmailService aservice;
	
	

}
