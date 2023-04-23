package com.restaurant_manager.allergy;

public class Allergen {
    private Integer id;
    private String name;

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
