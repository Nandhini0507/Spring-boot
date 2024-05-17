package com.example.Spring.Demo.Project.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.Demo.Project.Entity.IdsRequest;
import com.example.Spring.Demo.Project.Entity.Users;
import com.example.Spring.Demo.Project.Service.UserService;
@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userservice;
	
	@PostMapping("/user")
	@ResponseBody
	public Users adduser(@RequestBody Users user) {
		return userservice.adduser(user);
	}
	
	@PostMapping("/users")
	public List<Users> getUserByIds(@RequestBody IdsRequest request)
	{
		List<Long> ids = request.getIds();
		return userservice.getUserByIds(ids);
	}
	
	@GetMapping("/id/{id}")
	@ResponseBody
	public Optional<Users> getById(@PathVariable Long id)
	{
		return userservice.getById(id);
	}
	
	@GetMapping("/request/name")
	@ResponseBody
	public Optional<Users> getByUserName (@RequestParam String name)
	{
		return userservice.getByUserName(name);
	}
	
	@GetMapping("/userlist")
	@ResponseBody
	public List<Users> getUsers(@RequestParam String name)
	{
		return userservice.getUsers(name);
	}
	

}
