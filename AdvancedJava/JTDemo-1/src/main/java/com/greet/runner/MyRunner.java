package com.greet.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.greet.dao.EmpImpl;

@Component
public class MyRunner implements CommandLineRunner
{
	@Autowired
	EmpImpl e;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Test Case2");
		e.insertRecords();
	}
	
}
