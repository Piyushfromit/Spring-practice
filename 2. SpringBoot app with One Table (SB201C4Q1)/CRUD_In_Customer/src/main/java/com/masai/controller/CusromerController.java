package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Customer;
import com.masai.model.CustomerDTO;

import com.masai.servuce.CustomerService;


@RestController
public class CusromerController {
	
	@Autowired
	CustomerService cService;
	
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer) {

		Customer cus = cService.registerCustomer(customer);

		return new ResponseEntity<Customer>(cus, HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Integer cusid) {

		Customer cus = cService.getCustomerById(cusid);

		return new ResponseEntity<Customer>(cus, HttpStatus.OK);
	}
	
	
	
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomerDetails() {

		return new ResponseEntity<List<Customer>>(cService.getAllCustomerDetails(), HttpStatus.OK);
	}
	
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Customer> deleteCustomerById(@PathVariable("id") Integer empId) {

		return new ResponseEntity<Customer>(cService.deleteCustomerById(empId), HttpStatus.CREATED);

	}
	
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<List<Customer>> getCustomerDetailsByAddress(@PathVariable("id") String address) {

		return new ResponseEntity<List<Customer>>(cService.getCustomerDetailsByAddress(address), HttpStatus.OK);

	}
	
	
	@GetMapping("/employeeSA/{id}")
	public ResponseEntity<String> getNameAndAddressOfCustomerById(@PathVariable("id") Integer cusId) {
			
		return new ResponseEntity<String>(cService.getNameAndAddressOfCustomerById(cusId), HttpStatus.OK);
	}
	
	
	
	@PutMapping("/employee")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer newcustomer) {
		
		Customer customer = cService.updateCustomer(newcustomer);

		return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);

	}


	
	@GetMapping("/emplogin/{email}")
	public ResponseEntity<Customer> login(@PathVariable("email") String email,@RequestParam String password) {
		
		Customer cus = cService.loginCustomer(email, password);

		return new ResponseEntity<Customer>(cus, HttpStatus.OK);

	}
	
	
//	@GetMapping("/employeeD")
//	public  ResponseEntity<List<CustomerDTO>> getNameAddressSalaryOfAllEmployee(){
//		
//		return new ResponseEntity<List<CustomerDTO>>(cService.getNameAddressAgeOfAllCustomers(), HttpStatus.OK);
//	}
	
	

}
