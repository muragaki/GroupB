package com.example.reservationsystem.app.controller.EndReservationC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.reservationsystem.domain.service.EndReservationS.EndReservationService;

@Controller
public class EndReservationContoller {
	@Autowired
	EndReservationService 	endreservationservice;
	@PostMapping("endreservation")
	String endreservation() {
		return "endreservation/endreservationview";
	}
}
