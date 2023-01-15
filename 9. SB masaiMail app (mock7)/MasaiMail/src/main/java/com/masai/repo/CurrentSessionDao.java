package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.CurrentSession;

public interface CurrentSessionDao  extends JpaRepository<CurrentSession, Integer>{
	
	public CurrentSession findByUuid(String key);
}
