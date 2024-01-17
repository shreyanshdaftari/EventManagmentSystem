package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.Customer;
import com.boot.repo.ICustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private ICustomerRepo repo;
	
	public void addCustomer(Customer cst) {
		System.out.println("In add customer method in service");
		repo.save(cst);
	}
	
	public List<Customer> getAllCustomers(){
		return repo.findAll();
	}
	
	public Customer getCustomerAccess(String email, String pass) {
		return repo.getCustomerAccess(email, pass);
	}
}
