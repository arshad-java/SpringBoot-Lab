package com.nit.service;

import java.util.List;
import java.util.Optional;

import com.nit.entity.User;

public interface IUserService {
	
	void add(User user);
	List<User> getDetails();
	void updateUser(Long id,User user);
	Optional<User> deleteUser(Long id);

}
