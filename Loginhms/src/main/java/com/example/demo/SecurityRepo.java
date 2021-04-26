package com.example.demo;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface SecurityRepo extends MongoRepository<User, String>{
	User findByUserName(String userName);

}
