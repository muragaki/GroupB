package com.example.reservationsystem.app.controller.Reservation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.reservationsystem.app.form.Reservation.ReservationForm;
import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.service.resavation.ReservationService;

@Controller

public class ReservationController {
	@Autowired
	ReservationService reservationService;
	
	@GetMapping("reservation")
	String reservation(@ModelAttribute("reservation") Reservation reservation,@ModelAttribute ReservationForm reservationForm,Model model) {
		reservationForm.setReservationList( (ArrayList<Reservation>) reservationService.readAll());
		model.addAttribute("reservation", reservation);
		model.addAttribute("reservationForm",reservationForm);
		return "reservation/reservationview";
	}
	

	@PostMapping("result")
	String result(@ModelAttribute Reservation reservation,@ModelAttribute ReservationForm reservationForm,Model model) {
		model.addAttribute("reservation",reservation);
		reservationForm.setReservationList( reservationService.findReservation(reservation));
		model.addAttribute("reservationForm",reservationForm);
		return "redirect:reservation";
	}
}


