package com.example.reservationsystem.app.controller.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author Katsuki
 *
 */
@Controller
public class LoginController {
	@GetMapping("loginForm")
	String loginForm() {
		return "login/loginform";
	}
}