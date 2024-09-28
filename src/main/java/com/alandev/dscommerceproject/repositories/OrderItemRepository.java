package com.alandev.dscommerceproject.repositories;

import com.alandev.dscommerceproject.entities.Order;
import com.alandev.dscommerceproject.entities.OrderItem;
import com.alandev.dscommerceproject.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
