package com.example.easywanandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easywanandroid.R;
import com.example.easywanandroid.home.HomeJsonResult;

import java.util.ArrayList;
import java.util.List;

public class HomeJsonResultListAdapter extends RecyclerView.Adapter<HomeJsonResultListAdapter.InnerHolder>{

    private List<HomeJsonResult.DataBean> data = new ArrayList<>();
    @NonNull
    @Override
    public HomeJsonResultListAdapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_json_result_home, parent, false);
        return new InnerHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeJsonResultListAdapter.InnerHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(HomeJsonResult homeJsonResult) {
        data.clear();
        data.addAll(homeJsonResult.getData());
        notifyDataSetChanged();//更新数据
    }

    public class InnerHolder extends RecyclerView.ViewHolder{

        public InnerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
