package com.example.reservationsystem.domain.service.Guest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.repository.Guest.GuestRepository;

@Service

public class GuestService {
	
	@Autowired
	GuestRepository guestRe;
	
public ArrayList<Guest> readAll(){
	ArrayList<Guest>guest1=new ArrayList<Guest>();
	guestRe.findAll();
	guest1=(ArrayList<Guest>)guestRe.findAll();
	
	return guest1;
	
}

}
