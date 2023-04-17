package com.mvc.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {
 @RequestMapping(value="/first",method=RequestMethod.GET)
 public String getPage() {
	 return "first";
 }
 
 public ModelAndView getPages() {
	 
	return new ModelAndView("first");
	 
 }
}
