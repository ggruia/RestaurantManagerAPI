package com.restaurant_manager.controller;

import com.restaurant_manager.entity.product.Product;
import com.restaurant_manager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping(path = "api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public Collection<Product> getProducts() {
        return productService.getProducts();
    }
}
