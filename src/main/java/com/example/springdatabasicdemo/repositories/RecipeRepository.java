package com.example.springdatabasicdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatabasicdemo.models.Recipe;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}