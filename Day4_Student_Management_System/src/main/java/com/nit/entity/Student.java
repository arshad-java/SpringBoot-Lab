package com.nit.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	@Id
	Long id;
	String name;
	String course;
	Double marks;
	String grade;
	String city;
	Boolean passed;

}
