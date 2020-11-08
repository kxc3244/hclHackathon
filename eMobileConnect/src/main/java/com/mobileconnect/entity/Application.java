package com.mobileconnect.entity;

import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Application {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer applicationId;
	private Status status;
	
	private Integer customerId;
	private Integer planId;
	private String comment;
	private String assignedNumber;
	private Set<Document> documents;

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAssignedNumber() {
		return assignedNumber;
	}

	public void setAssignedNumber(String assignedNumber) {
		this.assignedNumber = assignedNumber;
	}

	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}
	
}
