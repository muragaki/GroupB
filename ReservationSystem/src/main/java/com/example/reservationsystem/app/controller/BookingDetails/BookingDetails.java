package com.example.reservationsystem.app.controller.BookingDetails;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.reservationsystem.app.form.Room.RoomForm;
import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.service.BookingDetailsService.BookingDetailsService;

@Controller

public class BookingDetails {
	@Autowired
	BookingDetailsService bookingDetailsservice;
	
	@GetMapping("/bookingdetails")
	String example(@RequestParam("reservation")Integer resnumber, Model model) {
			Reservation reservation = bookingDetailsservice.findOne(resnumber);
			ArrayList<RoomForm>roomList = new ArrayList<>();
			//nullでない場合はセレクトタグ配列に追加
			if(!(reservation.getNumber()== null)) {
				roomList.add(new RoomForm(reservation.getNumber().getRoomnumber(),reservation.getNumber().getRoomname()));
			//nullの場合は、空文字に置き換えて追加
			}else {
				roomList.add(new RoomForm("",""));
			}
			for(RoomForm room:bookingDetailsservice.findAll()) {
				roomList.add(room);
			}
		model.addAttribute("roomList",roomList);
		model.addAttribute("reservation",reservation);
		return "bookingdetails/bookingdetailsview";
	}
	@PostMapping("bookingdetails")
	String roomChange(Integer resnumber,String roomnumber,Model model) {
		bookingDetailsservice.roomChange(resnumber, roomnumber);
		Reservation reservation = bookingDetailsservice.findOne(resnumber);
		ArrayList<RoomForm>roomList = new ArrayList<>();
		//nullでない場合はセレクトタグ配列に追加
		if(!(reservation.getNumber()== null)) {
			roomList.add(new RoomForm(reservation.getNumber().getRoomnumber(),reservation.getNumber().getRoomname()));
		//nullの場合は、空文字に置き換えて追加
		}else {
			roomList.add(new RoomForm("",""));
		}
		for(RoomForm room1:bookingDetailsservice.findAll()) {
			roomList.add(room1);
		}
	model.addAttribute("roomList",roomList);
	model.addAttribute("reservation",reservation);
		return"bookingdetails/bookingdetailsview";
	}
}
