package com.masai.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.UserException;
import com.masai.model.CurrentSession;
import com.masai.model.LoginDTO;
import com.masai.model.Mail;
import com.masai.model.User;
import com.masai.repo.CurrentSessionDao;
import com.masai.repo.UserDao;

import net.bytebuddy.utility.RandomString;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private CurrentSessionDao currentSessionDao;
	@Override
	public User registeruser(User user) throws UserException {
		User us = userDao.findByMobileNumber(user.getMobileNumber());
		if(us!=null)
			throw new UserException("User already registered With Mobile "+user.getMobileNumber());
		
		if(user==null)
			throw new UserException("User Deatils Improper");
		
		return userDao.save(user);
	}

	@Override
	public User loginUser(LoginDTO loginDTO) throws UserException {
		User user = userDao.findByMobileNumber(loginDTO.getMobile());
		if(user==null)
			throw new UserException("User Not Found With Mobile "+loginDTO.getMobile());
		
		if(!user.getPassword().equals(loginDTO.getPassword()))
			throw new UserException("wrong password");
		String uuid = RandomString.make(6);
		
		CurrentSession curr = new CurrentSession(user.getUserId(), uuid, LocalDateTime.now());
		
		currentSessionDao.save(curr);
		return user;
	}

	@Override
	public List<Mail> checkAllMail(String key) throws UserException {
			CurrentSession curr =	currentSessionDao.findByUuid(key);
			if(curr==null)
				throw new UserException("User Not logged in");
			
			Optional<User> opt =userDao.findById(curr.getUserid());
			
			List<Mail> list =	opt.get().getRecievedMails();
			return list;
	}

	@Override
	public List<Mail> checkAllStarredMail(String key) throws UserException {
		CurrentSession curr =	currentSessionDao.findByUuid(key);
		if(curr==null)
			throw new UserException("User Not logged in");
		
		Optional<User> opt =userDao.findById(curr.getUserid());
		
		List<Mail> list =	opt.get().getRecievedMails().stream()
														.filter(e -> e.getStarrred()==true )
														.collect(Collectors.toList());;
		return list;
	}

	@Override
	public User updateUser(User user,String key) throws UserException {
		CurrentSession curr =	currentSessionDao.findByUuid(key);
		if(curr==null)
			throw new UserException("User Not logged in");
		
		if(user==null)
			throw new UserException("User Deatils Improper");
		
		return userDao.save(user);

	}

}
