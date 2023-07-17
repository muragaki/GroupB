package com.example.reservationsystem.domain.service.NewReservation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.app.form.Plan.PlanEditForm;
import com.example.reservationsystem.app.form.Reservation.ReservationEditForm;
import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.entity.Planinformation;
import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.repository.Guest.GuestRepository;
import com.example.reservationsystem.domain.repository.Planinfomation.PlaninfomationRepository;
import com.example.reservationsystem.domain.repository.Reservation.ReservationRepository;

@Service
public class NewResavationService {
@Autowired
ReservationRepository reservationrepository;
@Autowired
GuestRepository guestRepository;
@Autowired
PlaninfomationRepository planinformationRepository;

//フォームをもらってデータベースに保存するメソッド
public void save(ReservationEditForm reservationEditForm) {
	/*お客さん用の場合復活
	 * guestRepository.save(new Guest(reservationEditForm.getGuestcode(),reservationEditForm.getFirstname(),
			reservationEditForm.getLastname(),reservationEditForm.getDateofbirth(),reservationEditForm.getAddress(),
			reservationEditForm.getPhonenumber(),reservationEditForm.getMailaddress()));
	*/
	Reservation reservation = new Reservation();
	reservation.setGuestcode(reservationEditForm.getGuestcode());
	reservation.setPlancode(reservationEditForm.getPlan().getPlanCode());
	reservation.setArrday(reservationEditForm.getArrday());
	reservation.setDepday(reservationEditForm.getDepday());
	reservation. setPersons(reservationEditForm.getPersons());
	reservationrepository.save(reservation);
}

//フォームにゲスト情報をセットする
public ReservationEditForm setGuest(String guestcode) {
	Guest guest =guestRepository.findByGuestcode(guestcode);
	ReservationEditForm reservationEditForm = new ReservationEditForm();
	reservationEditForm.setFirstname(guest.getFirstname());
	reservationEditForm.setLastname(guest.getLastname());
	reservationEditForm.setAddress(guest.getAddress());
	reservationEditForm.setDateofbirth(guest.getDateofbirth());
	reservationEditForm.setPhonenumber(guest.getPhonenumber());
	reservationEditForm.setMailaddress(guest.getMailaddress());
	return reservationEditForm;
	
}
//プランの情報のコードと名前を切り取ってすべてとってくる
public ArrayList<PlanEditForm> findCodeNameAll(){
	ArrayList<PlanEditForm> planEditFromList= new ArrayList<>();
	for(Planinformation planinformation : planinformationRepository.findAll()){
		planEditFromList.add(new PlanEditForm(planinformation.getPlancode(),planinformation.getPlanname()));
				}
	return planEditFromList;
}

}
