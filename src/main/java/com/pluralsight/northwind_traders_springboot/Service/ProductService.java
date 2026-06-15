package com.pluralsight.northwind_traders_springboot.Service;

import com.pluralsight.northwind_traders_springboot.Model.Product;
import com.pluralsight.northwind_traders_springboot.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository ){
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long productId) { return productRepository.findById(productId);}

    public Product createProduct(Product product){
        return productRepository.save(product);
    }
}
