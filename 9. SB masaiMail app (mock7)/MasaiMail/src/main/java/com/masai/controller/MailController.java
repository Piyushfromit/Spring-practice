package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Mail;
import com.masai.model.User;
import com.masai.repo.MailDao;
import com.masai.service.MailService;

@RestController
@RequestMapping("/masaimail")
public class MailController {
	@Autowired
	private MailService mailService;
	
	@PostMapping("/mail/{key}")
	public ResponseEntity<Mail> sendMailHandler(@RequestBody Mail mail	,@PathVariable("key") String key){
		Mail ma = mailService.sendMail(mail, key);
		return new ResponseEntity<>(ma,HttpStatus.OK);
	}
	
	@GetMapping("/starred/{id}/{key}")
	public ResponseEntity<Mail> starMailHandler(@PathVariable("id") Integer id	,@PathVariable("key") String key){
		Mail ma = mailService.starMail(id, key);
		return new ResponseEntity<>(ma,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}/{key}")
	public ResponseEntity<String> sendMailHandler(@PathVariable("id") Integer id	,@PathVariable("key") String key){
		String s = mailService.deleteMail(id, key);
		return new ResponseEntity<>(s,HttpStatus.OK);
	}
}
