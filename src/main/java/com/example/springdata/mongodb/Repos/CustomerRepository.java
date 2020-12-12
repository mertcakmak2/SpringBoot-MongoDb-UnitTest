package com.example.springdata.mongodb.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springdata.mongodb.Entities.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
