package com.example.reservationsystem.app.controller.NewReservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.reservationsystem.app.form.Reservation.ReservationEditForm;
import com.example.reservationsystem.domain.service.NewReservation.NewResavationService;

@Controller
public class NewReservationController {

	@Autowired
	NewResavationService newreservationservice;
	
	@GetMapping("newreservationview")
	String reservation1(@RequestParam("guest")String guestcode,ReservationEditForm reservationEditForm, Model model) {
//		Guest guest = newreservationservice.findOne(guestcode);
//		model.addAttribute("guest",guest);
		reservationEditForm.setPlanList(newreservationservice.findAll());
		reservationEditForm.getGuest().setGuestcode(guestcode);
		model.addAttribute("reservationEditForm", reservationEditForm);
		return "newreservation/newreservation";
	}
	
	@PostMapping("reservationsave")
	String reservationsave(ReservationEditForm reservationEditForm,Model model) {
		newreservationservice.save(reservationEditForm);
		return "newreservation/reservationsave";
	}
	
}
