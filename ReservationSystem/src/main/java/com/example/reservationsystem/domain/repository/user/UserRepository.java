package com.example.reservationsystem.domain.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reservationsystem.domain.entity.User;


public interface UserRepository extends JpaRepository<User, String> {
}
