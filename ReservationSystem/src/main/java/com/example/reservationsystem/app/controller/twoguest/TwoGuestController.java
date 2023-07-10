package com.example.reservationsystem.app.controller.twoguest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.service.TwoGuest.TwoGuestService;

@Controller

public class TwoGuestController {
	@Autowired
	TwoGuestService twoguestService;
	
	@GetMapping("/twoguest")
	String example(@RequestParam("guest")String guestcode, Model model) {
			Guest guest = twoguestService.findOne(guestcode);
		model.addAttribute("guest",guest);
		return "twoguest/twoguestview";
	}
	@GetMapping("one")
	String reservation1() {
		return "twoguest/oneview";
	}
	
	
	
	
	

}
