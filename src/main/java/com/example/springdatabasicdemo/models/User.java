package com.example.springdatabasicdemo.models;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "user")
public class User extends BaseEntity {

    private String login, password, gender, imadeUrl;
    private int height ,weight,age,caloriesLim;


    public User() {

    }
    @ManyToOne
    @JoinColumn(name="featured_recipes_id")
    private FeaturedRecipes featuredRecipes;
    @ManyToOne
    @JoinColumn(name="recipe_id")
    private Recipe recipe;
    public Recipe getRecipe() {
        return recipe;
    }
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
    @ManyToOne
    @JoinColumn(name="featured_diets_id")
    private FeaturedDiets featuredDiets;
    public FeaturedDiets getFeaturedDiets() {
        return featuredDiets;
    }
    public void setFeaturedDiets(FeaturedDiets featuredDiets) {
        this.featuredDiets = featuredDiets;
    }

    @Column(name = "login", length = 50, nullable = false)
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "password", length = 50, nullable = false)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "gender", length = 50, nullable = false)
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "imadeUrl", length = 50, nullable = false)
    public String getImadeUrl() {
        return imadeUrl;
    }
    public void setImadeUrl(String imadeUrl) {
        this.imadeUrl = imadeUrl;
    }

    @Column(name = "weight", length = 50, nullable = false)
    public int getHeight() {
        return weight;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Column(name = "weight", length = 50, nullable = false)
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Column(name = "age", length = 50, nullable = false)
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "caloriesLim", length = 50, nullable = false)
    public int getCaloriesLim() {
        return caloriesLim;
    }
    public void setCaloriesLim(int caloriesLim) {
        this.caloriesLim = caloriesLim;
    }
}
