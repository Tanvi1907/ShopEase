package com.shopease.backend;

import java.util.List;
import com.shopease.backend.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/api/products")
    public List<Product> getProducts() {

        return List.of(
            new Product(1L, "Laptop", "HP Laptop", 45000, 10),
            new Product(2L, "Mobile", "Samsung Mobile", 20000, 15),
            new Product(3L, "Headphones", "Wireless Headphones", 1500, 20)
        );
    }
}
