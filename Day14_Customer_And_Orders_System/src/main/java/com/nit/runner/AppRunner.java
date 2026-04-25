package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.service.CustomerService;

@Component
public class AppRunner implements CommandLineRunner {
	
	@Autowired
	CustomerService service;

	@Override
	public void run(String... args) throws Exception {
		
		while(true)
		{
			IO.println("1. add");
			IO.println("2. add");
			IO.println("1. add");
			IO.println("1. add");
		}
		
		
		
	}

}
