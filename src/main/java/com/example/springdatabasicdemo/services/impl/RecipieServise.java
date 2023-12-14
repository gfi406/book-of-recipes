package com.example.springdatabasicdemo.services.impl;

import com.example.springdatabasicdemo.dtos.RecipeDto;

import java.util.List;

public interface RecipieServise {
    RecipeDto createRecipie(RecipeDto recipeDto);

    RecipeDto getRecipieById(Long id);

    List<RecipeDto> getAllRecipies();

    RecipeDto updateRecipie(Long id, RecipeDto recipeDto);

    boolean deleteRecipie(Long id);
}
