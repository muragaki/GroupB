package com.example.reservationsystem.app.controller.RegisterC;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.reservationsystem.app.form.Plan.PlanEditForm;
import com.example.reservationsystem.app.form.Reservation.ReservationEditForm;
import com.example.reservationsystem.domain.service.RegisterS.RegisterService;
@Controller

public class RegisterController {

@Autowired
RegisterService registerservice ;
@PostMapping("register")
String register(String plancode, Model model) {
	ReservationEditForm register=new ReservationEditForm();
//	PlanEditForm plneditform = new PlanEditForm();
//	reservationeditform.getPlanList().add(plneditform);
	register.setPlan(new PlanEditForm(registerservice.findByPlancode(plancode).getPlancode(),registerservice.findByPlancode(plancode).getPlanname()));
//	Reservation register1 =new Reservation();
//	register1.setGuestcode(guestcode);
//	register1.setPlancode(plancode);
	model.addAttribute("register",register);
	return "register/registerview";

}


}