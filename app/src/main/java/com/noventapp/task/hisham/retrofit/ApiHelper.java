package com.noventapp.task.hisham.retrofit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hisham Snaimeh on 4/18/2018.
 * hish.sn.dev@gmail.com
 */

public class ApiHelper {
    private static String mainURL = "http://162.144.158.192:8080/drhealth-1.1/drhealth/api/v1/";
    private static OkHttpClient client;

    public static Retrofit getClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        return new Retrofit.Builder()
                .baseUrl(mainURL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

}
