package com.alandev.dscommerceproject.repositories;

import com.alandev.dscommerceproject.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = """
                    SELECT obj
                    FROM Product obj
                    WHERE UPPER(obj.name)
                    LIKE UPPER(concat('%', :name, '%'))
            """)
    Page<Product> searchByName(String name, Pageable pageable);
}
