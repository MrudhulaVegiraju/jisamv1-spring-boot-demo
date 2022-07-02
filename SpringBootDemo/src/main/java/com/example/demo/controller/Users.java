package com.example.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.UsersData;
import com.example.demo.service.UsersService;

@RestController
public class Users {
	
	@Autowired
	private UsersService users;
	
	@GetMapping("/users")
	public List<UsersData> getUsers() {
		return users.getUsers();
	}
	
	@GetMapping("/user/{id}")
	public Optional<UsersData> getUser(@PathVariable int id) {
		return users.getUser(id);
	}
	
	@PostMapping("/user")
	public UsersData createUser(@RequestBody UsersData userData) {
		return users.createUser(userData);
	}
	
	@PutMapping("/user/{id}")
	public UsersData updateUser(@PathVariable int id, @RequestBody UsersData userData) {
		return users.updateUser(id,userData);
	}	
	
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id) {
		users.deleteUser(id);
		return("Deleted successfully");
	}	
	
	@DeleteMapping("/users")
	public String deleteUsers() {
		users.deleteUsers();
		return("All users deleted successfully");
	}	
}
