package com.example.Mockito.Framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Mockito.Framework.Entity.Users;
import com.example.Mockito.Framework.Repository.userepository;

@Service
public class userservice {
	
@Autowired	
userepository repo;

public ResponseEntity<String>  createUsers(Users user)
{
	try
	{
		repo.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body("user created sucessfully");
	
}
	catch(Exception E)
	{
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("user NOT created sucessfully");
	}


}
}
