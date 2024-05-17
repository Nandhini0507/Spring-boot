package com.example.Exception.Example.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;




@Service
public class UserService {
	
	@Autowired
	Userrepository repo;
	
	 public Users adduser(Users user)
	 {
		 return repo.save(user);
	 }
	
	public Users getuserbyid(@PathVariable Long id)
	{
		Optional<Users> u= repo.findById(id);
		Users uu=u.get();
		return uu;
	}
	
	

}