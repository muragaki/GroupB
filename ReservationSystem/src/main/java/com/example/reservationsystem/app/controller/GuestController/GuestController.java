package com.example.reservationsystem.app.controller.GuestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.reservationsystem.app.form.Guest.GuestForm;
import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.service.Guest.GuestService;

@Controller

public class GuestController {
	@Autowired
	GuestService guestRe;
	@GetMapping("guestForm")
	String guestForm(@ModelAttribute Guest guest,@ModelAttribute GuestForm guestForm, Model model) {
		model.addAttribute("guest","guest");
		return "guest/guestForm";
	}

}
