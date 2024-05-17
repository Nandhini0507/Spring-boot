package com.example.demo.Controller;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String Message)
	{
		super(Message);
	}

}
