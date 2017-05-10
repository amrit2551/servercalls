package com.skeleton.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by admin23 on 9/5/17.
 */

public class PostData {

    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("body")
    @Expose
    private String body;

    /**
     *
     * @return userid
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *
     * @param userId userid
     */
    public void setUserId(final Integer userId) {
        this.userId = userId;
    }

    /**
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id id
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     *
     * @return getTitle
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title title
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     *
     * @return getbody
     */
    public String getBody() {
        return body;
    }

    /**
     *
     * @param body body
     */
    public void setBody(final String body) {
        this.body = body;
    }

}

