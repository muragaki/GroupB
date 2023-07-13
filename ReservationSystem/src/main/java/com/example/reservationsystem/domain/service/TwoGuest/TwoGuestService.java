package com.example.reservationsystem.domain.service.TwoGuest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.app.form.Guest.GuestEditForm;
import com.example.reservationsystem.domain.entity.Guest;
import com.example.reservationsystem.domain.repository.Guest.GuestRepository;

@Service

public class TwoGuestService {
	
	@Autowired
	GuestRepository guestRepository;
	
	public Guest findOne(String guestcode) {
		return guestRepository.findByGuestcode(guestcode);
	}
	
		public void save(GuestEditForm guestEditForm) {
			Guest guest = new Guest(
					guestEditForm.getGuestcode(),
					guestEditForm.getFirstname(),
					guestEditForm.getLastname(),
					guestEditForm.getDateofbirth(),
					guestEditForm.getAddress(),
					guestEditForm.getPhonenumber(),
					guestEditForm.getMailaddress()
					);
			guestRepository.save(guest);
		}
	public void save(Guest guest) {
		guestRepository.save(guest);

	}
}
