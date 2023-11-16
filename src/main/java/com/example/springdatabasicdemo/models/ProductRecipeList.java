package com.example.springdatabasicdemo.models;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ProductRecipeList")
public class ProductRecipeList extends BaseEntity {

    private  int grams;
    @OneToMany(mappedBy="productRecipeList")
    private List<Product> products;
    public List<Product> getProducts() {
        return products;
    }
    @OneToMany(mappedBy="productRecipeList")
    private List<Recipe> recipes;



    public List<Recipe> getRecipes() {
        return recipes;
    }

    @Column(name = "grams", length = 50, nullable = false)
    public int getGrams() {
        return grams;
    }
    public void setGrams(int grams) {
        this.grams = grams;
    }
}
