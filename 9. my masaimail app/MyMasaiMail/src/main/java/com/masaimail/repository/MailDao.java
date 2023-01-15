package com.masaimail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masaimail.model.Mail;


@Repository
public interface MailDao extends JpaRepository<Mail, Integer> {

}
