package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
     @RequestMapping("courses")
	public String display() {
		System.out.println("created");
		return "course";
	}
}
