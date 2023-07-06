package com.example.reservationsystem.domain.service.Resavation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.app.form.Reservation.ReservationForm;
import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.repository.Reservation.ReservationRepository;

@Service

public class ReservationService {

@Autowired
ReservationRepository reservationRepository;

public List<Reservation> readAll() {
	return reservationRepository.findAll();
}

public ArrayList<Reservation> findResevation(ReservationForm form){
	ArrayList<Reservation> resList = new ArrayList<Reservation>();
	for(Reservation res: form.getReservationList()) {
		
	}
	return resList;
}
}