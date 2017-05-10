package com.skeleton.modal;

import com.google.gson.annotations.SerializedName;

/**
 * classuser images
 */
public class UserImages {
    @SerializedName("id")
    private String id;
    @SerializedName("thumbnail")
    private String thumbnail;
    @SerializedName("original")
    private String original;

    /**
     *
     * @return id from server
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id sets id
     */

    public void setId(final String id) {
        this.id = id;
    }
    /**
     *
     * @return get thumbnail of user image
     */

    public String getThumbnail() {
        return thumbnail;
    }

    /**
     *
     * @param thumbnail set thumbnail
     */

    public void setThumbnail(final String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     *
     * @return get org image of user
     */

    public String getOriginal() {
        return original;
    }

    /**
     *
     * @param original org image of user
     */

    public void setOriginal(final String original) {
        this.original = original;
    }
}
