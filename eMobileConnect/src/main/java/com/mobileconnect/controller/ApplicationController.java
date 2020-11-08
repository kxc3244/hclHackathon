package com.mobileconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobileconnect.dto.ConnectionRequest;
import com.mobileconnect.service.ApplicationService;

@RestController
@RequestMapping("/mobileconnect")
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;
	
	public ApplicationController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping("/requestConnection")
	public Integer requestConnection(@RequestBody ConnectionRequest connectionRequest ) {
		applicationService.saveCustomer(connectionRequest.getCustomer());
		return null;
	}

}
