package com.example.easywanandroid.wechat;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easywanandroid.API;
import com.example.easywanandroid.R;
import com.example.easywanandroid.adapter.WeChatGetWithParamsResultListAdapter;
import com.example.easywanandroid.utils.RetrofitManager;

import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeChatActivity extends AppCompatActivity {
    private static final String TAG = "WeChatActivity";
    private RecyclerView mResultDetailedList;
    private WeChatGetWithParamsResultListAdapter mAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wechat);
        API api = RetrofitManager.getRetrofit().create(API.class);
        Call<WeChatGetWithParamsResult> task = api.getWithParams("2020-04-13 00:00","鸿洋","App 黑白化实现探索2， 发现了一种更方便的方案，我被锤了！");
        task.enqueue(new Callback<WeChatGetWithParamsResult>() {
            @Override
            public void onResponse(Call<WeChatGetWithParamsResult> call, Response<WeChatGetWithParamsResult> response) {
                Log.d(TAG,"onResponse  -- >"  + response.code());
                if(response.code() == HttpURLConnection.HTTP_OK){

                    try {
                        if (response.body() != null) {
                            WeChatGetWithParamsResult result = response.body();
//                                        Gson gson = new Gson();3edy
//                                        JsonResult jsonResult = gson.fromJson(result, JsonResult.class);//把字符串转化成对象
                            updateList(result);
                        }
                        assert response.body() != null;
                        Log.d(TAG,"json -- >" + response.body().toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<WeChatGetWithParamsResult> call, Throwable t) {

            }
        });
        initView();
//        mResultList = findViewById(R.id.result_detailed_list);
//        mResultList.setLayoutManager(new LinearLayoutManager(this));
//        mResultList.addItemDecoration(new RecyclerView.ItemDecoration() {
//            @Override
//            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
//                super.getItemOffsets(outRect, view, parent, state);
//                outRect.top=5;
//                outRect.bottom=5;
//            }
//        });
//        mAdapter = new WeChatGetWithParamsResultListAdapter();
//        mResultList.setAdapter(mAdapter);//数据回来
    }

    private void initView() {
        mResultDetailedList = findViewById(R.id.result_detailed_list);
        mResultDetailedList.setLayoutManager(new LinearLayoutManager(this));
        mResultDetailedList.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.top=5;
                outRect.bottom=5;
            }
        });
        mAdapter = new WeChatGetWithParamsResultListAdapter();
        mResultDetailedList.setAdapter(mAdapter);//设置适配器-->数据回来-->设置数据
    }

    private void updateList(WeChatGetWithParamsResult result) {
        mAdapter.setDatas(result);
    }
}
