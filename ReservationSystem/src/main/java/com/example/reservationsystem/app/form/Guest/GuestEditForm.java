package com.example.reservationsystem.app.form.Guest;

import java.time.LocalDate;
import java.util.ArrayList;

import com.example.reservationsystem.domain.entity.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestEditForm {
	private String guestcode;
	private String firstname;
	private String lastname;
	private LocalDate dateofbirth;
	private Address address;
	private String phonenumber;
	private String mailaddress;
	ArrayList<Address> addressList;
}
