package com.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.mvc.Controller"})
public class WebMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebMvcApplication.class, args);
	}

}
