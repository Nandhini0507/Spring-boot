package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Controller.UserNotFoundException;
import com.example.demo.Entity.Users;
import com.example.demo.Repository.UserRepository;
@Service
public class UserService {

	@Autowired
	UserRepository userepository;
	@Autowired
    private PasswordEncoder passwordEncoder;

	
	 public Users adduser(Users user)
	 {
		// user.setPassword(passwordEncoder.encode(user.getPassword()));
		 return userepository.save(user);
	 }
	 
	 public Optional<Users> getById(@PathVariable Long id)
		{
			return userepository.findById(id);
		}
	 public Users updatedetails(Long id, Users user)
	 {
		Optional<Users> u= userepository.findById(id);
		if(u.isPresent())
		{
			Users uu=u.get();
			uu.setName(user.getName());
			uu.setAuthor(user.getAuthor());
			uu.setQuantity(user.getQuantity());
			 return userepository.save(uu);
		}
		return null;
		
	 }
	 
	 public void deleteuser (Long id)  throws UserNotFoundException
	{
		 Users user=userepository.findById(id).orElseThrow(()-> new UserNotFoundException("user not found "+id));
		userepository.delete(user);
	 }
			
			
	 public List<Users> getList(){
		 return userepository.findAll();
	 }
	 
	
}
