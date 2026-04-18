package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Department;
import com.nit.repo.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository repository;
	
	public void addDept(Department department)
	{
		repository.save(department);
	}
	
	public List<Department> viweDept()
	{
		return  repository.findAll();
	}

	

}
