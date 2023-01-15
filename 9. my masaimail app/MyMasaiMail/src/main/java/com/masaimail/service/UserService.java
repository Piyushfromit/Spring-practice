package com.masaimail.service;

import java.util.List;


import com.masaimail.exception.UserException;
import com.masaimail.model.Mail;
import com.masaimail.model.User;




public interface UserService {

	public User registeruser(User user) throws UserException;
	
	public User updateUser(User user,String key) throws UserException;
	
	public List<Mail> checkAllMail(String key) throws UserException;
	
	public List<Mail> checkAllStarredMail(String key) throws UserException;
	
	
	
}
