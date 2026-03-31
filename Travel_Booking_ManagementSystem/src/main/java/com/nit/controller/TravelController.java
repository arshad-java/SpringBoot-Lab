package com.nit.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.nit.entity.Travel;
import com.nit.service.TravelService;

@Controller
public class TravelController 
{
	@Autowired
	TravelService service;

	
	public void addTravel(Travel travel) 
	{		
		service.addTravel(travel);	
	}

	
	public Iterable<Travel> getAllTravels() {
		
		return service.getAllTravels();
	}


	public Optional<Travel> findTravelById(Long id) {
		return service.findTravelById(id);
	}


	public void deleteTravleById(Long id) {
		service.deleteTravleById(id);
		
	}

	public boolean existsById(Long id) {
		
		return service.existsById(id);
	}

	
	public long count() {
		return service.count();
	}

	
	public void delete(Travel travel) {
		service.delete(travel);
		
	}

	
	public void deleteAll() 
	{
		service.deleteAll();		
	}
	
}
