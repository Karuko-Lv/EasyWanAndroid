package com.example.easywanandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easywanandroid.R;
import com.example.easywanandroid.wechat.WeChatJsonResult;

import java.util.ArrayList;
import java.util.List;

public class WeChatJsonResultListAdapter extends RecyclerView.Adapter<WeChatJsonResultListAdapter.InnerHolder> {

    private List<WeChatJsonResult.DataBean> data = new ArrayList<>();

//    /**
//     * 自定义接口
//     */
//    public interface OnRecyclerViewItemClickListener {
//        public void onItemClick(View view, int postion);
//    }

    OnItemClickListener mListener;
    public interface  OnItemClickListener{
        public void OnItemClick(View v, int position);
    }

    public void setOnItemClick(OnItemClickListener listener) {
        mListener = listener;
    }

    @NonNull
    @Override
    public WeChatJsonResultListAdapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_json_result, parent, false);
        return new InnerHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull InnerHolder holder, int position) {
        //绑定数据
//        Text titleTv = holder.itemView.findViewById(R.id.result_title);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mListener != null){
                    mListener.OnItemClick(v,position);
                }
            }
        });
        TextView authorTv = holder.itemView.findViewById(R.id.result_author);
        WeChatJsonResult.DataBean dataBean = data.get(position);
//        titleTv.setText(databean.getTitle());
        authorTv.setText(dataBean.getName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(WeChatJsonResult weChatJsonResult) {
        data.clear();
        data.addAll(weChatJsonResult.getData());
        notifyDataSetChanged();//更新数据
    }

    public class InnerHolder extends RecyclerView.ViewHolder {

//        private TextView tv_author;
//        private OnRecyclerViewItemClickListener mListener;// 声明自定义的接口


        public InnerHolder(@NonNull View itemView) {
            super(itemView);
//            itemView.setOnClickListener(this);
//            this.mListener = mListener;
//            tv_author = itemView.findViewById(R.id.result_author);
        }
//
//        @Override
//        public void onClick(View v) {
//            Intent intent = new Intent(.this, ForgetActivity.class);
//            startActivity(intent);
//        }
    }
}
