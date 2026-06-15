package com.pluralsight.northwind_traders_springboot.Repository;

import com.pluralsight.northwind_traders_springboot.Model.Category;
import com.pluralsight.northwind_traders_springboot.Model.Product;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(Category category);
    List<Product> findByPrice(BigDecimal price);
    List<Product> findByName(String name);
    @Query("SELECT p FROM Product p WHERE p.productId = :id")
    Optional<Product> findByProductId(Long id);
}
