package com.example.reservationsystem.app.controller.Admin.NewPlan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.reservationsystem.domain.entity.Planinformation;
import com.example.reservationsystem.domain.service.Plan.PlanService;

@Controller
@RequestMapping("/admin")

public class NewPlanController {
	@Autowired
	PlanService planService ;
	
	@GetMapping("/newplan")
	String plan(@ModelAttribute("planinformation") Planinformation planinformation,Model model) {
		model.addAttribute("planinformation",planinformation);
		return "/admin/newplan/newplanview";
	}
	@PostMapping("/complete")
	String complete(Planinformation planinformation,Model model) {
		planService.save(planinformation);
		return "/admin/complete/completeview";
	}
	

}
