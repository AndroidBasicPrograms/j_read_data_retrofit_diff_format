package com.example.appsb.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by appsb on 05-07-2018.
 */

public class apiClient {
    static Retrofit r=null;
    public static Retrofit getClient() {
        if(r==null)
        {
            r=new Retrofit.Builder().baseUrl("base_url").addConverterFactory(GsonConverterFactory.create()).build();
        }
        return r;
    }
}
