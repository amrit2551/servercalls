package com.skeleton.retrofit;


import com.skeleton.modal.PostData;
import com.skeleton.modal.UserInfo;

import java.util.HashMap;
import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;
import retrofit2.http.Query;

/**
 * Developer: Saurabh Verma
 * Dated: 27-09-2016.
 */
public interface ApiInterface {
    String UPDATE_LOCATION = "api/v1/user/updateLocation";
    String USER_INFO = "users";
    String POST_HIT = "posts";
    String USERS = "api/users";
    String REGISTER = "api/user/register";
    String LOGIN = "api/user/login";


    //    /**
//     * @param map
//     * @return
//     */

    /**
     *
     * @param map the map
     * @return the call
     */
    @Multipart
    @POST(REGISTER)
    Call<MultipartParams> register(@PartMap HashMap<String, RequestBody> map);
//
/**
 * call for user signup
 *
 */

//    /**
//     * @param map
//     * @return
//     */
//    @FormUrlEncoded
//    @PUT("api/v1/user/socialLogin")
//    Call<LoginResponse> socialLogin(@FieldMap HashMap<String, String> map);
//
//    /**
//     * @param authorization
//     * @param map
//     * @return
//     */
//    @FormUrlEncoded
//    @PUT("api/v1/user/loginToken")
//    Call<LoginResponse> accessTokenLogin(@Header(AUTHORIZATION) String authorization,
//                                         @FieldMap HashMap<String, String> map);
//
//
//    /**
//     * @param email
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("api/v1/user/forgotpassword")
//    Call<CommonResponse> forgotPassword(@Field("email") String email);
//
//    /**
//     * @param map
//     * @return
//     */
//    @FormUrlEncoded
//    @PUT("api/v1/user/loginCredential")
//    Call<LoginResponse> login(@FieldMap HashMap<String, String> map);


    /**
     * Update location call.
     *
     * @param map the map
     * @return the call
     */
    @FormUrlEncoded
    @POST(LOGIN)
    Call<CommonParams> login(@FieldMap HashMap<String, String> map);

    /**
     * @return user
     */
    @GET(USER_INFO)
    Call<List<UserInfo>> getData();

    /**
     * @param userId userid
     * @return integer val
     */
    @GET(POST_HIT)
    Call<List<PostData>> getPosts(@Query("userId") int userId);


}

