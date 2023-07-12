package com.example.reservationsystem.domain.service.NewReservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.repository.Guest.GuestRepository;
import com.example.reservationsystem.domain.repository.Reservation.ReservationRepository;

@Service
public class NewResavationService {
@Autowired
ReservationRepository reservationrepository;
@Autowired
GuestRepository guestRepository;

public void save(Reservation reservation) {
	reservationrepository.save(reservation);
}
public Guest findOne(String guestcode) {
	return guestRepository.findByGuestcode(guestcode);
}
}
