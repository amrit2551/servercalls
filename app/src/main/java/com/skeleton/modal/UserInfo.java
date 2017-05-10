package com.skeleton.modal;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin23 on 5/5/17.
 */

public class UserInfo implements Parcelable {
    public static final Creator<UserInfo> CREATOR = new Creator<UserInfo>() {
        @Override
        /**
         * in
         */
        public UserInfo createFromParcel(final Parcel in) {
            return new UserInfo(in);
        }

        @Override
        public UserInfo[] newArray(final int size) {
            return new UserInfo[size];
        }
    };
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("username")
    private String username;
    @SerializedName("email")
    private String email;
    @SerializedName("address")
    private Address address;
    @SerializedName("phone")
    private String phone;
    @SerializedName("website")
    private String website;
    @SerializedName("company")
    private Company company;

    /**
     *
     * @param in parcel
     */
    protected UserInfo(final Parcel in) {
        id = in.readInt();
        name = in.readString();
        username = in.readString();
        email = in.readString();
        phone = in.readString();
        website = in.readString();
    }

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id integer
     */

    public void setId(final int id) {
        this.id = id;
    }

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
     * @return string
     */

    public String getUsername() {
        return username;
    }

    /**
     * @param username string
     */

    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * @return string
     */

    public String getEmail() {
        return email;
    }

    /**
     * @param email string
     */


    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * @return email string
     */

    public Address getAddress() {
        return address;
    }

    /**
     * @param address address
     */

    public void setAddress(final Address address) {
        this.address = address;
    }

    /**
     * @return address address
     */

    public String getPhone() {
        return phone;
    }

    /**
     * @param phone string
     */

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    /**
     * @return string ph
     */

    public String getWebsite() {
        return website;
    }

    /**
     * @param website string
     */

    public void setWebsite(final String website) {
        this.website = website;
    }

    /**
     * @return website
     */

    public Company getCompany() {
        return company;
    }

    /**
     * @param company company
     */

    public void setCompany(final Company company) {
        this.company = company;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeString(name);
        dest.writeString(username);
        dest.writeString(email);
        dest.writeString(phone);
        dest.writeString(website);

    }
}
