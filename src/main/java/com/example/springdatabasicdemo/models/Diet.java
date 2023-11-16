package com.example.springdatabasicdemo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Diets")
public class Diet extends BaseEntity
{
    private String imadeUrl, title, description;
    private int tottalCalories;
    @ManyToOne
    @JoinColumn(name="featured_diet_id")
    private FeaturedDiets featuredDiet;
    @ManyToOne
    @JoinColumn(name="tag_list_id")
    private TagList tagList;
    public FeaturedDiets getFeaturedDiets() {
        return featuredDiet;
    }
    public void setFeaturedDiets(FeaturedDiets featuredDiets) {
        this.featuredDiet = featuredDiets;
    }

    @Column(name = "imadeUrl", length = 50, nullable = false)

    public String getImadeUrl() {
        return imadeUrl;
    }
    public void setImadeUrl(String imadeUrl) {
        this.imadeUrl = imadeUrl;
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
