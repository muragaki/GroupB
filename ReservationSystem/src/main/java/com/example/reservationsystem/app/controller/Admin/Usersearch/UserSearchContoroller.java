package com.example.reservationsystem.app.controller.Admin.Usersearch;


import java.util.ArrayList;

/**
 * @author kuwano
 * ユーザー一覧画面の表示
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.reservationsystem.app.form.user.UserForm;
import com.example.reservationsystem.domain.entity.User;
import com.example.reservationsystem.domain.service.UserSearchService.UserSearchService;

/**
 * コントローラー
 * ユーザー一覧表示機能
 * 
 * @author kuwa
 * @version　1.0
 */

@Controller
@RequestMapping("/admin")
public class UserSearchContoroller {
	@Autowired
	UserSearchService usersearchservice;	//一覧表示サービス
	
	/**
	 * @param userform
	 * @param model
	 * @return admin/usersearch/usersearch
	 */
	@GetMapping("usersearch")
	String userSearch(@ModelAttribute UserForm userform, Model model) {
		userform.setUserList( (ArrayList<User>) usersearchservice.readAll());	//ユーザー一覧から全ての情報を読み取る
		model.addAttribute("UserForm",userform);								////モデルへのデータ追加
		return "admin/usersearch/usersearch";
	}
	@DeleteMapping("deleteuser")
	String deleteUser(@ModelAttribute UserForm userform, Model model) {
		userform.setUserList( (ArrayList<User>) usersearchservice.readAll());	//ユーザー一覧から全ての情報を読み取る
		model.addAttribute("UserForm",userform);								//モデルへのデータ追加
		return "admin/usersearch/deleteuser";
	}
}
