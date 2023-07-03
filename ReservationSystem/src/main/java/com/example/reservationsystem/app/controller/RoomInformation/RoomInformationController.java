package com.example.reservationsystem.app.controller.RoomInformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.reservationsystem.domain.service.RoomInformationService.RoomInformationService;

@Controller
public class RoomInformationController {
	@Autowired
	RoomInformationService RoomInformationService ;
@GetMapping("roominformation")
String room() {
	return "information/roominformation";
}

	
}
