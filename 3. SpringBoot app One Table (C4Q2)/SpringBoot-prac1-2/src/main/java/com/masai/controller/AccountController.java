package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Account;
import com.masai.model.AccountDTO;
import com.masai.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	AccountService dao;
	@PostMapping("/account")
	public ResponseEntity<Account> openAccount( @RequestBody  Account acc) {
		
		return new ResponseEntity<Account>(dao.openAccount(acc), HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/account/{no}")
	public ResponseEntity<Account> closeAccount(@PathVariable("no")  Integer accno) {
		
		return new ResponseEntity<Account>(dao.closeAccount(accno), HttpStatus.OK);
	}
	@PutMapping("/account/{no}")
	public ResponseEntity<Account> depositAmount( @PathVariable("no") Integer accno,@RequestParam Integer amount) {
		
		return new ResponseEntity<Account>(dao.depositAmount(accno, amount), HttpStatus.OK);
		
	}
	
	@PutMapping("/accountw/{no}")
	public ResponseEntity<Account> withdrawAmount(@PathVariable("no")  int accno,@RequestParam Integer amount) {
		
		return new ResponseEntity<Account>(dao.withdrawAmount(accno, amount), HttpStatus.OK);
	}
	
	
	@PutMapping("/accountT")
	public ResponseEntity<String> transferAmount(@RequestBody  AccountDTO dto) {
		
		return new ResponseEntity<String>(dao.transferAmount(dto), HttpStatus.OK);
		
	}
	
	
	

}
