package com.example.reservationsystem.domain.service.EndReservationS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.app.form.Reservation.ReservationEditForm;
import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.repository.Guest.GuestRepository;
import com.example.reservationsystem.domain.repository.Reservation.ReservationRepository;
@Service
public class EndReservationService {
@Autowired
ReservationRepository reservationRepository;

@Autowired
GuestRepository guestRepository;

//フォームをもらってデータベースに保存するメソッド
	public void save(ReservationEditForm reservationEditForm) {
		//		お客さん用の場合復活
		guestRepository.save(new Guest(reservationEditForm.getGuestcode(), reservationEditForm.getFirstname(),
				reservationEditForm.getLastname(), reservationEditForm.getDateofbirth(),
				reservationEditForm.getAddress(),
				reservationEditForm.getPhonenumber(), reservationEditForm.getMailaddress()));

		Reservation reservation = new Reservation();
		reservation.setGuestcode(reservationEditForm.getGuestcode());
		reservation.setPlancode(reservationEditForm.getPlan().getPlanCode());
		reservation.setArrday(reservationEditForm.getArrday());
		reservation.setDepday(reservationEditForm.getDepday());
		reservation.setPersons(reservationEditForm.getPersons());
		reservationRepository.save(reservation);
	}

}
