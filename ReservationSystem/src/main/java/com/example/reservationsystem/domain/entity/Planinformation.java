package com.example.reservationsystem.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "planinfomation")

public class Planinformation {
	@Id
	private String plancode;
	@NotEmpty
	private String planname;
	
	private String roomnumber;
	@ManyToOne
	@JoinColumn(name = "roomnumber", insertable = false, updatable = false)
	private RoomInformation room;
	
	private String remarks;

}
