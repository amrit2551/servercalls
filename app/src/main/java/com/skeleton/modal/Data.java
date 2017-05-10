package com.skeleton.modal;

import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("accessToken")
    private String accessToken;
    @SerializedName("userDetails")
    private UserDetails userDetails;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
