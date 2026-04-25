package com.nit.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@NonNull
	String name;
	@NonNull
	String email;
	@NonNull
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
	List<Order> orders; 

}
