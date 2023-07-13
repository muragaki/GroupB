package com.example.reservationsystem.app.form.Reservation;

import java.time.LocalDate;
import java.util.ArrayList;

import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.entity.Planinformation;
import com.example.reservationsystem.domain.entity.RoomInformation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationEditForm {
	private  Guest guest;
	private Planinformation plan;
	private ArrayList<Planinformation> planList = new ArrayList<>();
	private LocalDate arrday;
	private LocalDate depday;
	private Integer persons;
	private RoomInformation room;
}
