package com.example.Spring.Security;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/security")
public class Security {
	
	public String check()
	{
		return "authentication example";
	}

}
