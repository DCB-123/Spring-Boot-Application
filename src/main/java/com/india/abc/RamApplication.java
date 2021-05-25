package com.india.abc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RamApplication implements CommandLineRunner{

	@Autowired
	 private CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer c1 =new Customer("1","Rohan","Singh");
		Customer c2 =new Customer("2","Rajesh","Singh");
		Customer c3 =new Customer("3","Ram","Mohan");
		Customer c4 =new Customer("4","Rohit","Sharma");
		
		customerRepository.save(c1);
		customerRepository.save(c2);
		customerRepository.save(c3);
		customerRepository.save(c4);
	
	  List<Customer> customers=customerRepository.findAll();
	  
	  for(Customer c : customers)
	  {
		System.out.println(c.toString());  
		  
	  }
	}

}
