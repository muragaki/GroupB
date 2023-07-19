package com.example.reservationsystem.domain.service.BookingDetailsService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.app.form.Room.RoomForm;
import com.example.reservationsystem.domain.entity.Reservation;
import com.example.reservationsystem.domain.entity.RoomInformation;
import com.example.reservationsystem.domain.repository.Reservation.ReservationRepository;
import com.example.reservationsystem.domain.repository.RoomInformationRepository.RoomInformationRepository;

@Service
public class BookingDetailsService {
	
@Autowired
ReservationRepository reservationRepository;

@Autowired
RoomInformationRepository roomInformationRepository;


public Reservation example(Integer a) {
	return reservationRepository.findByResnumber(a);
}

public Reservation findOne(Integer resnumber) {
	return reservationRepository.findByResnumber(resnumber);
}

/**
 * ルーム情報をデータベースからとってくる
 * @return　
 */
public ArrayList<RoomForm> findAll(){
			ArrayList<RoomForm> roomList = new ArrayList <>();
			for(RoomInformation room:roomInformationRepository.findAll()) {
				roomList.add(new RoomForm(room.getRoomnumber(),room.getRoomname()));
			}
			return roomList;
}

/**
 * 予約に部屋タイプが変わっていれば、変更する。
 * @param resnumber
 * @param roomnumber
 */
public void roomChange(Integer resnumber,String roomnumber) {
	Reservation res = reservationRepository.findByResnumber(resnumber);
	if(!(reservationRepository.findByResnumber(resnumber).getRoomnumber()==null)) {
	if(!(reservationRepository.findByResnumber(resnumber).getRoomnumber().equalsIgnoreCase(roomnumber))) {
		res.setRoomnumber(roomnumber);
		reservationRepository.save(res);
	}
	}else if(!(roomnumber.equalsIgnoreCase(""))){
		res.setRoomnumber(roomnumber);
		reservationRepository.save(res);
	}
}

}
