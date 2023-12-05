package com.example.springdatabasicdemo.dtos;

import java.util.List;

public class ProductRecipeListDto {

    private int grams;

    private List<Long> productIds;

    private List<Long> recipeIds;

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }

    public List<Long> getRecipeIds() {
        return recipeIds;
    }

    public void setRecipeIds(List<Long> recipeIds) {
        this.recipeIds = recipeIds;
    }
}