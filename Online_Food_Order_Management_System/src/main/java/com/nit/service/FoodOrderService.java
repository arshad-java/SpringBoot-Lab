package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.FoodOrder;
import com.nit.repo.FoodOrderRepository;

@Service
public class FoodOrderService implements IFoodOrderService {
	@Autowired
	FoodOrderRepository repository;

	private FoodOrder getTotalPrice(FoodOrder foodOrder) {
		double totalAmount = foodOrder.getQuantity() * foodOrder.getPricePerItem();
		if (foodOrder.getQuantity() <= 0 || foodOrder.getPricePerItem() <= 0) {
			throw new IllegalArgumentException("Invalid Inputs");
		} else {
			if (foodOrder.getQuantity() > 5)
				totalAmount -= (totalAmount * 0.10);
			if (totalAmount > 1000)
				totalAmount -= 100;
		}
		foodOrder.setTotalAmount(totalAmount);
		return foodOrder;

	}

	@Override
	public FoodOrder save(FoodOrder order) {

		return repository.save(getTotalPrice(order));

	}

	@Override
	public Iterable<FoodOrder> saveAll(Iterable<FoodOrder> orders) {
		for (FoodOrder order : orders)
			getTotalPrice(order);
		return orders;

	}

	@Override
	public Optional<FoodOrder> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Iterable<FoodOrder> findAll() {
		return repository.findAll();
	}

	@Override
	public Iterable<FoodOrder> findAll(Iterable<Long> ids) {
		return repository.findAllById(ids);
	}

	@Override
	public boolean existsById(Long id) {

		return repository.existsById(id);
	}

	@Override
	public Long count() {
		
		return repository.count();
	}

	@Override
	public void delete(FoodOrder order) {
		repository.delete(order);
	}

	@Override
	public void deleteAllById(Iterable<Long> ids) {
		repository.deleteAllById(ids);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends FoodOrder> order) {
		repository.deleteAll(order);
	}

}
