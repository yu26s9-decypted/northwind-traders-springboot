package com.pluralsight.northwind_traders_springboot.Controller;


import com.pluralsight.northwind_traders_springboot.Model.Product;
import com.pluralsight.northwind_traders_springboot.Service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
}
