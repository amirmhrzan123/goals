package com.example.amir.goalapp.data.rest;

import com.example.amir.goalapp.helpers.UrlContract;
import com.example.amir.goalapp.model.MatchModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Amir on 10/10/2017.
 */

public interface NetworkService {

    @GET(UrlContract.GET_DATA)
    Call<MatchModel> getMatches(@Query("date") String date);
}
