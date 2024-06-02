package com.example.touchbasetele.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.touchbasetele.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
