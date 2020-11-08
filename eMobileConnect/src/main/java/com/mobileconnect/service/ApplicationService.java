package com.mobileconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileconnect.dto.ConnectionRequest;

@Service
public class ApplicationService {

	@Autowired
	private CustomerService customerService;
	private PlanService planService;
	
	public ApplicationService() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer saveConnectionRequest(ConnectionRequest connectionRequst) {
		customerService.saveCustomer(connectionRequst.getCustomer());
		planService.savePlan(connectionRequst.getPlan());
		return null;
	}

}
