package com.example.reservationsystem.app.controller.GuestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.reservationsystem.domain.service.Guest.GuestService;

@Controller

public class GuestController {
	@Autowired
	GuestService guestRe;
	@GetMapping("guestForm")
	String guestForm() {
		return "guest/guestForm";
		
	
		
	
	}

}
