package com.example.reservationsystem.domain.repository.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reservationsystem.domain.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
