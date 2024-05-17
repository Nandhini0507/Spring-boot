package com.example.Spring.Security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/check")
	public String method1()
	{
		return "default ID";
		
	}
	
	@GetMapping("/public")
	public String method2()
    {
		return "Authentication successfull";
		
	}
	
}
