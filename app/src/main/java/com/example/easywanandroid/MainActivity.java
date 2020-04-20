package com.example.easywanandroid;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.easywanandroid.home.HomeJsonResult;
import com.example.easywanandroid.projects.ProjectsFragment;
import com.example.easywanandroid.projects.ProjectsJsonResult;
import com.example.easywanandroid.wechat.WeChatJsonResult;
import com.example.easywanandroid.home.HomeFragment;
import com.example.easywanandroid.utils.RetrofitManager;
import com.example.easywanandroid.wechat.WeChatFragment;

import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private WeChatFragment weChatFragment;
    private HomeFragment homeFragment;
    private ProjectsFragment projectsFragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_home = findViewById(R.id.btn_home);
        Button btn_navigation = findViewById(R.id.btn_projects);
        Button btn_wechat = findViewById(R.id.btn_wechat);
        fragmentManager = getSupportFragmentManager();
        homeFragment = new HomeFragment();
        fragmentManager.beginTransaction().add(R.id.fl_main, homeFragment).commitAllowingStateLoss();
        btn_home.setOnClickListener(this);
        btn_navigation.setOnClickListener(this);
        btn_wechat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_home:
                if (homeFragment == null) {
                    homeFragment = new HomeFragment();
                    fragmentManager.beginTransaction().replace(R.id.fl_main, homeFragment).commitAllowingStateLoss();
                    API api1 = RetrofitManager.getRetrofit().create(API.class);
                    Call<HomeJsonResult> task1 = api1.getHomeJson();
                    task1.enqueue(new Callback<HomeJsonResult>() {
                        @Override
                        public void onResponse(Call<HomeJsonResult> call, Response<HomeJsonResult> response) {
                            Log.d(TAG,"onResponse  -- >"  + response.code());
                            if(response.code() == HttpURLConnection.HTTP_OK){
                                HomeJsonResult homeJsonResult = response.body();
                                homeFragment.updateList(homeJsonResult);
                            }
                        }

                        @Override
                        public void onFailure(Call<HomeJsonResult> call, Throwable t) {

                        }
                    });

                } else
                    fragmentManager.beginTransaction().replace(R.id.fl_main, homeFragment).commitAllowingStateLoss();
                break;
            case R.id.btn_projects:
                if (projectsFragment == null) {
                    projectsFragment = new ProjectsFragment();
                    fragmentManager.beginTransaction().replace(R.id.fl_main, projectsFragment).commitAllowingStateLoss();
                    API api2 = RetrofitManager.getRetrofit().create(API.class);
                    Call<ProjectsJsonResult> task2 = api2.getProjectsJson();
                    task2.enqueue(new Callback<ProjectsJsonResult>() {
                        @Override
                        public void onResponse(Call<ProjectsJsonResult> call, Response<ProjectsJsonResult> response) {
                            Log.d(TAG,"onResponse  -- >"  + response.code());
                            if(response.code() == HttpURLConnection.HTTP_OK){
                                ProjectsJsonResult projectsJsonResult = response.body();
                                projectsFragment.updateList(projectsJsonResult);
                            }
                        }

                        @Override
                        public void onFailure(Call<ProjectsJsonResult> call, Throwable t) {

                        }
                    });
                } else
                    fragmentManager.beginTransaction().replace(R.id.fl_main, projectsFragment).commitAllowingStateLoss();
                break;
            case R.id.btn_wechat:
                if (weChatFragment == null) {
                    weChatFragment = new WeChatFragment();
                    fragmentManager.beginTransaction().replace(R.id.fl_main, weChatFragment).commitAllowingStateLoss();
                    API api3 = RetrofitManager.getRetrofit().create(API.class);
                    Call<WeChatJsonResult> task3 = api3.getWeChatJson();
                    task3.enqueue(new Callback<WeChatJsonResult>() {
                        @Override
                        public void onResponse(Call<WeChatJsonResult> call, Response<WeChatJsonResult> response) {
                            Log.d(TAG,"onResponse  -- >"  + response.code());
                            if(response.code() == HttpURLConnection.HTTP_OK){

                                try {
                                    if (response.body() != null) {
                                        WeChatJsonResult result = response.body();
//                                        Gson gson = new Gson();3edy
//                                        JsonResult jsonResult = gson.fromJson(result, JsonResult.class);//把字符串转化成对象
                                        weChatFragment.updateList(result);
                                    }
                                    assert response.body() != null;
                                    Log.d(TAG,"json -- >" + response.body().toString());
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }

                        @Override
                        public void onFailure(Call<WeChatJsonResult> call, Throwable t) {
                            Log.d(TAG,"onFailure  -- >"  + t.toString());
                        }
                    });

                } else
                    fragmentManager.beginTransaction().replace(R.id.fl_main, weChatFragment).commitAllowingStateLoss();
                break;
        }
    }




}
