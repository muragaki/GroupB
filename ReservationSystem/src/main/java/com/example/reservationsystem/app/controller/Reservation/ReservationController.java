package com.example.reservationsystem.app.controller.Reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.reservationsystem.domain.service.resavation.ResavationService;

@Controller

public class ReservationController {
	@Autowired
	ResavationService resavationService;
	
	@GetMapping("reservation")
	String reservation() {
		return "reservation";
	}

}
