package com.masaimail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masaimail.model.CurrentUserSession;




@Repository
public interface CurrentSessionDao  extends JpaRepository<CurrentUserSession, Integer>{
	
	public CurrentUserSession findByUuid(String key);
	
	
}
