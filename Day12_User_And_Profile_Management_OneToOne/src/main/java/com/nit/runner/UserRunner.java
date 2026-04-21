package com.nit.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Profile;
import com.nit.entity.User;
import com.nit.service.UserService;

@Component
public class UserRunner implements CommandLineRunner {
	
	@Autowired
	UserService service;

	@Override
	public void run(String... args) throws Exception {
		
		while(true)
		{
			System.out.println("1. Add");
			System.out.println("2. View");
			System.out.println("4. Update");
			System.out.println("5. Delete");
			System.out.println("6. exit");
			
			int choice = Integer.parseInt(IO.readln("Enter Your Choice: "));
			
			switch(choice)
			{
			case 1->{
				//Long id = Long.parseLong(IO.readln("Enter Long ID"));
				String name = IO.readln("Enter Name :");
				String email= IO.readln("Enter Email :");
				String phno= IO.readln("Enter Ph Number :");
				String addr= IO.readln("Enter Address :");				
				service.add(new User(name,email,new Profile( phno, addr)));
				
				
			}
			case 2->{
				service.getDetails().forEach(IO::println);
			}
			case 4->{
				Long id = Long.parseLong(IO.readln("Enter id"));
				String name = IO.readln("Enter Name :");
				String email= IO.readln("Enter Email :");
				String phno= IO.readln("Enter Ph Number :");
				String addr= IO.readln("Enter Address :");	
				service.updateUser(id, new User(null,name,email,new Profile(null, phno, addr)));
				
			}
			case 5->{
				Long id = Long.parseLong(IO.readln("Enter id"));
				 service.deleteUser(id).ifPresent(i->{
					IO.println(i.getId()+" deleted");
				});		
				
			}
			default ->{
				break;
			}
			}
		}
		
	}

}
