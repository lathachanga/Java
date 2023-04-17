package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

	@GetMapping("")
	public String getIndex() {
		return "index";
		
	}
	
	@GetMapping("/register")
	public String getRegistration() {
		return "register";
	}
	

	@GetMapping("/registerdone")
	public String getwelcome() {
		return "success";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
		
	}
	
   
}
