package com.example.reservationsystem.domain.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
	* 
	* @author Katsuki
	*
	*/
		@Data
		@NoArgsConstructor
		@AllArgsConstructor
		@Entity
		@Table(name="res_table")
		public class Reservation {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer resnumber;
		
		private  String guestcode;
		@ManyToOne
		@JoinColumn(name="guestcode", insertable=false, updatable=false)
		private Guest guest;
		
		private  String plancode;
		@ManyToOne
		@JoinColumn(name="plancode", insertable=false, updatable=false)
		private Planinformation plan;
		
		private LocalDate arrday;
		
		private LocalDate depday;
		
		private Integer persons;
		
		private String roomnumber;
		@ManyToOne
		@JoinColumn(name="roomnumber", insertable=false, updatable=false)
		private RoomInformation number;
		}
		