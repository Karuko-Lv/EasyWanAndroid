package com.example.easywanandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easywanandroid.R;
import com.example.easywanandroid.domain.JsonResult;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class JsonResultListAdapter extends RecyclerView.Adapter<JsonResultListAdapter.InnerHolder> {

    private List<JsonResult.DataBean> data = new ArrayList<>();
    @NonNull
    @Override
    public JsonResultListAdapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_json_result, parent, false);
        return new InnerHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull InnerHolder holder, int position) {
        //绑定数据
//        Text titleTv = holder.itemView.findViewById(R.id.result_title);
        TextView authorTv = holder.itemView.findViewById(R.id.result_author);
        JsonResult.DataBean dataBean = data.get(position);
//        titleTv.setText(databean.getTitle());
        authorTv.setText(dataBean.getName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(JsonResult jsonResult) {
        data.clear();
        data.addAll(jsonResult.getData());
        notifyDataSetChanged();//更新数据
    }

    public class InnerHolder extends RecyclerView.ViewHolder {
        public InnerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
