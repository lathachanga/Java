package com.psa.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	JdbcTemplate jt;
	
    public void insertData() {
	  System.out.println("Data inserted successfully");
	  String s="insert into student values(130,'vegetable',99,'Aaditya college')";
	  jt.update(s);
    }
    public List getData() {
    	System.out.println("data retrieved successfully");
    	List li=jt.queryForList("select * from student");
		return li;
    	
    }
}
