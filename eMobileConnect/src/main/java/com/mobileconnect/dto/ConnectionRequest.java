package com.mobileconnect.dto;

import java.util.List;

import com.mobileconnect.entity.Customer;
import com.mobileconnect.entity.Document;
import com.mobileconnect.entity.Plan;

public class ConnectionRequest {

	private Customer customer;
	private Plan plan;
	private List<Document> documents;
	
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

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

}
