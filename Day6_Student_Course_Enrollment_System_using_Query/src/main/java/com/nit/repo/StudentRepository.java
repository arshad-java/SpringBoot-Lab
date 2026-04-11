package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	Iterable<Student> findStuByCourse(String course);
	Iterable<Student> findStuWithLessFee(Double fee);
	Iterable<Student> findStuByGrade(String grade);
	int countStuInCourse(String course);
	Iterable<Student> searchStuByName(String name);

}
