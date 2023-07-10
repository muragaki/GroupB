package com.example.reservationsystem.app.controller.NewReservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.service.NewReservation.NewResavationService;

@Controller
public class NewReservationController {

	@Autowired
	NewResavationService newreservationservice;
	
	@GetMapping("new")
	String reservation1(@ModelAttribute Reservation reservation, Model model) {
		model.addAttribute("reservation", reservation);
		return "newreservation/newreservationview";
	}
}
