package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Fir;
import com.masai.entity.LoginDTO;
import com.masai.entity.User;
import com.masai.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/masaifir")
public class UserController {

	@Autowired
	private UserService usv;
	
	@PostMapping("/user")
	public ResponseEntity<User> registerUser( @Valid @RequestBody User  user){
		
		return new ResponseEntity<User>(usv.registerUser(user), HttpStatus.ACCEPTED);
	}
	@PostMapping("/login")
	public ResponseEntity<User> loginUser(@RequestBody LoginDTO login){
		
		return new ResponseEntity<User>(usv.loginUser(login), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/user/{id}")
	public  ResponseEntity< List<Fir>> getAllFir(@PathVariable("id") Integer u_id){
		
		return  new ResponseEntity<List<Fir>> (usv.getAllFir(u_id), HttpStatus.ACCEPTED);
	}
}
