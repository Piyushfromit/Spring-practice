package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.LoginDTO;
import com.masai.model.Mail;
import com.masai.model.User;
import com.masai.service.UserService;

@RestController
@RequestMapping("/masaimail")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUserHandler(@Valid	@RequestBody	User user){
		User us =userService.registeruser(user);
		return new ResponseEntity<>(us,HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<User> loginUserhandler(	@RequestBody LoginDTO loginDTO){
		User us =userService.loginUser(loginDTO);
		return new ResponseEntity<>(us,HttpStatus.OK);
	}
	
	@GetMapping("/mail/{key}")
	public ResponseEntity<List<Mail>> getAllMailHandler( @PathVariable("key") String key){
		List<Mail> list = userService.checkAllMail(key);
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping("/starred/{key}")
	public ResponseEntity<List<Mail>> getAllStarredMailhandler(@PathVariable("key") String key){
		List<Mail> list = userService.checkAllStarredMail(key);
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@PutMapping("/user/{key}")
	public ResponseEntity<User> updateUserhandler(@RequestBody User user	,@PathVariable("key") String key){
		User	us  = userService.updateUser(user, key);
		return new ResponseEntity<>(us,HttpStatus.OK);
	}
}
