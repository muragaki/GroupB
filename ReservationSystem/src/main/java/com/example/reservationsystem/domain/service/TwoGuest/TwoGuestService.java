package com.example.reservationsystem.domain.service.TwoGuest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.repository.Guest.GuestRepository;

@Service

public class TwoGuestService {
	
	@Autowired
	GuestRepository guestRepository;
	
	public Guest findOne(String guestcode) {
		return guestRepository.findByGuestcode(guestcode);
	}

}
