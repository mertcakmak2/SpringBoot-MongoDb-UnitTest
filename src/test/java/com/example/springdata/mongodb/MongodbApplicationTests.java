package com.example.springdata.mongodb;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdata.mongodb.Entities.Customer;
import com.example.springdata.mongodb.Repos.CustomerRepository;

@SpringBootTest
class MongodbApplicationTests {
	
	@Autowired
	CustomerRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void readCustomers() {
		List<Customer> customers = repository.findAll();
		customers.forEach(customer -> System.out.println(customer.toString()));
	}
	
	@Test
	public void insertCustomer() {
		Customer customer = new Customer("Admin", "Admin");
		repository.insert(customer);
	}
	
	@Test
	public void updateCustomer() {
		Customer customer = repository.findById("5fd50572e5c9046aea8176ec").get();
		customer.setFirstName("newName");
		customer.setLastName("newLname");
		repository.save(customer);
	}
	
	@Test
	public void deleteCustomer() {
		Customer customer = repository.findById("5fd50572e5c9046aea8176ec").get();
		repository.delete(customer);
	}
}



