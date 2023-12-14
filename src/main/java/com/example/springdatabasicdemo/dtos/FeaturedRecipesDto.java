package com.example.springdatabasicdemo.dtos;
import java.util.List;

public class FeaturedRecipesDto {

    private List<Long> recipeIds;

    private List<Long> userIds;

    public List<Long> getRecipeIds() {
        return recipeIds;
    }

    public void setRecipeIds(List<Long> recipeIds) {
        this.recipeIds = recipeIds;
    }

    public List<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }
}
