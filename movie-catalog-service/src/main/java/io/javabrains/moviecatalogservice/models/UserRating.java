package io.javabrains.moviecatalogservice.models;

import java.util.List;

public class UserRating {

    private List<Rating> userRating;
    private String userId;

    public UserRating() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Rating> getUserRating() {
        return this.userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }
}
