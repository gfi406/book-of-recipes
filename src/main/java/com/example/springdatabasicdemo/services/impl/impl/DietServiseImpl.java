package com.example.springdatabasicdemo.services.impl.impl;

import com.example.springdatabasicdemo.dtos.DietDto;
import com.example.springdatabasicdemo.models.Diet;
import com.example.springdatabasicdemo.repositories.DietRepositories;
import com.example.springdatabasicdemo.services.impl.DietServise;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DietServiseImpl implements DietServise {

    private final ModelMapper modelMapper;
    private final DietRepositories dietRepositories;

    @Autowired
    public DietServiseImpl (ModelMapper modelMapper,DietRepositories dietRepositories){
        this.modelMapper = modelMapper;
        this.dietRepositories = dietRepositories;
    }
    @Override
    public DietDto createDiet(DietDto dietDTO) {
        Diet diet = modelMapper.map(dietDTO, Diet.class);
        Diet savedDiet = dietRepositories.save(diet);
        return modelMapper.map(savedDiet, DietDto.class);
    }

    @Override
    public DietDto getDietById(Long id) {
        Optional<Diet> optionalDiet = dietRepositories.findById(id);
        return optionalDiet.map(diet -> modelMapper.map(diet, DietDto.class)).orElse(null);
    }

    @Override
    public List<DietDto> getAllDiets() {
        List<Diet> diets = dietRepositories.findAll();
        return diets.stream()
                .map(diet -> modelMapper.map(diet, DietDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public DietDto updateDiet(Long id, DietDto dietDTO) {
        Optional<Diet> optionalExistingDiet = dietRepositories.findById(id);
        if (optionalExistingDiet.isPresent()) {
            Diet existingDiet = optionalExistingDiet.get();
            modelMapper.map(dietDTO, existingDiet); // Обновляем существующий объект
            Diet updatedDiet = dietRepositories.save(existingDiet);
            return modelMapper.map(updatedDiet, DietDto.class);
        }
        return null;
    }

    @Override
    public boolean deleteDiet(Long id) {
        Optional<Diet> optionalDiet =  dietRepositories.findById(id);
        if (optionalDiet.isPresent()) {
            dietRepositories.delete(optionalDiet.get());
            return true;
        }
        return false;
    }
}
