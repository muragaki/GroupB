package com.example.reservationsystem.app.controller.NewComplete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.service.NewComplete.NewCompleteService;

@Controller
public class NewCompleteController {

	@Autowired
	NewCompleteService newcompleteservice;
	
	@PostMapping("/newcomplete")
	String newcomplete(@RequestParam("reservation")Reservation reservation,Model model) {
		return "newcomplete/newcomplete";
	}
	
}
