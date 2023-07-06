package com.example.reservationsystem.app.controller.Admin.Plan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.reservationsystem.domain.service.Plan.PlanService;

@Controller
@RequestMapping("/admin")

public class PlanController {
	@Autowired
	PlanService planService ;
	
	@GetMapping("plan")
	String plan() {
		return "admin/plan/planview";
	}

}
