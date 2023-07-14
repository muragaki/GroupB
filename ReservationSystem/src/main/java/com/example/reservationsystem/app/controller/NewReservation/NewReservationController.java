package com.example.reservationsystem.app.controller.NewReservation;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.reservationsystem.app.form.Reservation.ReservationEditForm;
import com.example.reservationsystem.domain.entity.Address;
import com.example.reservationsystem.domain.service.NewReservation.NewResavationService;

@Controller
public class NewReservationController {

	@Autowired
	NewResavationService newreservationservice;
	
	@GetMapping("newreservationview")
	String reservation1(@RequestParam("guest")String guestcode, ReservationEditForm reservationEditForm, Model model) {
		reservationEditForm = newreservationservice.setGuest(guestcode);
		reservationEditForm.setPlanList(newreservationservice.findCodeNameAll());
		reservationEditForm.setAddressList(new ArrayList<Address>(Arrays.asList(Address.Hokkaido,Address.Aomori,Address.Iwate,Address.Miyagi,Address.Akita,Address.Yamagata,Address.Fukushima,Address.Ibaraki,Address.Tochigi,Address.Gunma,Address.Saitama,Address.Chiba,Address.Tokyo,Address.Kanagawa,Address.Niigata,Address.Toyama,Address.Ishikawa,Address.Fukui,Address.Yamanashi,Address.Nagano,Address.Gihu,Address.Shizuoka,Address.Aichi,Address.Mie,Address.Shiga,Address.Kyoto,Address.Osaka,Address.Hyogo,Address.Nara,Address.Wakayama,Address.Tottori,Address.Shimane,Address.Okayama,Address.Hiroshima,Address.Yamaguchi,Address.Tokushima,Address.Kagawa,Address.Ehime,Address.Kochi,Address.Fukuoka,Address.Saga,Address.Nagasaki,Address.Kumamoto,Address.Oita,Address.Miyazaki,Address.Kagoshima,Address.Okinawa)));
		reservationEditForm.setGuestcode(guestcode);
		model.addAttribute("reservationEditForm", reservationEditForm);
		return "newreservation/newreservation";
	}
	
	@PostMapping("reservationsave")
	String reservationsave( ReservationEditForm reservationEditForm,Model model) {
		newreservationservice.save(reservationEditForm);
		return "newreservation/reservationsave";
	}
	
}
