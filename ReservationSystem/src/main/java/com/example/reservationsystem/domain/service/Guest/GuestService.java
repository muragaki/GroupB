package com.example.reservationsystem.domain.service.Guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.repository.Guest.GuestRepository;

@Service

public class GuestService {
	
	@Autowired
	GuestRepository guestRe;

}
