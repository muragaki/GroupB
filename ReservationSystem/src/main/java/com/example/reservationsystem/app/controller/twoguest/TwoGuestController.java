package com.example.reservationsystem.app.controller.twoguest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.service.TwoGuest.TwoGuestService;

@Controller

public class TwoGuestController {
	@Autowired
	TwoGuestService twoguestService;

	@GetMapping("twoguest")
	String reservation2() {
		return "twoguest/twoguestview";
	}

	@GetMapping("one")
	String reservation1(@ModelAttribute Guest guest, Model model) {
		model.addAttribute("guest", guest);
		return "twoguest/oneview";
	}

}
