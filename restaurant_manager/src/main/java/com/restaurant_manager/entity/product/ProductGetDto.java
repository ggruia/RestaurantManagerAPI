package com.restaurant_manager.entity.product;

public class ProductGetDto {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Double grams;

    public ProductGetDto() {
    }

    public ProductGetDto(Integer id, String name, String description, Double price, Double grams) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.grams = grams;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
