package com.example.reservationsystem.app.controller.Admin.Usersearch;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.reservationsystem.app.form.user.UserForm;
import com.example.reservationsystem.domain.entity.User;
import com.example.reservationsystem.domain.service.UserSearchService.UserSearchService;

@Controller
@RequestMapping("/admin")
public class UserSearchContoroller {
	@Autowired
	UserSearchService usersearchservice;
	
	@GetMapping("usersearch")
	String userSearch(@ModelAttribute UserForm userform, Model model) {
		userform.setUserList( (ArrayList<User>) usersearchservice.readAll());
		model.addAttribute("UserForm",userform);
		return "admin/usersearch/usersearch";
	}
}
