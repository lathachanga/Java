package com.psa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DAoImpl implements DAOInterface {
	
	@Autowired
	JdbcTemplate jt;

	@Override
	public void insertRecords() {
		System.out.println("Hello...");
		String inst="insert into employee values(107,'pink',30000)";
		jt.update(inst);
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List selectData() {
		System.out.println("Hello...     hello");
		List l=jt.queryForList("select * from employee");
		return l;
	}

}
