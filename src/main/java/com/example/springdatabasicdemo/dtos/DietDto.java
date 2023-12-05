package com.example.springdatabasicdemo.dtos;


public class DietDto {

    private String imageUrl;

    private String title;

    private String description;

    private int totalCalories;

    private Long featuredDietId;

    private Long tagListId;

    public String getImadeUrl() {
        return imageUrl;
    }

    public void setImadeUrl(String imadeUrl) {
        this.imageUrl = imadeUrl;
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

    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }

    public Long getFeaturedDietId() {
        return featuredDietId;
    }

    public void setFeaturedDietId(Long featuredDietId) {
        this.featuredDietId = featuredDietId;
    }

    public Long getTagListId() {
        return tagListId;
    }

    public void setTagListId(Long tagListId) {
        this.tagListId = tagListId;
    }
}
