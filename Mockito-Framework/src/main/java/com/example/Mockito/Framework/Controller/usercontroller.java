package com.example.Mockito.Framework.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mockito.Framework.Entity.Users;
import com.example.Mockito.Framework.service.userservice;

@RestController
@RequestMapping("/api")
public class usercontroller {
	
	@Autowired
	userservice service;
	

	@PostMapping("/create")
	public ResponseEntity<String> createUsers(@RequestBody Users user){
		
		return service.createUsers(user);
	}
	
}
