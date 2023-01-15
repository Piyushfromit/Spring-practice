package com.masaimail.controller;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masaimail.model.LoginDTO;
import com.masaimail.service.LoginLogoutService;
import com.masaimail.service.MailService;
import com.masaimail.service.UserService;



@RestController
public class LoginLogoutController {

	
	@Autowired
	private LoginLogoutService llService;
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private MailService mService;
	
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUserhandler(@RequestBody LoginDTO loginDTO) throws LoginException {
		
		String result = llService.loginUser(loginDTO);
		
        return new ResponseEntity<String>(result,HttpStatus.OK );
		
	}
	
	
	@PostMapping("/logout")
	public String logoutUserHandler(@RequestParam(required = false) String key) throws LoginException {
		return llService.logOutUser(key);
		
	}
	
	
	
	
}
