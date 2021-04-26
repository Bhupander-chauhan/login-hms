package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;





@RestController

public class BookingController {
	@Autowired
	private BookingRepo repository;
	
	@PostMapping("/addbooking")
	public String addguest(@RequestBody Booking booking) {
		repository.save(booking);
		return "Added guest with id :"+booking.getId();

	}
	@GetMapping("/findall")
	public List<Booking> getemployee(){
		return repository.findAll();
	}}
