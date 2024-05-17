package com.example.Spring.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@Configuration
@EnableWebSecurity
public class Config{
	protected void configure(HttpSecurity http) throws Exception
	{
		/*http.authorizeRequests().
		requestMatchers("/","public")
		.permitAll().anyRequest().authenticated().and().formLogin().and()
		.logout().permitAll();*/
		http.authorizeRequests()
	    .requestMatchers("/check", "/public").authenticated()
	    .anyRequest().authenticated()
	    .and()
	    .formLogin()
	    .and()
	    .logout().permitAll();
		
	}
	
	//PasswordEncoder and UserDetailsService interfaces
	//User is class
	
	@Bean
	public PasswordEncoder password()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService details()
	{
		UserDetails admin=User.withUsername("admin").password(password().encode("nandhini")).roles("admin").build();
		UserDetails user=User.withUsername("user").password(password().encode("nandy")).roles("user").build();
		
		return new InMemoryUserDetailsManager(admin,user);
		
	}
	
	
	
	
}
