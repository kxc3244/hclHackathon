package com.mobileconnect.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Application {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer applicationId;
	private Status status;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id")	
	private Customer customer;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id")	
	private Plan plan;
	private String comment;
	private String assignedNumber;
	@OneToMany(mappedBy = "application", cascade = CascadeType.ALL)
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
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
