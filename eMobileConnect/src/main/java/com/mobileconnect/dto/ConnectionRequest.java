package com.mobileconnect.dto;

import java.util.List;
import java.util.Set;

import com.mobileconnect.entity.Customer;
import com.mobileconnect.entity.Document;
import com.mobileconnect.entity.Plan;

public class ConnectionRequest {

	private Customer customer;
	private Plan plan;
	private Set<Document> documents;
	
	public ConnectionRequest() {
		// TODO Auto-generated constructor stub
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

	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

}
