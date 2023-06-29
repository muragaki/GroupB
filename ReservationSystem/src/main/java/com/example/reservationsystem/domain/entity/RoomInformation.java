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
@Table(name = "roominformation")

public class RoomInformation {
	@Id
	private String roomnumber;
	private String roomname;
	private int	   roomsize;
}
