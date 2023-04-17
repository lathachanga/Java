package com.mvc.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
  @RequestMapping(value="/login",method=RequestMethod.GET)
   public String getLoginPage() {
	   System.out.println("hello good morning");
	return "login" ;   
   }
  
  @RequestMapping(value="/welcome",method=RequestMethod.GET)
  public String getWelcomePage(@RequestParam String email,@RequestParam String password) {
	  if(email.equals("sri@gmail.com")&&password.equals("sri")) {
		  return "welcome";
	  }
	  else {
		  return "login";
	  }
	
	  
  }
   
}
