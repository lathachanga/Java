package com.jpa.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.model.Passenger;
import com.jpa.repository.PassengerRepository;
@Component
public class MyRunner implements CommandLineRunner{
	
	@Autowired
	PassengerRepository passRepo;

	@Override
	public void run(String... args) throws Exception {
		Passenger p=new Passenger();
		p.setPassengerId(102);
		p.setFirstName("Srilatha");
		p.setLastName("Changa");
		p.setEmail("Sri@gmail.com");
		p.setMobileNo("94940");
		p.setSeatNo("1002");
		
		passRepo.save(p);
		
		List<Passenger> listPassengers=passRepo.getPassenger("Srilatha","Changa");
		for(Passenger p1:listPassengers) {
			System.out.println(p1.getEmail());
		}
		
		
	}

}
