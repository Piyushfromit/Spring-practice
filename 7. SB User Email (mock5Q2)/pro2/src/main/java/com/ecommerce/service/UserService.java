package com.ecommerce.service;

import java.util.List;

import com.ecommerce.exception.UserException;
import com.ecommerce.model.Email;
import com.ecommerce.model.User;



public interface UserService {

	public List<User> getAllUsers() throws UserException;
	
	public User saveUser(User user) throws UserException;
	
	public User getUserById(Integer userId) throws UserException;
	
	public User deleteUser(Integer userId) throws UserException;
	
	public User findByEmail(String email) throws UserException;
	

	public Email saveEmail(Email email) throws UserException;

	
}
	
	
	
	
	

