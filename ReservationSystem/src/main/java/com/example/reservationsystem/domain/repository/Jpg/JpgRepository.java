package com.example.reservationsystem.domain.repository.Jpg;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reservationsystem.domain.entity.Jpg;


public interface JpgRepository extends JpaRepository<Jpg, Integer> {
Jpg findByJpgname(String Jpgname);
}
