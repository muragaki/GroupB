package com.example.reservationsystem.app.controller.RegisterC;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservationsystem.app.form.Reservation.ReservationEditForm;
import com.example.reservationsystem.domain.service.RegisterS.RegisterService;
@Controller
@RestController

public class RegisterController {



@Autowired
RegisterService registerservice ;
@PostMapping("register")

String register(@ModelAttribute("register")String guestcode,String plancode, Model model) {
	
	ReservationEditForm register=new ReservationEditForm();
//	PlanEditForm plneditform = new PlanEditForm();
//	reservationeditform.getPlanList().add(plneditform);
	
	

	
	register.getPlan().setPlanCode(plancode);
	register.getPlan().setPlanName(registerservice.findByPlancode(plancode).getPlanname());
	
	
//	Reservation register1 =new Reservation();
//	register1.setGuestcode(guestcode);
//	register1.setPlancode(plancode);

	model.addAttribute("register",register);
	
	return "register/reregisterview";

}


}