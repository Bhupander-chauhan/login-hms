package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="Bookings")
public class Booking {
	@Id
	
	private int id;
	private String firstName;
	private String lastName;
	private String Address;
	private LocalDateTime CheckIndate;
	private LocalDateTime Checkoutdate;
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public LocalDateTime getCheckIndate() {
		return CheckIndate;
	}
	public void setCheckIndate(LocalDateTime checkIndate) {
		CheckIndate = checkIndate;
	}
	public LocalDateTime getCheckoutdate() {
		return Checkoutdate;
	}
	public void setCheckoutdate(LocalDateTime checkoutdate) {
		Checkoutdate = checkoutdate;
	}

}
