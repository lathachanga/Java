package com.greet.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmpImpl {
	
	@Autowired
	JdbcTemplate jt;
	public void insertRecords() {
		
		System.out.println("Test");
		jt.update("insert into employee values(1001, 'latha', 50000)");
	}
}
