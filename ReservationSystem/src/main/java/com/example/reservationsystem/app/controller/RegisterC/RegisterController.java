package com.example.reservationsystem.app.controller.RegisterC;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.service.RegisterS.RegisterService;
@Controller


public class RegisterController {
@Autowired
RegisterService registerservice ;
@PostMapping("register")

String register(@ModelAttribute String register , Model model) {
	ArrayList<Reservation>register1 =new ArrayList<Reservation>();
	register1=registerservice.register();
	model.addAttribute("reservation",register1);
	return "register/registerview";
}
}
