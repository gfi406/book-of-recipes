package com.example.springdatabasicdemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "FeaturedDiets")
public class FeaturedDiets extends  BaseEntity {
    @OneToMany(mappedBy="featuredDiets")
    private List<User> users;
    public List<User> getUsers() {
        return users;
    }

    @OneToMany(mappedBy = "featuredDiet")
    private List<Diet> diets;
    public List<Diet> getDiets() {
        return diets;
    }
}
