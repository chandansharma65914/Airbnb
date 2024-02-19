package com.masai.service;

import java.util.List;

import com.masai.entity.Guest;

public interface GuestService {
	
	
	/**
	 * 
	 * @return   It will return All lists of Guest
	 */
	public List<Guest> findAllGuests();
	
	
	/**
	 * 
	 * @param id
	 * @return It will return Guest related to that id
	 */
	public Guest findGuestById(Long id);
	
	
	/**
	 * 
	 * @param guest
	 * @return it will return guest
	 */
	public Guest saveGuest(Guest guest);

}
