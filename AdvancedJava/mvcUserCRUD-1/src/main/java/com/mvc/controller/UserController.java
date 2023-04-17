package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class UserController {
	
	@RequestMapping(value="/loginex",method=RequestMethod.GET)
	   public String getLoginPage() {
		   System.out.println("hello good afternoon");
		return "loginex" ;   
	   }
	  
	  @RequestMapping(value="/loginex",method=RequestMethod.POST)
	  public String getWelcomePage(@RequestParam String email,@RequestParam String password) {
		  if(email.equals("sri@gmail.com")&&password.equals("sri")) {
			  return "welcomeex";
		  }
		  else {
			  return "loginex";
		  }
		
		  
	  }
}
