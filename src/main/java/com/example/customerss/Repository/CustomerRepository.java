package com.example.customerss.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.customerss.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	

}