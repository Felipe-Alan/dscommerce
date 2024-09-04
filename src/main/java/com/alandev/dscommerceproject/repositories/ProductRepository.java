package com.alandev.dscommerceproject.repositories;

import com.alandev.dscommerceproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
