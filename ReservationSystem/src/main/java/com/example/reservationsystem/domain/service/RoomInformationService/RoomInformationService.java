package com.example.reservationsystem.domain.service.RoomInformationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.repository.RoomInformationRepository.RoomInformationRepository;

@Service
public class RoomInformationService {

	@Autowired
	RoomInformationRepository roomInformationReopsitory;
}
