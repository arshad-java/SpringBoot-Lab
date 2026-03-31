package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.controller.TravelController;

@Component
public class TravelApplicationRunner implements CommandLineRunner
{
	@Autowired
	private TravelController controller;

	@Override
	public void run(String... args) throws Exception 
	{
		
		IO.println("1.Add a new travel booking.\r\n"
				+ "2.Retrieve all travel bookings.\r\n"
				+ "3.Find a travel booking by ID.\r\n"
				+ "4.Delete a travel booking by ID.\r\n"
				+ "5.Check if a travel booking exists.\r\n"
				+ "6.Count total travel bookings.\r\n"
				+ "7.Delete a specific travel booking.\r\n"
				+ "8.Delete all travel bookings.\r\n"
				+ "9.Exit.");
		
		int choice = Integer.parseInt(IO.readln());
		
		switch(choice)
		{
		case 1 ->
		{
						
		}
		
		}
		
		
	}

}
