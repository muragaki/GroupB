package com.example.reservationsystem.domain.service.EndReservationS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.repository.Reservation.ReservationRepository;
@Service
public class EndReservationService {
@Autowired
ReservationRepository reservationRepository;

}
