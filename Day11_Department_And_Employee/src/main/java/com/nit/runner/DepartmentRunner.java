package com.nit.runner;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Department;
import com.nit.entity.Employee;
import com.nit.service.DepartmentService;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class DepartmentRunner implements CommandLineRunner {

	@Autowired
	DepartmentService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		while(true)
		{
			
			IO.println("1. Add Department");
			IO.println("2. View Department");
			IO.println("3. Exit");
			int choice = Integer.parseInt(IO.readln("Enter your choice :"));
			
			switch(choice)
			{
			case 1->{
				Long id = Long.parseLong(IO.readln("Enter Dept id :"));
				String name = IO.readln("Enter Dept Name :");
				int num = Integer.parseInt(IO.readln("Enter your choice :"));
				ArrayList<Employee> list = new ArrayList<>();
				for(int i=1;i<=num;i++)
				{
					Long eid = Long.parseLong(IO.readln("Enter Employee id :"));
					String ename = IO.readln("Enter Employee Name :");
					list.add(new Employee(eid, ename));
					
				}
				service.addDept(new Department(id, name, list));
			}
			case 2->{
				service.viweDept().forEach(IO::println);
				
			}
			default->{
				break;
			}
			}
			
		}


		
	}
	
	

}
