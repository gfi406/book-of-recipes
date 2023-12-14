package com.example.springdatabasicdemo.services.impl;

import com.example.springdatabasicdemo.dtos.DietDto;

import java.util.List;

public interface DietServise {

    DietDto createDiet(DietDto dietDTO);

    DietDto getDietById(Long id);

    List<DietDto> getAllDiets();

    DietDto updateDiet(Long id, DietDto dietDTO);

    boolean deleteDiet(Long id);
}
