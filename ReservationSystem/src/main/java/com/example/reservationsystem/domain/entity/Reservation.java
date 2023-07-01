/*package com.example.reservationsystem.domain.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

*//**
	* 
	* @author Katsuki
	*
	*//*
		@Entity
		@Data
		@NoArgsConstructor
		@AllArgsConstructor
		@Table(name="res_table")
		public class Reservation {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer resnumber;
		
		private Integer pernumber;
		@ManyToOne
		@JoinColumn(name="pernumber", insertable=false, updatable=false)
		private Guest guest;
		
		private Integer plannumber;
		@ManyToOne
		@JoinColumn(name="", insertable=false, updatable=false)
		private Planinfomation plan;
		
		private LocalDate arrday;
		
		private LocalDate depday;
		
		private Integer persons;
		
		private Integer roomnumber;
		@ManyToOne
		@JoinColumn(name="roomnumber", insertable=false, updatable=false)
		private RoomInformation number;
		}
		*/