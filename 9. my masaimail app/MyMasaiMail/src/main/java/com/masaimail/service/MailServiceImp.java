package com.masaimail.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.masaimail.exception.MailException;
import com.masaimail.exception.UserException;
import com.masaimail.model.CurrentUserSession;
import com.masaimail.model.Mail;
import com.masaimail.repository.CurrentSessionDao;
import com.masaimail.repository.MailDao;
import com.masaimail.repository.UserDao;





@Service
public class MailServiceImp implements MailService{

	@Autowired
	private UserDao uDao;
	
	@Autowired
	private CurrentSessionDao cDao;
	
	
	@Autowired
	private MailDao mDao;


	@Override
	public Mail sendMail(Mail mail, String key) throws MailException {
		CurrentUserSession currentUserLoginSession =	cDao.findByUuid(key);
		if(currentUserLoginSession==null)
			throw new UserException("User Not logged in");
		
		if(mail==null)
			throw new MailException("Mail Details Improper");
		
		return mDao.save(mail);
		
	}


	@Override
	public String deleteMail(Integer id, String key) throws MailException, UserException {
		
		CurrentUserSession currentUserLoginSession =	cDao.findByUuid(key);
		
		if(currentUserLoginSession==null)
			throw new UserException("User Not logged in");
		
		Optional<Mail> opt =	mDao.findById(id);
		
		if(opt.isEmpty())
			throw new MailException("mail not found");
		
		Mail mail = opt.get();
		
		mDao.delete(mail);
		
		return "Deleted Successfully";
	}
	
	
	@Override
	public Mail starMail(Integer mail_id, String key) throws MailException, UserException {
		
		CurrentUserSession currentUserLoginSession =	cDao.findByUuid(key);
		
		if(currentUserLoginSession==null)
			throw new UserException("User Not logged in");
		
		Optional<Mail> opt =	mDao.findById(mail_id);
		if(opt.isEmpty())
			throw new MailException("mail not found");
		Mail mail = opt.get();
		mail.setStarrred(true);
		return mDao.save(mail);
	}
	
	

}
