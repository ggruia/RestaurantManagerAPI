package com.restaurant_manager.ingredient;

import com.restaurant_manager.allergy.Allergen;

import java.util.List;

public class Ingredient {
    private Integer id;
    private String name;
    private List<Allergen> allergens;

    public Ingredient() {
    }

    public Ingredient(Integer id, String name, List<Allergen> allergens) {
        this.id = id;
        this.name = name;
        this.allergens = allergens;
    }

    public Ingredient(String name, List<Allergen> allergens) {
        this.name = name;
        this.allergens = allergens;
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

    public List<Allergen> getAllergens() {
        return allergens;
    }

    public void setAllergens(List<Allergen> allergens) {
        this.allergens = allergens;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", allergens=" + allergens +
                '}';
    }
}
