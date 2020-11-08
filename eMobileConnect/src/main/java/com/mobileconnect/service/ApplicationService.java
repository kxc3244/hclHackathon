package com.mobileconnect.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileconnect.dto.ConnectionRequest;
import com.mobileconnect.entity.Application;
import com.mobileconnect.repository.ApplicationRepository;

@Service
public class ApplicationService {

	@Autowired
	private ApplicationRepository applicationRepository;
	
	public ApplicationService() {
		// TODO Auto-generated constructor stub
	}
	
	@Transactional
	public Integer saveConnectionRequest(ConnectionRequest connectionRequst) {
		Application application = new Application();
		application.setCustomer(connectionRequst.getCustomer());
		application.setPlan(connectionRequst.getPlan());
		application.setDocuments(connectionRequst.getDocuments());
		return applicationRepository.save(application).getApplicationId();
	}

}
