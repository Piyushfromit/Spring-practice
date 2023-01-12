package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Customer;


@Repository
public interface CustomerDao  extends JpaRepository<Customer, Integer> {
	
	
	
	List<Customer> findByAddress(String address);
	
	
	@Query("select c.customerName ,c.address from Customer c where c.customerId=?1")
	String getNameAndAddressOfCustomrerById(Integer empId);
	

	@Query("select c from Customer c where c.email=?1 and c.password=?2")
	Customer login (String email, String password);
	
	
//	@Query("update Customer c set c.password =?1 where c.email=?2 and c.password=?3")
//	Customer updatePassword(String newPassword, String email, String oldPassword);
	
	
}
