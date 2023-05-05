package com.restaurant_manager.repository;

import com.restaurant_manager.entity.allergen.Allergen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllergenRepository extends JpaRepository<Allergen, Integer> {
}
