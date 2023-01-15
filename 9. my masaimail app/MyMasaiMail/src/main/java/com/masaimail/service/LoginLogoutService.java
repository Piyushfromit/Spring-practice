package com.masaimail.service;


import javax.security.auth.login.LoginException;

import com.masaimail.exception.UserException;
import com.masaimail.model.LoginDTO;
import com.masaimail.model.User;

public interface LoginLogoutService {
	
	
	public String  loginUser(LoginDTO loginDTO) throws  LoginException;
	
	
	public String logOutUser(String key)throws LoginException;

}
