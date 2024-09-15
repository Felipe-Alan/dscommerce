package com.alandev.dscommerceproject.services;

import com.alandev.dscommerceproject.dto.OrderDTO;
import com.alandev.dscommerceproject.dto.ProductDTO;
import com.alandev.dscommerceproject.entities.Order;
import com.alandev.dscommerceproject.entities.Product;
import com.alandev.dscommerceproject.repositories.OrderRepository;
import com.alandev.dscommerceproject.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Resource not found"));
        return new OrderDTO(order);
    }
}
