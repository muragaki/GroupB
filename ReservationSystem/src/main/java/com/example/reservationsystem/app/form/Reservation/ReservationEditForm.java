package com.example.reservationsystem.app.form.Reservation;

import java.time.LocalDate;
import java.util.ArrayList;

import com.example.reservationsystem.app.form.Plan.PlanEditForm;
import com.example.reservationsystem.domain.entity.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author katsuki
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationEditForm {
	private String guestcode;
	private String firstname;
	private String lastname;
	private LocalDate dateofbirth;
	private Address address;
	//セレクトタグで住所選択用
	ArrayList<Address> addressList =  new ArrayList<>();
	private String phonenumber;
	private String mailaddress;
	private PlanEditForm plan;
	//プラン情報をセレクトタグで選択
	private ArrayList<PlanEditForm> planList = new ArrayList<>();
	private LocalDate arrday;
	private LocalDate depday;
	private Integer persons;
	

}
