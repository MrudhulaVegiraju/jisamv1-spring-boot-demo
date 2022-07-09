package com.example.demo.dto;

import javax.persistence.Column;

import com.example.demo.data.UsersData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRequest {
	
	private long userId;
	private String name;
	private String username;
	private String email;
	private String city;
	private String zipcode;
	
	public UserRequest() {
		super();
	}

	public UserRequest(long userId, String name, String username, String email, String city, String zipcode) {
		super();
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.email = email;
		this.city = city;
		this.zipcode = zipcode;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
