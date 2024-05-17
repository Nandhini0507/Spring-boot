package com.example.Spring.Demo.Project.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Spring.Demo.Project.Entity.IdNotFoundException;
import com.example.Spring.Demo.Project.Entity.Users;
import com.example.Spring.Demo.Project.Repository.UserRepository;
@Service
public class UserService {
	
	@Autowired
	UserRepository userepository;
	
	 public Users adduser(Users user)
	 {
		 return userepository.save(user);
	 }
		
	 public Optional<Users> getById(@PathVariable Long id)
		{
			return userepository.findById(id);
		}
	 
	 public Optional<Users> getByUserName(@RequestParam String name)
	 {
		 return userepository.findByName(name);
		 
	 }
	 
	 public List<Users> getUsers(@RequestParam String name)
	 {
		 return userepository.findbyuser(name);
	 }
	 public List<Users> getUserByIds(List<Long> ids)
	 {
		//return  userepository.findByAllIds(ids);
		 List<Users> users=new ArrayList<>();
		 for(Long id :ids)
		 {
			 Optional<Users> option=userepository.findById(id);
			 if(option.isPresent())
			 {
				 users.add(option.get());
			 }
			 else
			 {
				 throw new IdNotFoundException("user id not found"+id);
			 }
			 
		 }
		 return users;
		 
			 }
			 
		 
		 
		 
		 
	 }
	 
	 

