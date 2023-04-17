package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.model.CustomerBean;



@Controller
public class CustomerController {

	@GetMapping("/index")
	public String getIndex() {
		return "index";
		
	}
	
	@GetMapping("/register")
	public String getRegistration(Model model) {
		CustomerBean customerBean=new CustomerBean();
		model.addAttribute("custBean", customerBean);
		return "register";
		
	}
	
	@GetMapping("/login")
	public String getLogin(Model model) {
		CustomerBean customerBean=new CustomerBean();
		model.addAttribute("custBean", customerBean);
		return "login";
		
	}
	
	
	
	 
   
}
