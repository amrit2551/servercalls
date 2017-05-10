package com.skeleton.modal;

import com.google.gson.annotations.SerializedName;

/**
 * Data modal class
 */
public class Data {
    @SerializedName("accessToken")
    private String accessToken;
    @SerializedName("userDetails")
    private UserDetails userDetails;

    /**
     *
     * @return user access token
     */

    public String getAccessToken() {
        return accessToken;
    }

    /**
     *
     * @param accessToken set user access token
     */

    public void setAccessToken(final String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     *
     * @return user profile info
     */

    public UserDetails getUserDetails() {
        return userDetails;
    }

    /**
     *
     * @param userDetails user profile info
     */

    public void setUserDetails(final UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
