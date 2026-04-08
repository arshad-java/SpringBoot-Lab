package com.nit.repo;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.nit.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{

	//Page<Employee> findAll(Pageable pageable);
	

}
