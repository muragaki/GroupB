package com.example.reservationsystem.domain.service.NewPlan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.repository.Planinfomation.PlaninfomationRepository;

@Service

public class NewPlanService {
	@Autowired
	PlaninfomationRepository planinfomationrepository;

}
