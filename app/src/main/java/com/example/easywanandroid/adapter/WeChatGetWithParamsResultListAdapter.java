package com.example.easywanandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easywanandroid.R;
import com.example.easywanandroid.wechat.WeChatGetWithParamsResult;

import java.util.ArrayList;
import java.util.List;

public class WeChatGetWithParamsResultListAdapter extends RecyclerView.Adapter<WeChatGetWithParamsResultListAdapter.InnerHolder>{

    private List<WeChatGetWithParamsResult.DataBean.DatasBean> datas = new ArrayList<>();

    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detailed_result, parent, false);
        return new InnerHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull InnerHolder holder, int position) {
        //绑定数据
        TextView authorTv1 = holder.itemView.findViewById(R.id.result_detailed_author1);
        TextView authorTv2 = holder.itemView.findViewById(R.id.result_detailed_author2);
        TextView titleTv = holder.itemView.findViewById(R.id.title_wechat);
        TextView timeTv = holder.itemView.findViewById(R.id.time_wechat);
        WeChatGetWithParamsResult.DataBean.DatasBean datasBean = datas.get(position);
        authorTv1.setText(datasBean.getId());
        authorTv2.setText(datasBean.getApkLink());
        titleTv.setText(datasBean.getTitle());
        timeTv.setText(datasBean.getNiceDate());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void setDatas(WeChatGetWithParamsResult result) {
        datas.clear();
        datas.addAll(result.getData().getDatas());
        notifyDataSetChanged();//更新数据
    }

    public class InnerHolder extends RecyclerView.ViewHolder {
        public InnerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
