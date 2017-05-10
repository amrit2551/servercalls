package com.skeleton.modal;

import com.google.gson.annotations.SerializedName;

/**
 * data
 */
public class Address {
    @SerializedName("street")
    private String street;
    @SerializedName("suite")
    private String suite;
    @SerializedName("city")
    private String city;
    @SerializedName("zipcode")
    private String zipcode;
    @SerializedName("geo")
    private Geo geo;

    /**
     * @return geo
     */

    public String getStreet() {
        return street;
    }

    /**
     * @param street string
     */

    public void setStreet(final String street) {
        this.street = street;
    }

    /**
     * @return setstreet
     */

    public String getSuite() {
        return suite;
    }

    /**
     * @param suite string
     */

    public void setSuite(final String suite) {
        this.suite = suite;
    }

    /**
     * @return suite
     */

    public String getCity() {
        return city;
    }

    /**
     * @param city string
     */

    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * @return string
     */

    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode string
     */

    public void setZipcode(final String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * @return zipcode
     */

    public Geo getGeo() {
        return geo;
    }

    /**
     * @param geo geo
     */

    public void setGeo(final Geo geo) {
        this.geo = geo;
    }
}
