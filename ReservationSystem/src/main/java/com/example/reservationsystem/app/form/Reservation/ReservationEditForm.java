package com.example.reservationsystem.app.form.Reservation;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationEditForm {
	private  String guestcode;
	private  String plancode;
	private LocalDate arrday;
	private LocalDate depday;
	private Integer persons;
	private String roomnumber;
}
