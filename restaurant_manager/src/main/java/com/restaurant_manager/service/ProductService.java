package com.restaurant_manager.service;

import com.restaurant_manager.entity.product.ProductGetDto;
import com.restaurant_manager.entity.product.ProductPostDto;

import java.util.Collection;

public interface ProductService {
    public Collection<ProductGetDto> getProducts();
    public ProductGetDto createProduct(ProductPostDto dto);
}
