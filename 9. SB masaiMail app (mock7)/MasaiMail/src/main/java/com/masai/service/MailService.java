package com.masai.service;

import com.masai.exception.MailException;
import com.masai.exception.UserException;
import com.masai.model.Mail;

public interface MailService {
	
	public Mail sendMail(Mail mail ,String key) throws MailException;
	
	public Mail starMail(Integer mail_id, String key) throws MailException ,UserException;
	
	public String deleteMail(Integer id , String key) throws MailException , UserException;
	
	
}
