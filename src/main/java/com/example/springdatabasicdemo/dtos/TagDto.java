package com.example.springdatabasicdemo.dtos;

public class TagDto {

    private String description;

    private String title;

    private String constraints;

    private Long tagListId;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConstraints() {
        return constraints;
    }

    public void setConstraints(String constraints) {
        this.constraints = constraints;
    }

    public Long getTagListId() {
        return tagListId;
    }

    public void setTagListId(Long tagListId) {
        this.tagListId = tagListId;
    }
}
