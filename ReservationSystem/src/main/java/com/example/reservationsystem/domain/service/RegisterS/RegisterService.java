package com.example.reservationsystem.domain.service.RegisterS;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.repository.Reservation.ReservationRepository;
@Service
public class RegisterService {
	@Autowired
	ReservationRepository reservationRepository;
	public ArrayList<Reservation>register() {
		reservationRepository.findAll();
		ArrayList<Reservation>register=new ArrayList<Reservation>();
		register=(ArrayList<Reservation>)reservationRepository.findAll();
		
		return register;

}
}