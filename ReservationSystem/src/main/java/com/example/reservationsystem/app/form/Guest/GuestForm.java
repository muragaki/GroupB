package com.example.reservationsystem.app.form.Guest;

import java.util.ArrayList;

import com.example.reservationsystem.domain.entity.Guest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestForm {
ArrayList<Guest> guestList = new ArrayList<>();
}
