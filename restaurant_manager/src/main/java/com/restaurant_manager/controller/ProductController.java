package com.restaurant_manager.controller;

import com.restaurant_manager.entity.product.ProductGetDto;
import com.restaurant_manager.entity.product.ProductPostDto;
import com.restaurant_manager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping(path = "api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public Collection<ProductGetDto> getProducts() {
        return productService.getProducts();
    }

    @PostMapping
    public ProductGetDto addProduct(@RequestBody ProductPostDto productDto) {
        return productService.createProduct(productDto);
    }
}
