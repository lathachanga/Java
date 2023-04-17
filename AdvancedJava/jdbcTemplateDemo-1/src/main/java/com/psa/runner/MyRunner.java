package com.psa.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.psa.data.Student;

@Component
public class MyRunner implements CommandLineRunner {
  @Autowired
  Student st;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("run....");
		st.insertData();
		List list=st.getData();
		list.forEach(x->System.out.println(x));
	}

}
