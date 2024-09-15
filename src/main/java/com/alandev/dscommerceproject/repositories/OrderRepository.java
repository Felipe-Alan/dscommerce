package com.alandev.dscommerceproject.repositories;

import com.alandev.dscommerceproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
