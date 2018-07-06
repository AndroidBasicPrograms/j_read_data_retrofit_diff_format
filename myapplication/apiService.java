package com.example.appsb.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by appsb on 05-07-2018.
 */

public interface apiService {

    @GET("restaurantlist.php?timezone=Asia/Calcutta&lat=40.728&lon=-73.984434099&search=&noofrecords=30&pageno=1&radius=100000000&category=11")
    Call<List<rResponse>> getData();
}
