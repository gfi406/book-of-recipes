package com.example.springdatabasicdemo.models;

import jakarta.persistence.Column;
import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "Taglist")
public class TagList extends BaseEntity{


    @OneToMany(mappedBy="tagList")
    private List<Tag> tags;
    public List<Tag> getTags() {
        return tags;
    }

    @OneToMany(mappedBy="tagList")
    private List<Recipe> recipes;
    public List<Recipe> getRecipes() {
        return recipes;
    }

    @OneToMany(mappedBy="tagList")
    private List<Diet> diets;
    public List<Diet> getDiets() {
        return diets;
    }

}
