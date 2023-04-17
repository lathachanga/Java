package com.jpa.runner;


import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.model.Employee;
import com.jpa.repository.EmployeeRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	EmployeeRepository empRepo;

	@Override
	public void run(String... args) throws Exception {
	  // insert operation
		//empRepo.save(new Employee("Rahul","Gandhi","rahul@gmail.com","Banglore",45000.00));
		//empRepo.save(new Employee("sonia","Gandhi","sonia@gmail.com","Banglore",55000.00));
		//empRepo.save(new Employee("Priyanka","Gandhi","priyanka@gmail.com","Banglore",35000.00));
		
		//fetch data based on condition
	//   empRepo.findByEmpLoc("Banglore").forEach(System.out::println);
		List<Employee> empList=empRepo.findByEmpLoc("Banglore");
		//empRepo.findByEmpLoc("Banglore").forEach(emp->System.out.println(emp.getEmpFirstName()));
		
		Iterator itr=empList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		
	}

}
