package com.example.demo.service;

import java.util.List;
import java.util.Optional;

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
	
	public List<UsersData> getUsers() {
		return usersRepo.findAll();
	}
	
	public Optional<UsersData> getUser(long id) {
		return usersRepo.findById(id);
	}
	
	public UsersData createUser(UsersData userData) {
		return usersRepo.save(userData);
	}
	
//	public UsersData createUser(UserRequest request) {
//		return usersRepo.save(request.getUserdto());
//	}
//	
	public UsersData updateUser(long id,UsersData userData) {
		//usersRepo.findById(id);
		return usersRepo.save(userData);
	}

	public void deleteUser(long id) {
		usersRepo.deleteById(id);
	}
	
	public void deleteUsers() {
		usersRepo.deleteAll();
	}
}
