package com.nit.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.entity.FoodOrder;
import com.nit.service.FoodOrderService;

@Controller
public class FoodOrderController {
	
	@Autowired
	FoodOrderService orderService;
	
	
	public FoodOrder save(FoodOrder order) {

		return orderService.save(order);

	}

	
	public Iterable<FoodOrder> saveAll(Iterable<FoodOrder> orders) {
		
		return orderService.saveAll(orders);

	}

	
	public Optional<FoodOrder> findById(Long id) {
		return orderService.findById(id);
	}

	
	public Iterable<FoodOrder> findAll() {
		return orderService.findAll();
	}

	
	public Iterable<FoodOrder> findAll(Iterable<Long> ids) {
		return orderService.findAll(ids);
	}

	
	public boolean existsById(Long id) {

		return orderService.existsById(id);
	}

	
	public Long count() {
		
		return orderService.count();
	}

	
	public void delete(FoodOrder order) {
		orderService.delete(order);
	}

	
	public void deleteAllById(Iterable<Long> ids) {
		orderService.deleteAllById(ids);
	}

	
	public void deleteAll() {
		orderService.deleteAll();
	}

	
	public void deleteAll(Iterable<? extends FoodOrder> order) {
		orderService.deleteAll(order);
	}

}
