package com.masaimail.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.masaimail.exception.UserException;
import com.masaimail.model.CurrentUserSession;
import com.masaimail.model.Mail;
import com.masaimail.model.User;
import com.masaimail.repository.CurrentSessionDao;
import com.masaimail.repository.MailDao;
import com.masaimail.repository.UserDao;


@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserDao uDao;
	
	@Autowired
	private CurrentSessionDao cDao;
	
	@Autowired
	private MailDao mDao;

	
	
	
	@Override
	public User registeruser(User user) throws UserException {
		
		User existingUser = uDao.findByMobileNumber(user.getMobileNumber());
		
		if(existingUser!=null) {
			throw new UserException("User already registered With Mobile "+user.getMobileNumber());
		}
		
		return uDao.save(user);
	}




	@Override
	public User updateUser(User user, String key) throws UserException {
		CurrentUserSession currentUserLoginSession =	cDao.findByUuid(key);
		
		if(currentUserLoginSession==null)
			throw new UserException("User Not logged in");
		
		if(user==null)
			throw new UserException("User Deatils Improper");
		
		return uDao.save(user);
	}




	@Override
	public List<Mail> checkAllMail(String key) throws UserException {
		CurrentUserSession currentUserLoginSession =	cDao.findByUuid(key);
		if(currentUserLoginSession==null) {
			throw new UserException(" Login first ");
		}
		
		Optional<User> opt =uDao.findById(currentUserLoginSession.getUserid());
		
		List<Mail> list =	opt.get().getRecievedMails();
		
		return list;
	}




	@Override
	public List<Mail> checkAllStarredMail(String key) throws UserException {
		CurrentUserSession currentUserLoginSession =	cDao.findByUuid(key);
		
		if(currentUserLoginSession==null)
			throw new UserException("User Not logged in");
		
		Optional<User> opt =uDao.findById(currentUserLoginSession.getUserid());
		
		List<Mail> list =	opt.get().getRecievedMails().stream()
														.filter(e -> e.getStarrred()==true )
														.collect(Collectors.toList());
		return list;
	}
	
	
	
	

}
