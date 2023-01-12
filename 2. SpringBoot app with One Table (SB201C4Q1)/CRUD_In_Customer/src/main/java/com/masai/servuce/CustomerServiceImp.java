package com.masai.servuce;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.exception.CustomerException;

import com.masai.model.Customer;
import com.masai.model.CustomerDTO;

import com.masai.repository.CustomerDao;

@Service
public class CustomerServiceImp  implements CustomerService {

	@Autowired
	private CustomerDao cDao;
	
	
	
	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		if(customer== null) {
			throw new CustomerException("Customer not registered");
		}else {
			cDao.save(customer);
		}
		return customer;
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerException {
		// TODO Auto-generated method stub
		Optional<Customer> customer = cDao.findById(customerId);

		return customer.orElseThrow(() -> new CustomerException("Customer not found"));
		
	}


	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {
		// TODO Auto-generated method stub
		List<Customer> list = cDao.findAll();
		if (list.size() == 0) {
			throw new CustomerException("No any Customer Found");
		}
		return list;
	}

	@Override
	public Customer deleteCustomerById(Integer customerId) throws CustomerException {
		// TODO Auto-generated method stub
		Optional<Customer> opt = cDao.findById(customerId);
		if (opt.isPresent()) {
			cDao.delete(opt.get());
		} else {
			throw new CustomerException("Customer not found");
		}
		return opt.get();
	}
	

	@Override
	public List<Customer> getCustomerDetailsByAddress(String address) throws CustomerException {
		// TODO Auto-generated method stub
		List<Customer> list = cDao.findByAddress(address);
		if (list.size() == 0) {
			throw new CustomerException("Customer not found with this id");
		}

		return list;
	}
	
	
	@Override
	public String getNameAndAddressOfCustomerById(Integer customerId) throws CustomerException {
		// TODO Auto-generated method stub
		String str = cDao.getNameAndAddressOfCustomrerById(customerId);
		if (str == null) {
			throw new CustomerException("emp not found");
		}
		return str;
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		Optional<Customer> opt = cDao.findById(customer.getCustomerId());
		if (opt.isPresent()) {
			cDao.save(customer);
			
		} else {
			throw new CustomerException("Customer not found");
		}
		return customer;
	}


	
	@Override
	public Customer loginCustomer(String email, String password) {
		// TODO Auto-generated method stub
		Customer customer = cDao.login(email, password);
		if (customer == null) {
			throw new CustomerException("Customer not found");
		}
		return customer;
	}

	@Override
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers() throws CustomerException {
		// TODO Auto-generated method stub
		List<CustomerDTO> list = cDao.getNameAddressAgeOfAllCustomer();
		if (list.size() == 0) {
			throw new CustomerException("Customer not found with");
		}
		return list;
	}
	


}
