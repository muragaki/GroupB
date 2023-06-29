package com.example.reservationsystem.domain.entity;


import jakarta.persistence.Entity;
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

private String name;
private String dateofbirth;
private String address;
private String phonenumber;
private String malladdress;
}
