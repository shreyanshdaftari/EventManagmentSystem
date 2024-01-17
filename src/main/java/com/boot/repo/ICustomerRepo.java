package com.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.boot.entity.Customer;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, String>{

	@Query("from Customer c where c.email = :email and c.password = :pass")
	public Customer getCustomerAccess(String email, String pass);
}