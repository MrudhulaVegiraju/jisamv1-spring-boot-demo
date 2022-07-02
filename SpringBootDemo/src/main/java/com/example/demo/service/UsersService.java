package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.UsersData;
import com.example.demo.repository.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepo;
	
	public List<UsersData> getUsers() {
		return usersRepo.findAll();
	}
	
	public Optional<UsersData> getUser(int id) {
		return usersRepo.findById(id);
	}
	
	public UsersData createUser(UsersData userData) {
		return usersRepo.save(userData);
	}
	
	public UsersData updateUser(int id,UsersData userData) {
		//usersRepo.findById(id);
		return usersRepo.save(userData);
	}

	public void deleteUser(int id) {
		usersRepo.deleteById(id);
	}
	
	public void deleteUsers() {
		usersRepo.deleteAll();
	}
}
