package com.mysql.Demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Database {
	@Autowired
	JdbcTemplate jt;
	public void insertData() {
		System.out.println("inserted");
		
	}
	public List getData() {
		
		return null;
	}
	

}
