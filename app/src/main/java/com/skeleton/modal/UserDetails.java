package com.skeleton.modal;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * user detail
 */
public class UserDetails {
    @SerializedName("_id")
    private String _id;
    @SerializedName("createdAt")
    private String createdAt;
    @SerializedName("updatedAt")
    private String updatedAt;
    @SerializedName("dob")
    private String dob;
    @SerializedName("countryCode")
    private String countryCode;
    @SerializedName("phoneNo")
    private String phoneNo;
    @SerializedName("email")
    private String email;
    @SerializedName("orientation")
    private String orientation;
    @SerializedName("newNumber")
    private String newNumber;
    @SerializedName("userImages")
    /**
     *
     */
    private List<UserImages> userImages;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(String newNumber) {
        this.newNumber = newNumber;
    }

    public List<UserImages> getUserImages() {
        return userImages;
    }

    public void setUserImages(List<UserImages> userImages) {
        this.userImages = userImages;
    }
}
