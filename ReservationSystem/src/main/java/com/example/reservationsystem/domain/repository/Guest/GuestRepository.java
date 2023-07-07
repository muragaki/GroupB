package com.example.reservationsystem.domain.repository.Guest;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reservationsystem.domain.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, Integer> {
Guest findByGuestcode(String guestcode);
void deleteByGuestcode(String guestcode);
}
