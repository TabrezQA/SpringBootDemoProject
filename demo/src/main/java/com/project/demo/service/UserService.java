package com.project.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.dto.UsersDto;
import com.project.demo.entity.Users;
import com.project.demo.repository.UserRepository;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private UserRepository userRepo;
	
	public Users createUser(Users user) {
		
		return userRepo.save(user);
	}

	
	public List<UsersDto> fetchAllUsers() {
	
		List<Users> values = userRepo.findAll();
		List<UsersDto> response = new ArrayList<>();
		for(Users data : values) {
		UsersDto retValue = UsersDto.builder().address(data.getAddress())
							.id(data.getId())
							.name(data.getName()).build();
		response.add(retValue);
		}
		return response;
	}


	
	public Optional<Users> fetchUser(Long id) {
		
		return userRepo.findById(id);
	}


	
	public String deleteUser(Long id) {
		
		if(userRepo.findById(id).isEmpty()) {
			
			
			return("does not exist!!!!!!");
			
		}
		
		else {
			userRepo.deleteById(id);
			return("done!!!!!!");
			
	}

}
}
