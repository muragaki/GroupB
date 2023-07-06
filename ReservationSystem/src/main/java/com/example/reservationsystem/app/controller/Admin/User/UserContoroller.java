package com.example.reservationsystem.app.controller.Admin.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.reservationsystem.domain.service.UserService.UserService;

@Controller
@RequestMapping("/admin")
public class UserContoroller {

	@Autowired
	UserService userservice;

	@GetMapping("user")
	String user() {

		return "admin/user/userview";
	}
}