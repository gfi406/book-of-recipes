package com.example.springdatabasicdemo.dtos;

import java.util.List;

public class TagListDto {

    private List<Long> tagIds;

    private List<Long> recipeIds;

    private List<Long> dietIds;

    public List<Long> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<Long> tagIds) {
        this.tagIds = tagIds;
    }

    public List<Long> getRecipeIds() {
        return recipeIds;
    }

    public void setRecipeIds(List<Long> recipeIds) {
        this.recipeIds = recipeIds;
    }

    public List<Long> getDietIds() {
        return dietIds;
    }

    public void setDietIds(List<Long> dietIds) {
        this.dietIds = dietIds;
    }
}
