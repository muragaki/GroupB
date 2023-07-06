package com.example.reservationsystem.domain.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.repository.user.UserRepository;

@Service
public class UserService {

@Autowired
	UserRepository userrepository;
	
}
