package com.example.reservationsystem.app.controller.Admin.Plan;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.reservationsystem.app.form.Plan.Planform;
import com.example.reservationsystem.domain.entity.Planinformation;
import com.example.reservationsystem.domain.service.Plan.PlanService;

@Controller
@RequestMapping("/admin")

public class PlanController {
	@Autowired
	PlanService planService;
	
	@GetMapping("plan")
	String plan(@ModelAttribute Planform planForm ,Model model ) {
	planForm.setPlanList( (ArrayList<Planinformation>) planService.readAll());	
	model.addAttribute("planinfomationform",planForm );
		return "admin/plan/planview";
	}
	

}
