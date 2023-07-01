package com.example.reservationsystem.app.form.user;

import java.util.List;

import com.example.reservationsystem.domain.entity.RoleName;

import jakarta.validation.constraints.Size;
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
	public class UserForm {
		@Size(min=8, max=16)
		private String username;
		@Size(min=8, max=16)
		private String password;
		@Size(min=1, max=8)
		private String firstname;
		@Size(min=1, max=8)
		private String lastname;
//		@Size(min=4, max=5)
		private RoleName rolename;
		private List<RoleName> roleNameList;
	}

