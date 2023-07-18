package com.example.reservationsystem.app.controller.Reservation;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.reservationsystem.app.form.Reservation.ReservationForm;
import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.service.reservation.ReservationService;

@Controller

public class ReservationController {
	@Autowired
	ReservationService reservationService;
	
	//予約一覧表示
	@GetMapping("reservation")
	String reservation(@ModelAttribute ReservationForm reservationForm,LocalDate arrayday,LocalDate depday,Model model) {
		reservationForm.setReservationList( (ArrayList<Reservation>) reservationService.readAll());
		Integer total = reservationForm.getReservationList().size();
		arrayday=LocalDate.now().plusDays(1);
		depday=LocalDate.now().plusDays(1);
		model.addAttribute("total", total);
		model.addAttribute("arrayday", arrayday);
		model.addAttribute("depday", depday);
		model.addAttribute("reservationForm",reservationForm);
		return "reservation/reservationview";
	}
	
	@PostMapping("/ressearch")
	String datesearch(ReservationForm reservationForm,String arrayday, String depday,Model model){
		reservationForm.setReservationList( (ArrayList<Reservation>) reservationService.readAll());
		reservationForm.setReservationList(reservationService.searchReservation(reservationForm, reservationService.convertToLocalDate(arrayday, "yyyy-MM-dd"), reservationService.convertToLocalDate(depday, "yyyy-MM-dd")).getReservationList());
		model.addAttribute("arrayday",arrayday);
		model.addAttribute("depday",depday);
		return"reservation/reservationview";
	}
	
	
	/*	@PostMapping("result")
		String result(@ModelAttribute Reservation reservation,@ModelAttribute ReservationForm reservationForm,Model model) {
			model.addAttribute("reservation",reservation);
			reservationForm.setReservationList( reservationService.findReservation(reservation));
			model.addAttribute("reservationForm",reservationForm);
			return "redirect:reservation";
		}*/
}


