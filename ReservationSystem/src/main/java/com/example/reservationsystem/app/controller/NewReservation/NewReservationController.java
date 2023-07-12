package com.example.reservationsystem.app.controller.NewReservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.service.NewReservation.NewResavationService;

@Controller
public class NewReservationController {

	@Autowired
	NewResavationService newreservationservice;
	
	@GetMapping("newreservationview")
	String reservation1(@RequestParam("guest")String guestcode,Reservation reservation, Model model) {
		Guest guest = newreservationservice.findOne(guestcode);
		model.addAttribute("guest",guest);
		model.addAttribute("reservation", reservation);
		return "newreservation/newreservation";
	}
	
	@PostMapping("reservationsave")
	String reservationsave(@RequestParam("guest")String guestcode,Reservation reservation,Model model) {
		newreservationservice.save(reservation);
		return "newreservation/reservationsave";
	}
	
}
