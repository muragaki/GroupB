package com.example.reservationsystem.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
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
@Table(name = "usr")
public class User {
	@Id
	private String userId;
	@NotEmpty
	private String password;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@Enumerated(EnumType.STRING)
	private RoleName roleName;
}