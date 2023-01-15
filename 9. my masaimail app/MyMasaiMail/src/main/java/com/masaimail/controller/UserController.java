package com.masaimail.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.masaimail.model.LoginDTO;
import com.masaimail.model.Mail;
import com.masaimail.model.User;
import com.masaimail.service.LoginLogoutService;
import com.masaimail.service.MailService;
import com.masaimail.service.UserService;




@RestController
public class UserController {

	
	@Autowired
	private LoginLogoutService llService;
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private MailService mService;
	
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUserHandler(@Valid	@RequestBody User user){
		User us =uService.registeruser(user);
		return new ResponseEntity<>(us,HttpStatus.CREATED);
	}
	
	@GetMapping("/mail/{key}")
	public ResponseEntity<List<Mail>> getAllMailHandler( @PathVariable("key") String key){
		List<Mail> list = uService.checkAllMail(key);
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping("/starred/{key}")
	public ResponseEntity<List<Mail>> getAllStarredMailhandler(@PathVariable("key") String key){
		List<Mail> list = uService.checkAllStarredMail(key);
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@PutMapping("/user/{key}")
	public ResponseEntity<User> updateUserhandler(@RequestBody User user ,@PathVariable("key") String key){
		User	us  = uService.updateUser(user, key);
		return new ResponseEntity<>(us,HttpStatus.OK);
	}
	
}
