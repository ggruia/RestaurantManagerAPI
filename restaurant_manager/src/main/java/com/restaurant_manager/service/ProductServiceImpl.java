package com.restaurant_manager.service;

import com.restaurant_manager.entity.product.Product;
import com.restaurant_manager.entity.product.ProductGetDto;
import com.restaurant_manager.entity.product.ProductPostDto;
import com.restaurant_manager.repository.CategoryRepository;
import com.restaurant_manager.repository.IngredientRepository;
import com.restaurant_manager.repository.ProductRepository;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private IngredientRepository ingredientRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Collection<ProductGetDto> getProducts() {
        return productRepository
                .findAll()
                .stream()
                .map(p -> modelMapper.map(p, ProductGetDto.class))
                .toList();
    }

    @Override
    public ProductGetDto createProduct(ProductPostDto productDto) {
        var product = modelMapper.map(productDto, Product.class);
        productRepository.save(product);
        return modelMapper.map(product, ProductGetDto.class);
    }
}
