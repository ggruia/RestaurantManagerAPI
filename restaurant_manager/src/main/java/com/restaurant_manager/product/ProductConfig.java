package com.restaurant_manager.product;

import com.restaurant_manager.allergy.Allergen;
import com.restaurant_manager.category.Category;
import com.restaurant_manager.ingredient.Ingredient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repository) {
        return args -> {
            Product quattroFormaggiPizza = new Product(
                        1,
                        "Quattro Formaggi",
                        "4-cheese pizza",
                        //new Category(1, "Pizza"),
                        26.0,
                        true,
                        350.0
//                        List.of(
//                                new Ingredient(
//                                        1,
//                                        "Pizza dough",
//                                        List.of(
//                                                new Allergen(
//                                                        1,
//                                                        "Gluten"
//                                                ),
//                                                new Allergen(
//                                                        3,
//                                                        "Egg"
//                                                )
//                                        )
//                                ),
//                                new Ingredient(
//                                        2,
//                                        "Mozzarella",
//                                        List.of(
//                                                new Allergen(
//                                                        2,
//                                                        "Milk"
//                                                )
//                                        )
//                                ),
//                                new Ingredient(
//                                        3,
//                                        "Gorgonzola",
//                                        List.of(
//                                                new Allergen(
//                                                        2,
//                                                        "Milk"
//                                                )
//                                        )
//                                ),
//                                new Ingredient(
//                                        4,
//                                        "Parmesan",
//                                        List.of(
//                                                new Allergen(
//                                                        2,
//                                                        "Milk"
//                                                )
//                                        )
//                                ),
//                                new Ingredient(
//                                        5,
//                                        "Goat cheese",
//                                        List.of(
//                                                new Allergen(
//                                                        2,
//                                                        "Milk"
//                                                )
//                                        )
//                                ),
//                                new Ingredient(
//                                        6,
//                                        "Pepper",
//                                        List.of()
//                                ),
//                                new Ingredient(
//                                        7,
//                                        "Tomato paste",
//                                        List.of()
//                                )
//                        )
            );

            repository.saveAll(
                    List.of(quattroFormaggiPizza)
            );
        };
    }
}
