package com.skeleton.modal;

import com.google.gson.annotations.SerializedName;

public class UserImages {
    @SerializedName("_id")
    private String _id;
    @SerializedName("thumbnail")
    private String thumbnail;
    @SerializedName("original")
    private String original;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }
}
