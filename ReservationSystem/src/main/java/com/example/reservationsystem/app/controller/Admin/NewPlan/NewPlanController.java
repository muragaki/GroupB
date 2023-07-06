package com.example.reservationsystem.app.controller.Admin.NewPlan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.reservationsystem.domain.service.Plan.PlanService;

@Controller
@RequestMapping("/admin")

public class NewPlanController {
	@Autowired
	PlanService planService ;
	
	@GetMapping("newplan")
	String plan() {
		return "admin/newplan/newplanview";
	}

}
