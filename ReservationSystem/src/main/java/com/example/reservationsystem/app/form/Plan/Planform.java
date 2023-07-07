package com.example.reservationsystem.app.form.Plan;

import java.util.ArrayList;

import com.example.reservationsystem.domain.entity.Planinformation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Planform {
	ArrayList<Planinformation> planList = new ArrayList<>();
	}
