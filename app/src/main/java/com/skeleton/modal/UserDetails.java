package com.skeleton.modal;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * user detail
 */
public class UserDetails {
    @SerializedName("id")
    private String id;
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

    /**
     * @return user id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id set user id
     */

    public void setId(final String id) {
        this.id = id;
    }

    /**
     * @return time of creating user profile
     */

    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt sets time of creating profile by user
     */

    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return last update to profile
     */

    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt sets last update info
     */

    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return gives dob of user
     */

    public String getDob() {
        return dob;
    }

    /**
     * @param dob sets user dob
     */

    public void setDob(final String dob) {
        this.dob = dob;
    }

    /**
     * @return gets country code of user
     */

    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode sets country code of user
     */

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return gives ph no
     */

    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo sets user ph no
     */

    public void setPhoneNo(final String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return user email
     */

    public String getEmail() {
        return email;
    }

    /**
     * @param email sets user email
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * @return orientation of profile
     */

    public String getOrientation() {
        return orientation;
    }

    /**
     * @param orientation sets prof orientation
     */

    public void setOrientation(final String orientation) {
        this.orientation = orientation;
    }

    /**
     * @return user number
     */

    public String getNewNumber() {
        return newNumber;
    }

    /**
     * @param newNumber sets user no
     */

    public void setNewNumber(final String newNumber) {
        this.newNumber = newNumber;
    }

    /**
     * @return user image list
     */

    public List<UserImages> getUserImages() {
        return userImages;
    }

    /**
     * @param userImages lists user images
     */

    public void setUserImages(final List<UserImages> userImages) {
        this.userImages = userImages;
    }
}
