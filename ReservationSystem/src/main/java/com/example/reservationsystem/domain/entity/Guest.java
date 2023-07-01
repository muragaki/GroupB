package com.example.reservationsystem.domain.entity;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
private String firstname;
private String lastname;
private LocalDate dateofbirth;
@Enumerated(EnumType.STRING)
private Address address;
private String phonenumber;
private String malladdress;
}
