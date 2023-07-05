package com.example.reservationsystem.app.controller.BookingDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.reservationsystem.domain.service.BookingDetailsService.BookingDetailsService;

@Controller

public class BookingDetails {
	@Autowired
	BookingDetailsService bookingDetailsservice;
	
	@GetMapping("/bookingdetails")
	String bookingdetails() {
	return "bookingdetails/bookingdetailsview";
}
}
