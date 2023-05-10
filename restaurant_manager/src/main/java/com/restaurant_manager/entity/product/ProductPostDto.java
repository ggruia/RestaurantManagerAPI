package com.restaurant_manager.entity.product;

import java.util.Collection;

public class ProductPostDto {
    private String name;
    private String description;
    private Double price;
    private Double grams;
    private Integer categoryId;
    private Collection<Integer> ingredientIds;

    public ProductPostDto(String name, String description, Double price, Double grams, Integer categoryId, Collection<Integer> ingredientIds) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.grams = grams;
        this.categoryId = categoryId;
        this.ingredientIds = ingredientIds;
    }

    public ProductPostDto(String name, String description, Double price, Double grams) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.grams = grams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getGrams() {
        return grams;
    }

    public void setGrams(Double grams) {
        this.grams = grams;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Collection<Integer> getIngredientIds() {
        return ingredientIds;
    }

    public void setIngredientIds(Collection<Integer> ingredientIds) {
        this.ingredientIds = ingredientIds;
    }
}
