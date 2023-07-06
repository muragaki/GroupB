package com.example.reservationsystem.app.controller.NewReservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.reservationsystem.domain.service.NewReservation.NewResavationService;

@Controller
public class NewReservationController {

	@Autowired
	NewResavationService newreservationservice;
	
	@GetMapping("newreservationview")
	String newReservation() {
	return "newreservation/newreservationview";
}
}
