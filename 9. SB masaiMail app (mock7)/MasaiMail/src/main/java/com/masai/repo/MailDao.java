package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Mail;

public interface MailDao extends JpaRepository<Mail, Integer> {

}
