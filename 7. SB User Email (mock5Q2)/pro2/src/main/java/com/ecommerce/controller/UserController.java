package com.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.ecommerce.exception.UserException;
import com.ecommerce.model.User;
import com.ecommerce.service.UserService;



@RestController
@RequestMapping("/userController")
public class UserController {
	
	
	@Autowired
	private UserService aservice;
	
	
	//@PostMapping("/user")
	//public ResponseEntity<User> userHandler(@Valid @RequestBody User user,
		//	@RequestParam String customerKey) throws UserException {

		//User savedUser = aservice.user(user, customerKey);

		//return new ResponseEntity<User>(saveuser, HttpStatus.OK);

	//}

}
