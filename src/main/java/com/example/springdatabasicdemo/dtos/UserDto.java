package com.example.springdatabasicdemo.dtos;


public class UserDto {

    private String login;

    private String password;

    private String gender;

    private String imageUrl;

    private int height;

    private int weight;

    private int age;

    private int caloriesLimit;

    private Long featuredRecipeId;

    private Long recipeId;

    private Long featuredDietId;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCaloriesLimit() {
        return caloriesLimit;
    }

    public void setCaloriesLimit(int caloriesLimit) {
        this.caloriesLimit = caloriesLimit;
    }

    public Long getFeaturedRecipeId() {
        return featuredRecipeId;
    }

    public void setFeaturedRecipeId(Long featuredRecipeId) {
        this.featuredRecipeId = featuredRecipeId;
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public Long getFeaturedDietId() {
        return featuredDietId;
    }

    public void setFeaturedDietId(Long featuredDietId) {
        this.featuredDietId = featuredDietId;
    }

    // ... getters/setters для идентификаторов связанных объектов

}