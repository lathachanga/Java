package com.crm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crm.model.CustomerBean;

@Repository
public class RegisterImplDao {
  
	@Autowired
	JdbcTemplate jt;
	
	public boolean saveCustomer(CustomerBean customerBean) {
		String st="insert into emp values(?,?,?,?)";
		jt.update(st,customerBean.getName(),customerBean.getEmail(),customerBean.getPassword(),customerBean.getMobile());
		return true;
		
	}
}
