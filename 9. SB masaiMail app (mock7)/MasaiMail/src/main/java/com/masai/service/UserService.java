package com.masai.service;

import java.util.List;

import com.masai.exception.UserException;
import com.masai.model.LoginDTO;
import com.masai.model.Mail;
import com.masai.model.User;

public interface UserService {
	
	
	public User registeruser(User user) throws UserException;
	public User loginUser(LoginDTO loginDTO) throws UserException;
	
	public List<Mail> checkAllMail(String key) throws UserException;
	
	public List<Mail> checkAllStarredMail(String key) throws UserException;
	
	public User updateUser(User user,String key) throws UserException;
}
