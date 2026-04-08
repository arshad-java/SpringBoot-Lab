package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.nit.controller.EmployeeController;
import com.nit.entity.Employee;

@Component
public class EmployeeRunner implements CommandLineRunner{

	@Autowired
	EmployeeController controller;
	
	@Override
	public void run(String... args) throws Exception {
		
		Page<Employee> fetchEmployee = controller.fetchEmployee(PageRequest.of(0, 4));
		fetchEmployee.forEach(System.out::println);
		//controller.fetchEmpSort(Sort.by(Direction.ASC, "salary"));
	}

}
