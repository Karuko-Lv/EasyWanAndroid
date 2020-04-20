package com.example.easywanandroid;

import com.example.easywanandroid.home.HomeJsonResult;
import com.example.easywanandroid.projects.ProjectsJsonResult;
import com.example.easywanandroid.wechat.WeChatGetWithParamsResult;
import com.example.easywanandroid.wechat.WeChatJsonResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {
    @GET("/wxarticle/chapters/json")
    Call<WeChatJsonResult> getWeChatJson();

    @GET("banner/json")
    Call<HomeJsonResult> getHomeJson();

    @GET("project/list/1/json?cid=294")
    Call<ProjectsJsonResult> getProjectsJson();

    @GET("/wxarticle/list/408/1/json")
    Call<WeChatGetWithParamsResult> getWithParams(@Query("niceDate") String niceDate,
                                                  @Query("author") String author,
                                                  @Query("title") String title);
}
