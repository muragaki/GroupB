package com.example.reservationsystem.app.controller.Admin.Menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * 
 * @author Katsuki
 *
 */
@Controller
public class MenuContoroller {
@GetMapping("/admin/menu")
String menu() {
	return "admin/menu/adminmenu";
}

}
