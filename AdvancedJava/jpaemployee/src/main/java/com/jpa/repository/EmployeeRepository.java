package com.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	List<Employee> findByEmpLoc(String Loc);
	
      
}