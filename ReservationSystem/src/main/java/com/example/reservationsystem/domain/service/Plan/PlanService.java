package com.example.reservationsystem.domain.service.Plan;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.entity.Planinformation;
import com.example.reservationsystem.domain.repository.Planinfomation.PlaninfomationRepository;

@Service

public class PlanService {
	
	@Autowired
	PlaninfomationRepository planinfomationRepository;
	
	public ArrayList<Planinformation> readAll() {
		return (ArrayList<Planinformation>) planinfomationRepository.findAll();
		
	}
}
