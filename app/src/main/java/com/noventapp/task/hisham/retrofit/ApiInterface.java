package com.noventapp.task.hisham.retrofit;


import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by Hisham Snaimeh on 4/18/2018.
 * hish.sn.dev@gmail.com
 */

public interface ApiInterface {

    @POST("customers/login")
    @FormUrlEncoded
    Call<Object> getData(@Header("Content-Type") String s, @Field("identifier") String a,
                         @Field("password") String b,
                         @Field("deviceId") String c);

    @GET("location")
    Call<Object> getlocation(@Header("Authorization") String a);


//    {
//        "identifier":"0797077471",
//            "password":"123456789",
//            "deviceId" : "notification token here"
//    }

}
