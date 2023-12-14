package com.example.springdatabasicdemo.controllers;

import com.example.springdatabasicdemo.dtos.DietDto;
import com.example.springdatabasicdemo.models.Diet;
import com.example.springdatabasicdemo.services.impl.DietServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diets")
public class DietController {

    private final DietServise dietService;

    @Autowired
    public DietController(DietServise dietService) {
        this.dietService = dietService;
    }

    @GetMapping
    public List<DietDto> getAllDiets() {
        return dietService.getAllDiets();
    }

    @GetMapping("/{id}")
    public DietDto  getDietById(@PathVariable Long id) {
        return dietService.getDietById(id);
    }

    @PostMapping
    public DietDto createDiet(@RequestBody DietDto diet) {
        return dietService.createDiet(diet);
    }

    @PutMapping("/{id}")
    public DietDto updateDiet(@PathVariable Long id, @RequestBody DietDto dietDetails) {
        return dietService.updateDiet(id, dietDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteDiet(@PathVariable Long id) {
        dietService.deleteDiet(id);
    }
}
