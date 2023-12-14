package com.example.springdatabasicdemo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Diets")
public class Diet extends BaseEntity
{
    private String imageUrl, title, description;
    private int tottalCalories;
    @ManyToOne
    @JoinColumn(name="featured_diet_id")
    private FeaturedDiets featuredDiet;
    @ManyToOne
    @JoinColumn(name="tag_list_id")
    private TagList tagList;
    @ManyToOne
    @JoinColumn(name="diet_reicipie_list_id")
    private DietRecipieList dietRecipieList;

    public FeaturedDiets getFeaturedDiet() {
        return featuredDiet;
    }

    public void setFeaturedDiet(FeaturedDiets featuredDiet) {
        this.featuredDiet = featuredDiet;
    }

    public FeaturedDiets getFeaturedDiets() {
        return featuredDiet;
    }
    public void setFeaturedDiets(FeaturedDiets featuredDiets) {
        this.featuredDiet = featuredDiets;
    }

    @Column(name = "imadeUrl", length = 50, nullable = false)

    public String getImadeUrl() {
        return imageUrl;
    }
    public void setImadeUrl(String imadeUrl) {
        this.imageUrl = imadeUrl;
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

    @Column(name = "tottalCalories", length = 50, nullable = false)
    public int getTottalCalories() {
        return tottalCalories;
    }
    public void setTottalCalories(int tottalCalories) {
        this.tottalCalories = tottalCalories;
    }
}
