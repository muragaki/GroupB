package com.example.reservationsystem.app.controller.PlanList;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.reservationsystem.domain.entity.Planinformation;
import com.example.reservationsystem.domain.service.PlanListService.PlanListService;
@Controller

public class PlanListContoroller {
	@Autowired
	PlanListService planlistservice;
	@GetMapping("planlist")
	
	String planlist(@ModelAttribute String planinfomation  , Model model) {
		ArrayList<Planinformation>planlist =new ArrayList<Planinformation>();
		planlist=planlistservice.readAll();
		model.addAttribute("planlist",planlist);
		
		return"planlist/planlistview";
	}
    
	
	
	

}
