package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Entity.Users;
import com.example.demo.Service.UserService;

@Controller
@RequestMapping("/api")
public class UserController {	
	
	@Autowired
	private UserService userservice;
	@GetMapping("/getlist")
	@ResponseBody
	public List<Users> getByUserName ()
	{
		return userservice.getList();
	}
	
	@PostMapping("/create")
	@ResponseBody
	public Users adduser(@RequestBody  Users user) {
		return userservice.adduser(user);
	}
	
	@GetMapping("/id/{id}")
	@ResponseBody
	public Optional<Users> getById(@PathVariable Long id)
	{
		return userservice.getById(id);
	}
	
	@DeleteMapping("/delete/{id}")
    @ResponseBody
	public void delete(@PathVariable Long id) throws UserNotFoundException {  
		userservice.deleteuser(id);
    
	}

                                           
	@PutMapping("/update/{id}")
	public Users update(@PathVariable Long id,@RequestBody Users user)
	{
		return userservice.updatedetails(id, user);
		
	}
}





