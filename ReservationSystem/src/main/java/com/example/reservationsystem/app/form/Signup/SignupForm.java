package com.example.reservationsystem.app.form.Signup;


import java.util.List;

import com.example.reservationsystem.domain.entity.RoleName;

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
	private RoleName rolename;
	private List<RoleName> roleNameList;
}