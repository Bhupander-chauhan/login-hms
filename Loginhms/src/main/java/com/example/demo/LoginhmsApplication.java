package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = SecurityRepo.class)
public class LoginhmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginhmsApplication.class, args);
	}

}
