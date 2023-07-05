package com.example.reservationsystem.domain.service.resavation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.repository.Reservation.ReservationRepository;

@Service

public class ReservationService {

@Autowired
ReservationRepository reservationRepository ;

public List<Reservation> readAll() {
	return reservationRepository.findAll();
}

public ArrayList<Reservation> findReservation(Reservation res){
	ArrayList<Reservation> reservationList = new ArrayList<>();
	for(Reservation reservation:reservationRepository.findAll()) {
		if(reservation.toString() == res.toString()) {
			reservationList.add(reservation);
		}
	}
	return reservationList;
}
}