package com.example.reservationsystem.domain.service.RegisterS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.repository.Reservation.ReservationRepository;
@Service
public class RegisterService {
	@Autowired
	ReservationRepository reservationRepository;

}
