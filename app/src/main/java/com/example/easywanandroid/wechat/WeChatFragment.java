package com.example.easywanandroid.wechat;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easywanandroid.R;
import com.example.easywanandroid.adapter.WeChatJsonResultListAdapter;

public class WeChatFragment extends Fragment {
    private static final String TAG = "WeChatFragment";
    private RecyclerView mResultList;
    private WeChatJsonResultListAdapter mAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_wechat,container,false);

//        Retrofit retrofit = new Retrofit.Builder()
////                .baseUrl("https://www.wanandroid.com")
////                .build();
////        WeChat weChat = retrofit.create(WeChat.class);
////        Call<ResponseBody> task = weChat.getJson();
////        task.enqueue(new Callback<ResponseBody>() {
////
////
////            @Override
////            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
////                Log.d(TAG,"onResponse  -- >"  + response.code());
////                if(response.code() == HttpURLConnection.HTTP_OK){
////
////                    try {
////                        if (response.body() != null) {
////                            String result = response.body().string();
////                            Gson gson = new Gson();
////                            JsonResult jsonResult = gson.fromJson(result, JsonResult.class);//把字符串转化成对象
////                            updateList(jsonResult);
////                        }
//////                        Log.d(TAG,"json -- >" + response.body().string());
////                    } catch (IOException e) {
////                        e.printStackTrace();
////                    }
////                }
////            }
////
////            @Override
////            public void onFailure(Call<ResponseBody> call, Throwable t) {
////                Log.d(TAG,"onFailure  -- >"  + t.toString());
////            }
////        });
        Log.d(TAG,"getContext()-->" + requireActivity());
        mResultList = view.findViewById(R.id.result_list);
        mResultList.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mResultList.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.top=5;
                outRect.bottom=5;
            }
        });
        mAdapter = new WeChatJsonResultListAdapter();
        mResultList.setAdapter(mAdapter);//数据回来
        mAdapter.setOnItemClick(new WeChatJsonResultListAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(View v, int position) {
                Intent intent = new Intent(getActivity(), WeChatActivity.class);
                startActivity(intent);
            }
        });
//        Log.d(TAG,"getActivity -- >" + getActivity());
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG,"getActivity -- >" + getActivity());

    }

   public void updateList(WeChatJsonResult weChatJsonResult) {
        mAdapter.setData(weChatJsonResult);
    }


}

