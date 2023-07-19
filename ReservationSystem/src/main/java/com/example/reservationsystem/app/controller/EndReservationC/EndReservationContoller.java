package com.example.reservationsystem.app.controller.EndReservationC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.reservationsystem.app.form.Plan.PlanEditForm;
import com.example.reservationsystem.app.form.Reservation.ReservationEditForm;
import com.example.reservationsystem.domain.service.EndReservationS.EndReservationService;

@Controller
public class EndReservationContoller {
	@Autowired
	EndReservationService 	endreservationservice;
	
	@PostMapping("/endreservation")
	String endreservation( @Validated ReservationEditForm reservationEditForm,PlanEditForm plan, BindingResult bindngresult,Model model) {
		reservationEditForm.setPlan(plan);
		if(bindngresult.hasErrors()) {
			model.addAttribute("reservationEditForm",reservationEditForm);
			return "redirect:/register/registerview";
		}
		
		endreservationservice.save(reservationEditForm);
		
		return "endreservation/endreservationview";
	}
}
