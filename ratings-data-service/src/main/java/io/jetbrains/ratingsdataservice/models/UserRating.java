package io.jetbrains.ratingsdataservice.models;

import java.util.Arrays;
import java.util.List;

public class UserRating {

    private List<Rating> userRating;
    private String userId;

    public UserRating(List<Rating> userRating, String userId) {
        this.userRating = userRating;
        this.userId = userId;
    }

    public UserRating() {
    }

    public List<Rating> getUserRating() {
        return this.userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void initData(String userId) {
        this.setUserId(userId);
        this.setUserRating(Arrays.asList(
                new Rating("100", 3),
                new Rating("200", 4)
        ));
    }
}
