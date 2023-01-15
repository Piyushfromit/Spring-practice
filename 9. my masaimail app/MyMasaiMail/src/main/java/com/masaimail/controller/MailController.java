package com.masaimail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masaimail.model.Mail;
import com.masaimail.service.LoginLogoutService;
import com.masaimail.service.MailService;
import com.masaimail.service.UserService;





@RestController
public class MailController {
	
	
	@Autowired
	private LoginLogoutService llService;
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private MailService mService;
	
	
	@PostMapping("/mail/{key}")
	public ResponseEntity<Mail> sendMailHandler(@RequestBody Mail mail	,@PathVariable("key") String key){
		Mail ma = mService.sendMail(mail, key);
		return new ResponseEntity<>(ma,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}/{key}")
	public ResponseEntity<String> sendMailHandler(@PathVariable("id") Integer id	,@PathVariable("key") String key){
		String s = mService.deleteMail(id, key);
		return new ResponseEntity<>(s,HttpStatus.OK);
	}
	
	@GetMapping("/starred/{id}/{key}")
	public ResponseEntity<Mail> starMailHandler(@PathVariable("id") Integer id	,@PathVariable("key") String key){
		Mail ma = mService.starMail(id, key);
		return new ResponseEntity<>(ma,HttpStatus.OK);
	}
	
	
	
	

}
