package com.project.demo.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.dto.UsersDto;
import com.project.demo.entity.Users;
import com.project.demo.service.IUserService;


@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	IUserService userservice;
	
	@PostMapping("/addUser")
	//add or update user
	public Users addUser(@RequestBody Users user) {
		
		
		return userservice.createUser(user);
		
	}
	
	@GetMapping("/fetchAllUsers")
	public List<UsersDto> fetchAllUsers() {
		
		
		return userservice.fetchAllUsers();
		
	}
	
	@GetMapping("/fetchUser/{id}")
	public Optional<Users> fetchUser(@PathVariable Long id) {
		
		
		return userservice.fetchUser(id);
		
	}
	
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable Long id) {
		
		
		
		return userservice.deleteUser(id);
		
	}

}
