package com.masai.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	public User findByMobileNumber(String mobileNumber);
	
	
}
