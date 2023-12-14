package com.example.springdatabasicdemo.services.impl.impl;

import com.example.springdatabasicdemo.dtos.RecipeDto;
import com.example.springdatabasicdemo.models.Recipe;
import com.example.springdatabasicdemo.repositories.RecipieRepositories;
import com.example.springdatabasicdemo.services.impl.RecipieServise;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RecipieServiseImpl implements RecipieServise {
    private final ModelMapper modelMapper;
    private final RecipieRepositories recipieRepository;

    @Autowired
    public RecipieServiseImpl(ModelMapper modelMapper, RecipieRepositories recipieRepository) {
        this.modelMapper = modelMapper;
        this.recipieRepository = recipieRepository;
    }

    @Override
    public RecipeDto createRecipie(RecipeDto recipeDto) {
        Recipe recipie = modelMapper.map(recipeDto, Recipe.class);
        Recipe savedRecipie = recipieRepository.save(recipie);
        return modelMapper.map(savedRecipie, RecipeDto.class);
    }

    @Override
    public RecipeDto getRecipieById(Long id) {
        Optional<Recipe> optionalRecipie = recipieRepository.findById(id);
        return optionalRecipie.map(recipie -> modelMapper.map(recipie, RecipeDto.class)).orElse(null);
    }

    @Override
    public List<RecipeDto> getAllRecipies() {
        List<Recipe> recipies = recipieRepository.findAll();
        return recipies.stream()
                .map(recipie -> modelMapper.map(recipie, RecipeDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public RecipeDto updateRecipie(Long id, RecipeDto recipeDto) {
        Optional<Recipe> optionalExistingRecipie = recipieRepository.findById(id);
        if (optionalExistingRecipie.isPresent()) {
            Recipe existingRecipie = optionalExistingRecipie.get();
            modelMapper.map(recipeDto, existingRecipie); // Обновляем существующий объект
            Recipe updatedRecipie = recipieRepository.save(existingRecipie);
            return modelMapper.map(updatedRecipie, RecipeDto.class);
        }
        return null;
    }

    @Override
    public boolean deleteRecipie(Long id) {
        Optional<Recipe> optionalRecipie = recipieRepository.findById(id);
        if (optionalRecipie.isPresent()) {
            recipieRepository.delete(optionalRecipie.get());
            return true;
        }
        return false;
    }
}
