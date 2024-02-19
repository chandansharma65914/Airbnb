package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Repository.BookingRepository;
import com.masai.entity.Booking;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired

	private BookingRepository bookingRepository;
    @Override
	public List<Booking> findAllBookings() {
		return  bookingRepository.findAll();
	}

	public Booking findBookingById(Long id) {
		return bookingRepository.findById(id).get();
	}

	public Booking saveBooking(Booking booking) {
	return 	bookingRepository.save(booking);
	}

}
