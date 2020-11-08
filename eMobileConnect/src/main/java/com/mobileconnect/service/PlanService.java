package com.mobileconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileconnect.entity.Plan;
import com.mobileconnect.repository.PlanRepository;

@Service
public class PlanService {

	@Autowired
	private PlanRepository planRepository;
	
	public PlanService() {
		// TODO Auto-generated constructor stub
	}

	public void savePlan(Plan plan) {
		planRepository.save(plan);
	}
}
