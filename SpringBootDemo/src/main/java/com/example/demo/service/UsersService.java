package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.UsersData;
import com.example.demo.dto.UserRequest;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepo;
	
	@Autowired
	private AddressRepository addressRepo;
	
	public List<UserRequest> getUsers() {
		return usersRepo.findAll()
				.stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}
	
	public Optional<UserRequest> getUser(long id) {
		return usersRepo.findById(id)
				.stream()
				.map(this::convertEntityToDto)
				.findFirst();
	}
			
	public UserRequest createUser(UsersData userData) {
		usersRepo.save(userData);
		return convertEntityToDto(userData);
	}
	
	public UserRequest updateUser(long id,UsersData userData) {
		usersRepo.findById(id).orElseThrow();
		usersRepo.save(userData);
		return convertEntityToDto(userData);
	}

	public void deleteUser(long id) {
		usersRepo.findById(id).orElseThrow();
		usersRepo.deleteById(id);
	}
	
	public void deleteUsers() {
		usersRepo.deleteAll();
	}
	
	public UserRequest convertEntityToDto(UsersData userData) {
		UserRequest userRequest = new UserRequest();
		userRequest.setUserId(userData.getId());
		userRequest.setName(userData.getName());
		userRequest.setUsername(userData.getUsername());
		userRequest.setEmail(userData.getEmail());
		userRequest.setCity(userData.getAddress().getCity());
		userRequest.setZipcode(userData.getAddress().getZipcode());
		return userRequest;
	}
}
