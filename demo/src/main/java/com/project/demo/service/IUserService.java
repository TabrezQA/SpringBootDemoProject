package com.project.demo.service;

import java.util.List;
import java.util.Optional;

import com.project.demo.dto.UsersDto;
import com.project.demo.entity.Users;


public interface IUserService {

	Users createUser(Users user);
	
	List<UsersDto> fetchAllUsers();
	
	Optional<Users> fetchUser(Long id);

	String deleteUser(Long id);
}
