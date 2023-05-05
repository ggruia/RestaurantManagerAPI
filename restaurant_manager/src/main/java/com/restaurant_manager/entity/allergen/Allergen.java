package com.restaurant_manager.entity.allergen;

import com.restaurant_manager.entity.ingredient.Ingredient;
import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "allergens")
public class Allergen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToMany(mappedBy = "allergens")
    private Collection<Ingredient> ingredients;

    public Allergen() {
    }

    public Allergen(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Allergen(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Allergen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
