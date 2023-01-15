package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.MailException;
import com.masai.exception.UserException;
import com.masai.model.CurrentSession;
import com.masai.model.Mail;
import com.masai.repo.CurrentSessionDao;
import com.masai.repo.MailDao;
import com.masai.repo.UserDao;

@Service
public class MailServiceImpl  implements MailService{
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private CurrentSessionDao currentSessionDao;
	@Autowired
	private MailDao mailDao; 
	
	
	
	@Override
	public Mail sendMail(Mail mail, String key) throws MailException {
		CurrentSession curr =	currentSessionDao.findByUuid(key);
		if(curr==null)
			throw new UserException("User Not logged in");
		
		if(mail==null)
			throw new MailException("Mail Details Improper");
		
		return mailDao.save(mail);
		
	}

	@Override
	public Mail starMail(Integer mail_id, String key) throws MailException, UserException {
		CurrentSession curr =	currentSessionDao.findByUuid(key);
		if(curr==null)
			throw new UserException("User Not logged in");
		
		Optional<Mail> opt =	mailDao.findById(mail_id);
		if(opt.isEmpty())
			throw new MailException("mail not found");
		Mail mail = opt.get();
		mail.setStarrred(true);
		return mailDao.save(mail);
	}

	@Override
	public String deleteMail(Integer id, String key) throws MailException, UserException {
		CurrentSession curr =	currentSessionDao.findByUuid(key);
		if(curr==null)
			throw new UserException("User Not logged in");
		
		Optional<Mail> opt =	mailDao.findById(id);
		
		if(opt.isEmpty())
			throw new MailException("mail not found");
		
		Mail mail = opt.get();
		
		mailDao.delete(mail);
		
		return "Deleted Successfully";
	}
	
	
	
}
