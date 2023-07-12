package com.example.reservationsystem.app.controller.Admin.NewUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.reservationsystem.domain.service.NewUserService.NewUserService;

@Controller
@RequestMapping("/admin")
public class NewUser {
	@Autowired
	NewUserService newuserservice;
	


}
