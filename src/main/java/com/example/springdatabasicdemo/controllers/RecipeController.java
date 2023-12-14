package com.example.springdatabasicdemo.controllers;

import com.example.springdatabasicdemo.dtos.RecipeDto;
import com.example.springdatabasicdemo.models.Recipe;
import com.example.springdatabasicdemo.services.impl.RecipieServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipieServise recipeService;

    @Autowired
    public RecipeController(RecipieServise recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public List<RecipeDto> getAllRecipes() {
        return recipeService.getAllRecipies();
    }

    @GetMapping("/{id}")
    public RecipeDto getRecipeById(@PathVariable Long id) {
        return recipeService.getRecipieById(id);
    }

    @PostMapping
    public RecipeDto createRecipe(@RequestBody RecipeDto recipe) {
        return recipeService.createRecipie(recipe);
    }

    @PutMapping("/{id}")
    public RecipeDto updateRecipe(@PathVariable Long id, @RequestBody RecipeDto recipeDetails) {
        return recipeService.updateRecipie(id, recipeDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id) {
        recipeService.deleteRecipie(id);
    }
}
