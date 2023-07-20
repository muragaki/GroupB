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
	String example(Reservation reservation,@RequestParam("reservation")Integer resnumber, Model model) {
			if(reservation.getResnumber()==null) {
			 reservation = bookingDetailsservice.findOne(resnumber);
			ArrayList<RoomForm>roomList = new ArrayList<>();
			//部屋タイプがnullでない場合はセレクトタグ配列に追加
			if(!(reservation.getNumber()== null)) {
				roomList.add(new RoomForm(reservation.getNumber().getRoomnumber(),reservation.getNumber().getRoomname()));
			//部屋タイプがnullの場合は、空文字に置き換えて追加
			}else {
				roomList.add(new RoomForm("",""));
			}
			for(RoomForm room:bookingDetailsservice.findAll()) {
				roomList.add(room);
			}
		model.addAttribute("roomList",roomList);
		model.addAttribute("reservation",reservation);
		return "bookingdetails/bookingdetailsview";
			}else {
				ArrayList<RoomForm>roomList = new ArrayList<>();
				//部屋タイプがnullでない場合はセレクトタグ配列に追加
				if(!(reservation.getNumber()== null)) {
					roomList.add(new RoomForm(reservation.getNumber().getRoomnumber(),reservation.getNumber().getRoomname()));
				//部屋タイプがnullの場合は、空文字に置き換えて追加
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
	}
	@PostMapping("bookingdetails")
	String roomChange(Reservation reservation,Model model) {
		bookingDetailsservice.roomChange(reservation.getResnumber(), reservation.getRoomnumber());
		Reservation reservation1 = bookingDetailsservice.findOne(reservation.getResnumber());
		ArrayList<RoomForm>roomList = new ArrayList<>();
		//nullでない場合はセレクトタグ配列に追加
		if(!(reservation1.getNumber()== null)) {
			roomList.add(new RoomForm(reservation1.getNumber().getRoomnumber(),reservation1.getNumber().getRoomname()));
//		//nullの場合は、空文字に置き換えて追加
		}else {
			roomList.add(new RoomForm("",""));
		}
		for(RoomForm room1:bookingDetailsservice.findAll()) {
			roomList.add(room1);
		}
	model.addAttribute("roomList",roomList);
	model.addAttribute("reservation",reservation1);
		return"bookingdetails/bookingdetailsview";
	}
}
