package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Repository.GuestRepository;
import com.masai.controller.GuestController;
import com.masai.entity.Guest;

@Service
public class GuestServiceImpl implements GuestService {

	@Autowired

	private GuestRepository guestRepository;

	public List<Guest> findAllGuests() {
		return guestRepository.findAll();
	}

	public Guest findGuestById(Long id) {
		return  guestRepository.findById(id).get();
	}

	public Guest saveGuest(Guest guest) {
		return guestRepository.save(guest);
	}

}
