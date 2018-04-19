package com.noventapp.task.hisham.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiInterface= ApiHelper.getClient().create(ApiInterface.class);

        Call<Object> call=apiInterface.getlocation("Basic VVNFUjokRHJIZWFsdGgjVjE=");
        call.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                Object data=response.body();
                System.out.println(response.body());

            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {

            }
        });
    }
}
