package com.example.reservationsystem.domain.service.BookingDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.repository.Reservation.ReservationRepository;

@Service
public class BookingDetailsService {
	
@Autowired
ReservationRepository reservationRepository;

public Reservation example(Integer a) {
	return reservationRepository.findByResnumber(a);
}

public Reservation findOne(Integer resnumber) {
	return reservationRepository.findByResnumber(resnumber);
}
}
