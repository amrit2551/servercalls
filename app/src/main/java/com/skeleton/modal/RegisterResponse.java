package com.skeleton.modal;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin23 on 10/5/17.
 */

public class RegisterResponse {
    @SerializedName("statusCode")
    private int statusCode;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private Data data;

    /**
     *
     * @return status code(int) value
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     *
     * @param statusCode sets status code
     */
    public void setStatusCode(final int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     *
     * @return gets message from server
     */


    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message sets message
     */

    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     *
     * @return data from server
     */

    public Data getData() {
        return data;
    }

    /**
     *
     * @param data set data from server
     */

    public void setData(final Data data) {
        this.data = data;
    }
}
