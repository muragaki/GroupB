package com.example.reservationsystem.app.form.user;

import java.util.ArrayList;
import java.util.List;

import com.example.reservationsystem.domain.entity.RoleName;
import com.example.reservationsystem.domain.entity.User;

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
		
	//kuwa 追記(2023/7/12)
		ArrayList<User>userList = new ArrayList<>();
	}

