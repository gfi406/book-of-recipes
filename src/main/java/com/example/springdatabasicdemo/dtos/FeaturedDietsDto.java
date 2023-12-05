package com.example.springdatabasicdemo.dtos;

import java.util.List;

public class FeaturedDietsDto {

    private List<Long> userIds;

    private List<Long> dietIds;

    public List<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }

    public List<Long> getDietIds() {
        return dietIds;
    }

    public void setDietIds(List<Long> dietIds) {
        this.dietIds = dietIds;
    }
}
