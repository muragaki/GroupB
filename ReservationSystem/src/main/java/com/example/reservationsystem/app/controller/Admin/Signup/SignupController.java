package com.example.reservationsystem.app.controller.Admin.Signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.reservationsystem.app.form.Signup.SignupForm;
import com.example.reservationsystem.domain.entity.RoleName;
import com.example.reservationsystem.domain.entity.User;
import com.example.reservationsystem.domain.service.user.SuperUserDetailsService;



@Controller
@RequestMapping("/admin")
public class SignupController {
	
	@Autowired
	SuperUserDetailsService superUserDetailsService;
	
	@GetMapping("signup")
	public String signup(SignupForm sigupForm ) {
		return "admin/signup/signup";
	}
	
	@PostMapping("signup")
	public String userregist(@ModelAttribute("signupForm") @Validated SignupForm signupForm, BindingResult br, Model model) {
		if (br.hasErrors()) {
			return "admin/signup/signup";
		}
		User user = new User(signupForm.getUsername(),
				signupForm.getPassword(),
				signupForm.getFirstname(),
				signupForm.getLastname(),
				RoleName.USER);
		superUserDetailsService.userregist(user);
		return "redirect:/admin/menu";
	}

}

