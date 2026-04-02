package com.nit.repo;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.FoodOrder;


public interface FoodOrderRepository extends CrudRepository<FoodOrder, Long> 
{

}
