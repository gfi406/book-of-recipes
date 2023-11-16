package com.example.springdatabasicdemo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tag")
public class Tag extends BaseEntity{
    private String description , title, constraints;
    @ManyToOne
    @JoinColumn(name="tag_list_id")
    private TagList tagList;
    public TagList getTagList() {
        return tagList;
    }
    public void setTagList(TagList tagList) {
        this.tagList = tagList;
    }

    @Column(name = "description", length = 50, nullable = false)
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "title", length = 50, nullable = false)
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "constraints", length = 50, nullable = false)
    public String getConstraints() {
        return constraints;
    }
    public void setConstraints(String constraints) {
        this.constraints = constraints;
    }
}
