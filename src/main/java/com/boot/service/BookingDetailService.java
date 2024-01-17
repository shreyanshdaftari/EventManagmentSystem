package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.boot.entity.BookingDetails;
import com.boot.repo.BookingDetailsRepo;

@Service
public class BookingDetailService {

	@Autowired
	private BookingDetailsRepo repo;
	
	public void addBookingDetails(BookingDetails bkd) {
		repo.save(bkd);
	}
	
	public List<BookingDetails> getBookingsByUserId(String email){
		return repo.getBookingsByUserId(email);
	}
	
	public void deleteBooking(int id) {
		repo.deleteBooking(id);
	}
}
