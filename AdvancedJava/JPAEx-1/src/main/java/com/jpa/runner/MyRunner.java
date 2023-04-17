package com.jpa.runner;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.model.Product1;
import com.jpa.repository.ProductRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired 
	ProductRepository prodRepo;

	@Override
	public void run(String... args) throws Exception {
		
		//**insert data into table**
	 prodRepo.save(new Product1("samsung",45000.00,"Blue"));
	prodRepo.save(new Product1("Iphone",55000.00,"Red"));
	 prodRepo.save(new Product1("mi",35000.00,"Gray"));
	   
	  List<Product1> productList=prodRepo.findAll();
	     productList.forEach(x->System.out.println(x));
	   
	  /* Iterator itr =productList.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	   prodRepo.findAll().forEach(x->System.out.println(x));*/
		
		// **delete Operation**
		//prodRepo.deleteAll();
	
	}
    
	
	
}
