package com.example.springdatabasicdemo.dtos;


import java.util.List;

public class RecipeDto {

    private String imageUrl;

    private String title;

    private String description;

    private String processOfCooking;

    private int difficult;

    private int totalCalories;

    private List<Long> userIds;

    private Long featuredRecipeId;

    private Long productRecipeListId;

    private Long tagListId;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProcessOfCooking() {
        return processOfCooking;
    }

    public void setProcessOfCooking(String processOfCooking) {
        this.processOfCooking = processOfCooking;
    }

    public int getDifficult() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }

    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }

    public List<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }

    public Long getFeaturedRecipeId() {
        return featuredRecipeId;
    }

    public void setFeaturedRecipeId(Long featuredRecipeId) {
        this.featuredRecipeId = featuredRecipeId;
    }

    public Long getProductRecipeListId() {
        return productRecipeListId;
    }

    public void setProductRecipeListId(Long productRecipeListId) {
        this.productRecipeListId = productRecipeListId;
    }

    public Long getTagListId() {
        return tagListId;
    }

    public void setTagListId(Long tagListId) {
        this.tagListId = tagListId;
    }
}
