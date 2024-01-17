package com.boot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.boot.entity.BookingDetails;

@Repository
public interface BookingDetailsRepo extends JpaRepository<BookingDetails, Integer>{
	
	@Query("from BookingDetails b where b.email=:email")
	public List<BookingDetails> getBookingsByUserId(String email);
	
	@Modifying
	@Query("delete from BookingDetails b where b.bookingId=:bookingId")
	public void deleteBooking(int bookingId);
}
