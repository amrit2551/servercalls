package com.skeleton.modal;

import com.google.gson.annotations.SerializedName;

/**
 * data
 */
public class Company {
    @SerializedName("name")
    private String name;
    @SerializedName("catchPhrase")
    private String catchPhrase;
    @SerializedName("bs")
    private String bs;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name string
     */

    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return string catchphrase
     */

    public String getCatchPhrase() {
        return catchPhrase;
    }

    /**
     * @param catchPhrase string
     */

    public void setCatchPhrase(final String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    /**
     * @return string bs
     */

    public String getBs() {
        return bs;
    }

    /**
     * @param bs string
     */

    public void setBs(final String bs) {
        this.bs = bs;
    }

}
