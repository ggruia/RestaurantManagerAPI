package com.restaurant_manager.service;

import com.restaurant_manager.entity.product.Product;
import com.restaurant_manager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Collection<Product> getProducts() {
        return productRepository.findAll();
    }
}
