package com.example.ReciPage.Repository;

import org.springframework.stereotype.Repository;

import com.example.ReciPage.Model.Recipe;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    
}
