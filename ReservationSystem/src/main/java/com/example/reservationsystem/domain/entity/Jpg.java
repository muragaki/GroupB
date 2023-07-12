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
@Table(name="jpgphot")


public class Jpg {
	@Id
	private String jpgname;
	private String jpg1;
	private String jpg2;
	private String jpg3;
	private String jpg4;
	
}
