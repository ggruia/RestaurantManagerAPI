package com.restaurant_manager.product;

import com.restaurant_manager.category.Category;
import com.restaurant_manager.ingredient.Ingredient;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    //private Category category;
    private Double price;
    private Boolean units;
    private Double grams;
    //private List<Ingredient> ingredients;

    public Product() {
    }

    public Product(Integer id, String name, String description, Double price, Boolean units, Double grams) {
        this.id = id;
        this.name = name;
        this.description = description;
        //this.category = category;
        this.price = price;
        this.units = units;
        this.grams = grams;
        //this.ingredients = ingredients;
    }

    public Product(String name, String description, Double price, Boolean units, Double grams) {
        this.name = name;
        this.description = description;
        //this.category = category;
        this.price = price;
        this.units = units;
        this.grams = grams;
        //this.ingredients = ingredients;
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

    public Boolean getUnits() {
        return units;
    }

    public void setUnits(Boolean units) {
        this.units = units;
    }

    public Double getGrams() {
        return grams;
    }

    public void setGrams(Double grams) {
        this.grams = grams;
    }

//    public List<Ingredient> getIngredients() {
//        return ingredients;
//    }
//
//    public void setIngredients(List<Ingredient> ingredients) {
//        this.ingredients = ingredients;
//    }

//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                //", category='" + category + '\'' +
                ", price=" + price +
                ", units=" + units +
                ", grams=" + grams +
                //", ingredients=" + ingredients +
                '}';
    }
}
