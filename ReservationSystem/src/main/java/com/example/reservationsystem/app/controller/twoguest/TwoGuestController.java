package com.example.reservationsystem.app.controller.twoguest;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.reservationsystem.app.form.Guest.GuestEditForm;
import com.example.reservationsystem.domain.entity.Address;
import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.service.TwoGuest.TwoGuestService;

@Controller

public class TwoGuestController {
	@Autowired
	TwoGuestService twoguestService;

	@GetMapping("/twoguest")
	String example(@RequestParam("guest")String guestcode, Model model) {
			Guest guest = twoguestService.findOne(guestcode);
		model.addAttribute("guest",guest);
		return "twoguest/twoguestview";
	}

	@GetMapping("one")
	String reservation1(@ModelAttribute GuestEditForm guestEditForm, Model model) {
		guestEditForm.setAddressList(new ArrayList<Address>(Arrays.asList(Address.Hokkaido,Address.Aomori,Address.Iwate,Address.Miyagi,Address.Akita,Address.Yamagata,Address.Fukushima,Address.Ibaraki,Address.Tochigi,Address.Gunma,Address.Saitama,Address.Chiba,Address.Tokyo,Address.Kanagawa,Address.Niigata,Address.Toyama,Address.Ishikawa,Address.Fukui,Address.Yamanashi,Address.Nagano,Address.Gihu,Address.Shizuoka,Address.Aichi,Address.Mie,Address.Shiga,Address.Kyoto,Address.Osaka,Address.Hyogo,Address.Nara,Address.Wakayama,Address.Tottori,Address.Shimane,Address.Okayama,Address.Hiroshima,Address.Yamaguchi,Address.Tokushima,Address.Kagawa,Address.Ehime,Address.Kochi,Address.Fukuoka,Address.Saga,Address.Nagasaki,Address.Kumamoto,Address.Oita,Address.Miyazaki,Address.Kagoshima,Address.Okinawa)));
		model.addAttribute("guestEditForm", guestEditForm);
		return "twoguest/oneview";
	}

	@PostMapping("guestsave")
	String guestsave(@Validated GuestEditForm guestEditForm,BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()) {
			return "/twoguest/oneview";
		}
		twoguestService.save(guestEditForm);
		return "twoguest/guestsave";
	}
}
