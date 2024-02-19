package com.masai.service;

import java.util.List;

import com.masai.entity.Booking;

public interface BookingService {
	
	/**
	 * 
	 * @return this will return list All lists of booking.
	 */
	public List<Booking> findAllBookings();
	
	
	/**
	 * 
	 * @param id
	 * @return it will return Booking
	 */
	public Booking findBookingById(Long id);
	
	
	/**
	 * 
	 * @param booking
	 * @return It will return booking
	 */
	public Booking saveBooking(Booking booking);

}
