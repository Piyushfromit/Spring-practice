package com.masai.service;

import java.util.List;

import com.masai.entity.Fir;
import com.masai.entity.LoginDTO;
import com.masai.entity.User;
import com.masai.exception.UserException;

public interface UserService {
	
	public User registerUser(User user)throws UserException;
	public User loginUser(LoginDTO login)throws UserException;
	public List<Fir> getAllFir(Integer u_id)throws UserException;

}
