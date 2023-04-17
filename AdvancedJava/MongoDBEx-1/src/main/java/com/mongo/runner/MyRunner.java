package com.mongo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.mongo.document.Books;
import com.mongo.repository.BooksRepository;

public class MyRunner implements CommandLineRunner {
	
	@Autowired 
	BooksRepository br;

	@Override
	public void run(String... args) throws Exception {
		Books book= new  Books();
    book.setId(150);
    book.setName("Pink");
    book.setCost(15000);
    
    System.out.println(book.getId());
		
		//System.out.println("getting data");
		//br.findAll().forEach(x->System.out.println(x));
	}

}
