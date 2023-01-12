package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Fir;
import com.masai.entity.LoginDTO;
import com.masai.entity.User;
import com.masai.exception.UserException;
import com.masai.repo.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao udao;
	@Override
	public User registerUser(User user) throws UserException {
		// TODO Auto-generated method stub
		
		if(user==null) {
			throw new UserException("please add valid detaisls");
		}
		User use=udao.findByMobileNumber(user.getMobileNumber()); 
		if(use!=null) {
			throw new UserException("user mismatch user already registered with this mobile..");
		}
		udao.save(user);
		
		return user;
	}

	@Override
	public User loginUser(LoginDTO login) throws UserException {
		// TODO Auto-generated method stub
		User use=udao.findByMobileNumber(login.getMobileNumber()); 
		
		if(use==null) {
			
			throw new UserException("no user found with this mobile..");
		}
		if(use.getPassword().equals(login.getPassword())==false) {
			throw new UserException("wrong password ..");
		}
		
		return use;
	}

	@Override
	public List<Fir> getAllFir(Integer u_id) throws UserException {
		// TODO Auto-generated method stub
		User user=udao.findById(u_id).get();
		
		if(user==null) {
			throw new UserException("user not found...");
		}
		if(user.getFirs().size()==0) {
			throw new UserException("zero fir till now...");
		}
		return user.getFirs();
	}

}
