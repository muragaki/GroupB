package com.example.reservationsystem.app.controller.RegisterC;



import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.reservationsystem.app.form.Plan.PlanEditForm;
import com.example.reservationsystem.app.form.Reservation.ReservationEditForm;
import com.example.reservationsystem.domain.entity.Address;
import com.example.reservationsystem.domain.service.RegisterS.RegisterService;
@Controller

public class RegisterController {

@Autowired
RegisterService registerservice ;
@PostMapping("register")
String register(String plancode, Model model) {
	ReservationEditForm reservationEditForm=new ReservationEditForm();
//	PlanEditForm plneditform = new PlanEditForm();
//	reservationeditform.getPlanList().add(plneditform);
	reservationEditForm.setPlan(new PlanEditForm(registerservice.findByPlancode(plancode).getPlancode(),registerservice.findByPlancode(plancode).getPlanname()));
//	Reservation register1 =new Reservation();
//	register1.setGuestcode(guestcode);
//	register1.setPlancode(plancode);
	reservationEditForm.setAddressList(new ArrayList<Address>(Arrays.asList(Address.Hokkaido,Address.Aomori,Address.Iwate,Address.Miyagi,Address.Akita,Address.Yamagata,Address.Fukushima,Address.Ibaraki,Address.Tochigi,Address.Gunma,Address.Saitama,Address.Chiba,Address.Tokyo,Address.Kanagawa,Address.Niigata,Address.Toyama,Address.Ishikawa,Address.Fukui,Address.Yamanashi,Address.Nagano,Address.Gihu,Address.Shizuoka,Address.Aichi,Address.Mie,Address.Shiga,Address.Kyoto,Address.Osaka,Address.Hyogo,Address.Nara,Address.Wakayama,Address.Tottori,Address.Shimane,Address.Okayama,Address.Hiroshima,Address.Yamaguchi,Address.Tokushima,Address.Kagawa,Address.Ehime,Address.Kochi,Address.Fukuoka,Address.Saga,Address.Nagasaki,Address.Kumamoto,Address.Oita,Address.Miyazaki,Address.Kagoshima,Address.Okinawa)));
	model.addAttribute("reservationEditForm",reservationEditForm);
	return "register/registerview";

}


}