package com.example.reservationsystem.app.form.Reservation;

import java.time.LocalDate;
import java.util.ArrayList;

import com.example.reservationsystem.app.form.Plan.PlanEditForm;
import com.example.reservationsystem.domain.entity.Address;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
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
	@NotNull
	private String guestcode;
	@NotEmpty
	private String firstname;
	@NotEmpty
	private String lastname;
	@Past
	private LocalDate dateofbirth;
	private Address address;
	//セレクトタグで住所選択用
	ArrayList<Address> addressList =  new ArrayList<>();
	
	private String phonenumber;
	
	private String mailaddress;
	
	private PlanEditForm plan;
	//プラン情報をセレクトタグで選択
	private ArrayList<PlanEditForm> planList = new ArrayList<>();
	@NotNull
	@Future
	private LocalDate arrday;
	@NotNull
	@Future
	private LocalDate depday;
	@NotNull
	@Min(1)
	@Max(50)
	private Integer persons;
	

}
