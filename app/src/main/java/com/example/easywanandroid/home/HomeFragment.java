package com.example.easywanandroid.home;


import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.example.easywanandroid.R;
import com.example.easywanandroid.adapter.HomeJsonResultListAdapter;
import com.example.easywanandroid.adapter.ProjectsJsonResultListAdapter;
import com.example.easywanandroid.wechat.WeChatJsonResult;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HomeFragment extends Fragment {

    private RecyclerView mResultListHome;
    private HomeJsonResultListAdapter mAdapter;
    private ViewPager mViewPager;


    private List<HomeJsonResult.DataBean> data = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        mResultListHome = view.findViewById(R.id.result_list_home);
        mResultListHome.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mResultListHome.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.top=5;
                outRect.bottom=5;
            }
        });
        mAdapter = new HomeJsonResultListAdapter();
        mResultListHome.setAdapter(mAdapter);//数据回来

        mViewPager = view.findViewById(R.id.view_pager);
        mViewPager.setAdapter(mPagerAdapter);
        return view;
    }

    private PagerAdapter mPagerAdapter = new PagerAdapter() {//内部类
        @Override
        public int getCount() {
            return data.size();
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            View item = LayoutInflater.from(container.getContext()).inflate(R.layout.item_pager, container, false);
            ImageView iv = item.findViewById(R.id.cover);
            //设置数据
            Glide.with(iv.getContext()).load(data.get(position).getImagePath()).into(iv);
            if(iv.getParent() instanceof ViewGroup){
                ((ViewGroup)iv.getParent()).removeView(iv);
            }
            return iv;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            super.destroyItem(container, position, object);
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }
    };

    public void updateList(HomeJsonResult homeJsonResult) {
        mAdapter.setData(homeJsonResult);
    }


}
