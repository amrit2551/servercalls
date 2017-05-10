package com.skeleton.modal;

import com.google.gson.annotations.SerializedName;

/**
 * data
 */
public class Geo {
    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;

    /**
     * @return string lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * @param lat string
     */

    public void setLat(final String lat) {
        this.lat = lat;
    }

    /**
     * @return lng
     */

    public String getLng() {
        return lng;
    }

    /**
     * @param lng string
     */

    public void setLng(final String lng) {
        this.lng = lng;
    }

}
