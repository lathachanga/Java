package com.jpa.runner;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.model.Product;
import com.jpa.repository.ProductRepository;
@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	ProductRepository prodRepo;
	

	@Override
	public void run(String... args) throws Exception {
       // performing crud operations
		//save records
		prodRepo.save(new  Product(104, "Iphone 12",45000.00,"red"));
		prodRepo.save(new  Product(105, "samsung 12",35000.00,"white"));
		
	 //read operation
		prodRepo.findAll().forEach(x->System.out.println(x.getProdName()));
		Optional<Product> p=prodRepo.findById(104);
		if(p.isPresent()) {
			System.out.println(p.get().getProdName());
		}
		else {
			System.out.println("Product not available");
		}
		
	}

}
