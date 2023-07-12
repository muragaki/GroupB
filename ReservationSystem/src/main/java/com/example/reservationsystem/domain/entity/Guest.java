package com.example.reservationsystem.domain.entity;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="guest")


public class Guest {
@Id
private String guestcode;
@NotEmpty
private String firstname;
@NotEmpty
private String lastname;
@Past
private LocalDate dateofbirth;
@Enumerated(EnumType.STRING)
@Column(nullable = true)
@NotNull
private Address address;
@Digits(integer = 10, fraction = 0)
private String phonenumber;
@Email
private String mailaddress;
}
