package com.nit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Order_Tab")
public class Order {
	
	@Id
	Long id;
	String customerName;
	String productName;
	Double amount;
	LocalDate orderDate;
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
}
