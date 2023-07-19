package com.example.reservationsystem.domain.service.reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
public ReservationForm searchReservation(ReservationForm reservationForm,LocalDate arrayday,LocalDate depday) {
	ArrayList<Reservation> reservations = new ArrayList<>();
	for(Reservation reservation:reservationForm.getReservationList()) {
		if((reservation.getArrday().isEqual(arrayday)||reservation.getArrday().isAfter(arrayday)&&(reservation.getDepday().isEqual(depday)||reservation.getDepday().isBefore(depday)))) {
			reservations.add(reservation);
		}
		}
	reservationForm.setReservationList(reservations);
	return reservationForm;
}

//String型をLocalDateに変更するメソッド
public  LocalDate convertToLocalDate(String date,String format) {
    // シンプルにLocalDate型に変換された日付を返却
return LocalDate.parse(date, DateTimeFormatter.ofPattern(format));

}
}