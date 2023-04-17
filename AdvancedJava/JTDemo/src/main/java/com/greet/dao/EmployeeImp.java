package com.greet.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeImp {
	
	@Autowired
	JdbcTemplate jt;
	
     public void insertRecords() {
	    System.out.println("Inserting Records");
	    jt.update("insert into employee values(110,'mango',30000)");
     }
     @SuppressWarnings("rawtypes")
	public List selectRecords() {
    	 
    	 System.out.println("Getting data");
    	 List l=jt.queryForList("select * from employee");
    	 return l;
    	 
     }
}
