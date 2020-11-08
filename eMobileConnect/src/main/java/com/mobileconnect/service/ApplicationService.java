package com.mobileconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileconnect.entity.Customer;

@Service
public class ApplicationService {

	@Autowired
	private CustomerService customerService;
	
	public ApplicationService() {
		// TODO Auto-generated constructor stub
	}
	
	public void saveCustomer(Customer customer) {
		customerService.saveCustomer(customer);
	}

}
