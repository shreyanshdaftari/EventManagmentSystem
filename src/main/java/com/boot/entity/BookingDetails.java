package com.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookingDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	@Column(length=50)
	private String city;
	@Column(length=50)
	private String place;
	private double price;
	@Column(length=55)
	private String email;
	
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingDetails(String city, String place, double price, String email) {
		super();
		this.city = city;
		this.place = place;
		this.price = price;
		this.email = email;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingDetails(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "BookingDetails [bookingId=" + bookingId + ", city=" + city + ", place=" + place + ", price="
				+ price + ", email=" + email + "]";
	}
}
