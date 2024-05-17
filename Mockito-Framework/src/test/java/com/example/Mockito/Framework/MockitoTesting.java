package com.example.Mockito.Framework;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.Mockito.Framework.Controller.usercontroller;
import com.example.Mockito.Framework.Entity.Users;

import com.example.Mockito.Framework.service.userservice;

@ExtendWith(MockitoExtension.class)
public class MockitoTesting {
	
	@Mock
	private userservice service;
	
	@InjectMocks
	private usercontroller control;
	
	@Test
	public void testcase()
	{
		Users u = new Users();
		u.setId(2L);
		u.setMail("nann");
		u.setName("nnns");
		
		when(service.createUsers(any(Users.class))).thenReturn(ResponseEntity.status(HttpStatus.CREATED).body("user created"));
		ResponseEntity<String> res= control.createUsers(u);
		//verify(service).createUsers(u);
		assertEquals(HttpStatus.CREATED,res.getStatusCode());
		assertEquals("user created",res.getBody());
		
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Mock
	userepository repo;
	
	@InjectMocks
     userservice service;
	
	//userservice service = new userepository();
	
	@Test
	public void testcase1() {
		
		Users u = new Users();
		u.setId(1L);
		u.setName("nandhini");
		u.setMail("nandhini@gmail.com");
		
		//setting mockito behaviour
		when(repo.save(any(Users.class))).thenReturn(u);
		
		Users saveduser =service.createUsers(u);
		assertEquals(u.getId() , saveduser.getId());
		
		
		
	}
	
}*/
