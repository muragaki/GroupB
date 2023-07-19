package com.example.reservationsystem.app.controller.Admin.UserEdit;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author kuwano
 * ユーザー編集画面の表示
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.reservationsystem.domain.entity.RoleName;
import com.example.reservationsystem.domain.entity.User;
import com.example.reservationsystem.domain.service.UserEdit.UserEditService;

/**
 * コントローラー
 * ユーザー編集機能
 * @author kuwa
 * @version 1.0
 *
 */


@Controller
@RequestMapping("/admin")
public class UserEditController {
@Autowired
UserEditService usereditservice;	//エディットサービス

/**
 * 
 * @param userId
 * @param lastname
 * @param firstname
 * @param rolename
 * @param password
 * @param model
 * @return	"admin/useredit/useredit"
 */
@GetMapping("/useredit")
String edit(@RequestParam("userId")String userId,@RequestParam("lastName")String lastname,@RequestParam("firstName")String firstname,@RequestParam("roleName")RoleName rolename,@RequestParam("password")String password,Model model) {
	User user = new User();				//ユーザークラスのコンストラクタ作成
	user.setUserId(userId);				//ユーザーIDのセット
	user.setLastName(lastname);			//性のセット
	user.setFirstName(firstname);		//名のセット
	user.setRoleName(rolename);			//役職のセット
	user.setPassword(password);			//パスワードのセット
	model.addAttribute("user", user);	//モデルへのデータ追加
	return "admin/useredit/useredit";
}


}
