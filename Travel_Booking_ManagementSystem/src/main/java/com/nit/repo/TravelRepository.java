package com.nit.repo;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.Travel;

public interface TravelRepository extends CrudRepository<Travel, Long>
{

}
