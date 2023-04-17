package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserLogin {
	
	@GetMapping("/login")
	public String loginUser() {
		
		
		return "login";
		
	}
	
	
	
	@GetMapping("/login")
	public String loginUser(@RequestParam String user,@RequestParam String password) {
		
		
		return ("The user"+user+"is login");
		
	}
	
	

}
