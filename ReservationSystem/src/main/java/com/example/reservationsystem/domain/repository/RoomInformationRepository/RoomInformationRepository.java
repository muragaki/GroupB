package com.example.reservationsystem.domain.repository.RoomInformationRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reservationsystem.domain.entity.RoomInformation;

public interface RoomInformationRepository extends JpaRepository<RoomInformation, Integer> {

}
