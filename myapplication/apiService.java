package com.example.appsb.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by appsb on 05-07-2018.
 */

public interface apiService {

    @GET("pagename and parameters if any")
    Call<List<rResponse>> getData();
}
