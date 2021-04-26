package com.example.demo.HomeResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SecurityRepo;
import com.example.demo.User;


@RestController
@CrossOrigin(origins="http://localhost:4200")

public class Resource {
	@Autowired
	SecurityRepo repo;

	@GetMapping("/")
	public String home() {
	return("<h1>Welcome</h1>");
}
	@GetMapping("/user")
	public String user() {
		return("<h1>Welcome User</h1>");
		
	}
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome Admin</h1>");
	}
	@PostMapping("/add")
	public String add(@RequestBody User user) {
		repo.save(user);
		return "Added with id :"+user.getId();
}}