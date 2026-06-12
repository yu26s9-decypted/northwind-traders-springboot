package com.pluralsight.northwind_traders_springboot.Repository;

import com.pluralsight.northwind_traders_springboot.Model.Category;
import com.pluralsight.northwind_traders_springboot.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(Category category);
    List<Product> findByPrice(BigDecimal price);
    List<Product> findByName(String name);
}
