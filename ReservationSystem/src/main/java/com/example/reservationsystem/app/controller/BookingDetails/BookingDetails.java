package com.example.reservationsystem.app.controller.BookingDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.service.BookingDetailsService.BookingDetailsService;

@Controller

public class BookingDetails {
	@Autowired
	BookingDetailsService bookingDetailsservice;
	
	@GetMapping("/bookingdetails")
	String example(@RequestParam("reservation")String resnumber, Model model) {
		//reservation = bookingDetailsservice.example(1);
		Integer res  = Integer.parseInt(resnumber);
		Reservation reservation = new Reservation();
		reservation = bookingDetailsservice.findOne(res);
		model.addAttribute("reservation",reservation);
	return "bookingdetails/bookingdetailsview";
}
}
