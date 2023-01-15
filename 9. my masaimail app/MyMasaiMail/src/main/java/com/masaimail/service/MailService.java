package com.masaimail.service;

import com.masaimail.exception.MailException;
import com.masaimail.exception.UserException;
import com.masaimail.model.Mail;

public interface MailService {
	
    public Mail sendMail(Mail mail ,String key) throws MailException;
    
    public String deleteMail(Integer id , String key) throws MailException , UserException;
	
	public Mail starMail(Integer mail_id, String key) throws MailException ,UserException;
	
	

}
