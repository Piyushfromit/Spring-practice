package com.masaimail.service;



import java.time.LocalDateTime;
import java.util.Optional;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.masaimail.model.CurrentUserSession;
import com.masaimail.model.LoginDTO;
import com.masaimail.model.User;
import com.masaimail.repository.CurrentSessionDao;
import com.masaimail.repository.MailDao;
import com.masaimail.repository.UserDao;

import net.bytebuddy.utility.RandomString;






@Service
public class LoginLogoutServiceImp implements LoginLogoutService{
	
	@Autowired
	private UserDao uDao;
	
	@Autowired
	private CurrentSessionDao cDao;
	
	
	@Autowired
	private MailDao mDao;



	@Override
	public String  loginUser(LoginDTO loginDTO) throws  LoginException {
        
		User existingUser = uDao.findByMobileNumber(loginDTO.getMobilenumber());
		
		if(existingUser == null) {
			throw new LoginException("Please Enter a valid mobile number");
		}
		
		Optional<CurrentUserSession> validUserSessionOpt =  cDao.findById(existingUser.getUserId());
		
		if(validUserSessionOpt.isPresent()) {
			throw new LoginException("User already Logged In with this number");
		}
		
		if(existingUser.getPassword().equals(loginDTO.getPassword())) {
			
			String key= RandomString.make(6);
			
			CurrentUserSession currentUserSession = new CurrentUserSession(existingUser.getUserId(),key,LocalDateTime.now());
			
			cDao.save(currentUserSession);

			return currentUserSession.toString();
			
		}else {
			throw new LoginException("Please Enter a valid password");
		}
		
		
	}
	
	
	

	@Override
	public String logOutUser(String key) throws LoginException {
		
        CurrentUserSession currentUserloginSession = cDao.findByUuid(key);
		
		
		if(currentUserloginSession == null) {
			throw new LoginException("User key is invalide");
			
		}
		
		cDao.delete(currentUserloginSession);
		
		return "Logged Out !";
	}

}
