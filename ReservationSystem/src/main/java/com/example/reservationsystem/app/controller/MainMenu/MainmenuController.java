package com.example.reservationsystem.app.controller.MainMenu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * 
 * @author Katsuki
 *
 */
@Controller
public class MainmenuController {

	@GetMapping("mainmenu")
	String mainMenu() {
		return "mainmenu/mainmenu";
	}
}
