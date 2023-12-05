package com.example.springdatabasicdemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;
@Entity
@Table(name = "dietRecipieList")
public class DietRecipieList extends BaseEntity
{
    @OneToMany(mappedBy="dietRecipieList")
    private List<Recipe> recipes;
    public List<Recipe> getRecipes() {
        return recipes;
    }

    @OneToMany(mappedBy="dietRecipieList")
    private List<Diet> diets;
    public List<Diet> getDiets() {
        return diets;
    }
}
