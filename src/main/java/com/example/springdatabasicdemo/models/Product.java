package com.example.springdatabasicdemo.models;
import jakarta.persistence.*;
@Entity
@Table(name = "Product")
public class Product extends BaseEntity{
    private String imageURL, name, type, description,typeOfCooking, calories;
    @ManyToOne
    @JoinColumn(name="product_recipe_list_id")
    private ProductRecipeList productRecipeList;

    @Column(name = "imageURL", length = 50, nullable = false)
    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Column(name = "name", length = 50, nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "type", length = 50, nullable = false)
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "description", length = 50, nullable = false)
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "typeOfCooking", length = 50, nullable = false)
    public String getTypeOfCooking() {
        return typeOfCooking;
    }
    public void setTypeOfCooking(String typeOfCooking) {
        this.typeOfCooking = typeOfCooking;
    }

    @Column(name = "calories", length = 50, nullable = false)
    public String getCalories() {
        return calories;
    }
    public void setCalories(String calories) {
        this.calories = calories;
    }
}
