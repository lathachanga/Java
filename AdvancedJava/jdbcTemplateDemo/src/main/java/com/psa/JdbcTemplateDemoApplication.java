package com.psa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JdbcTemplateDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JdbcTemplateDemoApplication.class, args);
	}
	@Autowired
	JdbcTemplate jt;

	@Override
	public void run(String... args) throws Exception {
		String s="insert into student(sno,sname,marks,college) values(?,?,?,?)";
		int result=jt.update(s,"120","fruit","95","Aaditya");
		if(result>0) {
			System.out.println("A new row has been inserted");
		}
		
	}

}
