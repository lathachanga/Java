package com.telusko.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.telusko.demo.model.Student;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);
		
		Student s=new Student();
		
		s.setName("sri");
		System.out.println(s);
	}

}
