package com.example.reservationsystem.app.controller.PlanList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.reservationsystem.domain.service.PlanService.PlanListService;
@Controller

public class PlanListContoroller {
	@Autowired
	PlanListService planlistservice;
	@GetMapping("planlist")
	
	String planForm() {
		return"planlist/planlistview";
	}
    
	
	
	

}
