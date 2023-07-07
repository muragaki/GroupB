package com.example.reservationsystem.app.controller.RegisterC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.reservationsystem.domain.service.RegisterS.RegisterService;
@Controller


public class RegisterController {
@Autowired
RegisterService registerservice ;
@GetMapping("register")

String register() {
	return "register/registerview";
}
}
