package com.restaurant_manager.entity.ingredient;

import com.restaurant_manager.entity.allergen.Allergen;
import com.restaurant_manager.entity.product.Product;
import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "ingredients_allergens",
            joinColumns = @JoinColumn(name = "ingredient_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "allergen_id", referencedColumnName = "id"))
    private Collection<Allergen> allergens;
    @ManyToMany(mappedBy = "ingredients")
    private Collection<Product> products;

    public Ingredient() {
    }

    public Ingredient(Integer id, String name, Collection<Allergen> allergens) {
        this.id = id;
        this.name = name;
        this.allergens = allergens;
    }

    public Ingredient(String name, Collection<Allergen> allergens) {
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

    public Collection<Allergen> getAllergens() {
        return allergens;
    }

    public void setAllergens(Collection<Allergen> allergens) {
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
