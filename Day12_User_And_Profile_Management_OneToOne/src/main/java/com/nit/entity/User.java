package com.nit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@RequiredArgsConstructor
@Table(name = "user12")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@NonNull
	String name;
	@NonNull
	String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pid")
	@NonNull
	Profile profile;


}
