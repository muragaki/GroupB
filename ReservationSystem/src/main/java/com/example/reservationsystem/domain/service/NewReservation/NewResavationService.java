package com.example.reservationsystem.domain.service.NewReservation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.app.form.Reservation.ReservationEditForm;
import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.entity.Planinformation;
import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.repository.Guest.GuestRepository;
import com.example.reservationsystem.domain.repository.Planinfomation.PlaninfomationRepository;
import com.example.reservationsystem.domain.repository.Reservation.ReservationRepository;

@Service
public class NewResavationService {
@Autowired
ReservationRepository reservationrepository;
@Autowired
GuestRepository guestRepository;
@Autowired
PlaninfomationRepository planinformationRepository;

public void save(ReservationEditForm reservationEditForm) {
	Reservation reservation = new Reservation();
	reservation.setGuest(guestRepository.findByGuestcode(reservationEditForm.getGuest().getGuestcode()));
	reservation.setPlan(planinformationRepository.findByPlancode(reservationEditForm.getPlan().getPlancode()));
	reservation.setArrday(reservationEditForm.getArrday());
	reservation.setDepday(reservationEditForm.getDepday());
	reservation. setPersons(reservationEditForm.getPersons());
	reservationrepository.save(reservation);
}
public Guest findOne(String guestcode) {
	return guestRepository.findByGuestcode(guestcode);
}

public ArrayList<Planinformation> findAll(){
	return (ArrayList<Planinformation>) planinformationRepository.findAll();
}

}
