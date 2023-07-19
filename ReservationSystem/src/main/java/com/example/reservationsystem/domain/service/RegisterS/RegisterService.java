package com.example.reservationsystem.domain.service.RegisterS;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.app.form.Reservation.ReservationEditForm;
import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.entity.Planinformation;
import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.repository.Guest.GuestRepository;
import com.example.reservationsystem.domain.repository.Planinfomation.PlaninfomationRepository;
import com.example.reservationsystem.domain.repository.Reservation.ReservationRepository;

@Service
public class RegisterService {
	@Autowired
	ReservationRepository reservationRepository;
	@Autowired
	GuestRepository guestRepository;
	@Autowired
	PlaninfomationRepository planinformationRepository;
	/**
	 * プラン情報を取得する
	 * @param plancode
	 * @return プラン情報
	 */
	public Planinformation findByPlancode(String plancode) {

		return planinformationRepository.findByPlancode(plancode);

	}

	/**
	 * 予約情報の一覧情報を取得する
	 * @return予約一覧
	 */
	public ArrayList<Reservation> register() {
		reservationRepository.findAll();
		ArrayList<Reservation> register = new ArrayList<Reservation>();
		register = (ArrayList<Reservation>) reservationRepository.findAll();

		return register;

	}

	

	//フォームにゲスト情報をセットする
	public ReservationEditForm setGuest(String guestcode) {
		Guest guest = guestRepository.findByGuestcode(guestcode);
		ReservationEditForm reservationEditForm = new ReservationEditForm();
		reservationEditForm.setFirstname(guest.getFirstname());
		reservationEditForm.setLastname(guest.getLastname());
		reservationEditForm.setDateofbirth(guest.getDateofbirth());
		reservationEditForm.setAddress(guest.getAddress());
		reservationEditForm.setPhonenumber(guest.getPhonenumber());
		reservationEditForm.setMailaddress(guest.getMailaddress());
		return reservationEditForm;
	}
	//	public Guest findOne(String guestcode) {
	//		
	//		return guestRepository.findByGuestcode(guestcode);
	//	}
	//    public Planinformation findTwe(String plancode) {
	//		
	//		return planinformationRepository.findByPlancode(plancode);
	//	}

}