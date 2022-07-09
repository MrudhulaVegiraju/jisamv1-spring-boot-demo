package com.example.demo.dto;

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
	
	  private UsersData userdto;
	  
	  

	
	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserRequest(UsersData userdto) {
		super();
		this.userdto = userdto;
	}


	public UsersData getUserdto() {
		return userdto;
	}

	public void setUserdto(UsersData userdto) {
		this.userdto = userdto;
	}


	  


}
