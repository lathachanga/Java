package com.mysql.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mysql.Demo.Database;
@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	Database db;
	@Override
	public void run(String... args) throws Exception {
		db.insertData();
		
		
	}
	

}
