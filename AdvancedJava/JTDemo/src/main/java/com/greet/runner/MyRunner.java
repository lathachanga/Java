package com.greet.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.greet.dao.EmployeeImp;

@Component
public class MyRunner implements CommandLineRunner{
	
	@Autowired
	EmployeeImp e;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Inside runner class");
		e.insertRecords();
		List li=e.selectRecords();
		li.forEach(map->System.out.println(map));
		
	}
   
}
