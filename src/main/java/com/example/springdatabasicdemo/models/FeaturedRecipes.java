package com.example.springdatabasicdemo.models;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "FeaturedRecipes")
public class FeaturedRecipes extends BaseEntity {
    @OneToMany(mappedBy="featuredRecipes")
    private List<Recipe> recipes;
    public List<Recipe> getRecipes() {
        return recipes;
    }
    @OneToMany(mappedBy="featuredRecipes")
    private List<User> users;
    public List<User> getUsers() {
        return users;
    }
}
