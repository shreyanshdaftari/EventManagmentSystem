package com.boot.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entity.BookingDetails;
import com.boot.entity.Customer;
import com.boot.repo.BookingDetailsRepo;
import com.boot.service.BookingDetailService;
import com.boot.service.CustomerService;

@RestController
@CrossOrigin("http://localhost:3000")
public class Controller {

//	******************************************Customer****************************************************
	
	@Autowired
	private CustomerService custServ;
	
	@PostMapping("/Customer")
	public void addCustomer(@RequestBody Customer cst) {
		System.out.println("In add customer method in controller");
		custServ.addCustomer(cst);
	}
		
	@GetMapping("/Customer")
	public List<Customer> getAllCustomers(){
		return custServ.getAllCustomers();
	}
	
	@GetMapping("/Customer/{email}/{pass}")
	public Customer getCustomerAccess(@PathVariable String email,@PathVariable String pass) {
		return custServ.getCustomerAccess(email, pass);
	}
	
	
	
	
//	******************************************Bookings****************************************************
	
	@Autowired
	private BookingDetailService bkdServ;
	
	@PostMapping("/BookingDetails")
	public void addBookingDetails(@RequestBody BookingDetails bkd) {
		bkdServ.addBookingDetails(bkd);
	}
	
	@GetMapping("/BookingDetails/{email}")
	public List<BookingDetails> getBookingsByUserId(@PathVariable String email){
		return bkdServ.getBookingsByUserId(email);
	}
	
	@Transactional
	@DeleteMapping("/BookingDetails/{id}")
	public void deleteBooking(@PathVariable int id) {
		bkdServ.deleteBooking(id);
	}
}
