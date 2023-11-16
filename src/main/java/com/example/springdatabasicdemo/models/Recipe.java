package com.example.springdatabasicdemo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Recipe")
public class Recipe extends BaseEntity {

    private String imageURL, title, description, processOfCooking;
    private int difficult, totalCalories;
    @OneToMany(mappedBy="recipe")
    private List<User> users;
    @ManyToOne
    @JoinColumn(name="featured_recipes_id")
    private FeaturedRecipes featuredRecipes;
    public List<User> getUsers() {
        return users;
    }
    @ManyToOne
    @JoinColumn(name="product_recipe_list_id")
    private ProductRecipeList productRecipeList;
    @ManyToOne
    @JoinColumn(name="tag_list_id")
    private TagList tagList;

    @Column(name = "imageURL", length = 50, nullable = false)
    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Column(name = "title", length = 50, nullable = false)
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description", length = 50, nullable = false)
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "processOfCooking", length = 50, nullable = false)
    public String getProcessOfCooking() {
        return processOfCooking;
    }
    public void setProcessOfCooking(String processOfCooking) {
        this.processOfCooking = processOfCooking;
    }

    @Column(name = "difficult", length = 50, nullable = false)
    public int getDifficult() {
        return difficult;
    }
    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }

    @Column(name = "totalCalories", length = 50, nullable = false)
    public int getTotalCalories() {
        return totalCalories;
    }
    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }
}
