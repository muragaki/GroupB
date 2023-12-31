package com.example.reservationsystem.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 
 * @author Katsuki
 *
 */
@Getter
@AllArgsConstructor
public enum RoleName  {
	ADMIN("ADMIN", "ADMIN"),
	USER("USER", "USER");
	
	private final String value;
    private final String text;
}
