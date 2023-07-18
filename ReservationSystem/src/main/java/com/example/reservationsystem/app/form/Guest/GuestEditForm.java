package com.example.reservationsystem.app.form.Guest;

import java.time.LocalDate;
import java.util.ArrayList;

import com.example.reservationsystem.domain.entity.Address;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Valid
public class GuestEditForm {
	@NotEmpty
	private String guestcode;
	@NotEmpty
	private String firstname;
	@NotEmpty
	private String lastname;
	@NotNull
	@Past
	private LocalDate dateofbirth;
	private Address address;
	@Digits(integer = 10, fraction = 0)
	private String phonenumber;
	@Email
	private String mailaddress;
	ArrayList<Address> addressList;
}
