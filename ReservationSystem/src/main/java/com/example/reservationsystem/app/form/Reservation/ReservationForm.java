package com.example.reservationsystem.app.form.Reservation;

import java.util.ArrayList;

import com.example.reservationsystem.domain.entity.Reservation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationForm {
ArrayList<Reservation> reservationList = new ArrayList<>();
}
