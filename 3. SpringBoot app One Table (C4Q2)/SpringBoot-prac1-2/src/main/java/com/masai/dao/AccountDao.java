package com.masai.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Account;

public interface AccountDao extends JpaRepository<Account, Integer> {

	 
	

}
