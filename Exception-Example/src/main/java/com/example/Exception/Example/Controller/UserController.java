package com.example.Exception.Example.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	public UserService uservice;
	
	
	@PostMapping("/user")
	@ResponseBody
	public Users adduser(@RequestBody Users user) {
		return uservice.adduser(user);
	}
	/*
	 * 
	 *   @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        if (user == null) {
            throw new UserNotFoundException("User not found with id: " + id);
        }
        return user;
    }
	 */
	
	@GetMapping("/{id}")
	public Users getuserbyid(@PathVariable Long id)
	{
		Users u =uservice.getuserbyid(id);
		if(u == null)
		{
			throw new UserNotFoundException("user not found" +id);
		}
		return u;
		}
	
	 @ExceptionHandler(UserNotFoundException.class)
    public String handleUserNotFoundException(UserNotFoundException ex) {
        return ex.getMessage();
    }
	
	}
