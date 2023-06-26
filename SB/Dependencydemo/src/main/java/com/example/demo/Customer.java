package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	private  int custId;
	private String custName;
	private String custCourse;
	@Autowired
	private Technology tech;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustCourse() {
		return custCourse;
	}
	public void setCustCourse(String custCourse) {
		this.custCourse = custCourse;
	}
	public void display() {
		System.out.println("object created successfully for customer class");
		tech.display();
	}
	
	
}
