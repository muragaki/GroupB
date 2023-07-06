package com.example.reservationsystem.domain.service.Plan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.repository.Planinfomation.PlaninfomationRepository;

@Service

public class PlanService {
	
	@Autowired
	PlaninfomationRepository planinfomationrepository;
	

}
