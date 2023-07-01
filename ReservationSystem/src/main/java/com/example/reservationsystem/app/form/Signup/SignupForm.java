package com.example.reservationsystem.app.form.Signup;


import jakarta.validation.constraints.Size;
import lombok.Data;
/**
 * 
 * @author Katsuki
 *
 */

@Data
public class SignupForm {
	@Size(min=8, max=16)
	private String username;
	@Size(min=8, max=16)
	private String password;
	@Size(min=1, max=8)
	private String firstname;
	@Size(min=1, max=8)
	private String lastname;
}