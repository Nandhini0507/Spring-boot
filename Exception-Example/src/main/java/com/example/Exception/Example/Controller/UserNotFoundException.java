package com.example.Exception.Example.Controller;

public class UserNotFoundException extends RuntimeException{

	 public UserNotFoundException(String message) {
	        super(message);
	    }
}
