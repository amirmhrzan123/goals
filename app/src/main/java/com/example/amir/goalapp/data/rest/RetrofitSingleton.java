package com.example.amir.goalapp.data.rest;


import com.example.amir.goalapp.helpers.UrlContract;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


// Created by ebpearls on 7/4/2016.

public class RetrofitSingleton {
    private static RetrofitSingleton retrofitSingleton = null;
    private static Retrofit retrofit = null;
    private static NetworkService apiService = null;

    private RetrofitSingleton() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .readTimeout(5, TimeUnit.MINUTES)
                .connectTimeout(5,TimeUnit.MINUTES)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(UrlContract.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(NetworkService.class);
    }

    public static NetworkService getApiService() {
        if (retrofitSingleton == null) {
            retrofitSingleton = new RetrofitSingleton();
        }
        return apiService;
    }

    public static Retrofit getRetrofit() {
        if (retrofitSingleton == null) {
            retrofitSingleton = new RetrofitSingleton();
        }
        return retrofit;
    }
}
