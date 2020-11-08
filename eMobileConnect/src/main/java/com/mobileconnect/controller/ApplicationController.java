package com.mobileconnect.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobileconnect.dto.ConnectionRequest;

@RestController
@RequestMapping("/mobileconnect")
public class ApplicationController {

	public ApplicationController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping("/requestConnection")
	public Integer requestConnection(@RequestBody ConnectionRequest connectionRequest ) {
		
		return null;
	}

}
