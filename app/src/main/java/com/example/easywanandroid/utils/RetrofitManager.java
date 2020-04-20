package com.example.easywanandroid.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {

    private static Retrofit sRetrofit = new Retrofit.Builder()
            .baseUrl("https://www.wanandroid.com")
            .addConverterFactory(GsonConverterFactory.create())//直接转化成bean类
            .build();

    public static Retrofit getRetrofit(){
        return sRetrofit;
    }
}
