package com.example.easywanandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easywanandroid.R;
import com.example.easywanandroid.projects.ProjectsJsonResult;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ProjectsJsonResultListAdapter extends RecyclerView.Adapter<ProjectsJsonResultListAdapter.InnerHolder> {

    private List<ProjectsJsonResult.DataBean.DatasBean> datas= new ArrayList<>();
    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_json_result_projects, parent, false);
        return new InnerHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectsJsonResultListAdapter.InnerHolder holder, int position) {
        TextView title = holder.itemView.findViewById(R.id.result_title_name);
        TextView time = holder.itemView.findViewById(R.id.time_projects);
        TextView content = holder.itemView.findViewById(R.id.result_content);
        TextView author = holder.itemView.findViewById(R.id.result_author_name);
        ProjectsJsonResult.DataBean.DatasBean datasBeanBean = datas.get(position);
        title.setText(datasBeanBean.getTitle());
        time.setText(datasBeanBean.getNiceDate());
        content.setText(datasBeanBean.getDesc());
        author.setText(datasBeanBean.getAuthor());
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public void setData(ProjectsJsonResult projectsJsonResult) {
        datas.clear();
        datas.addAll(projectsJsonResult.getData().getDatas());
        notifyDataSetChanged();//更新数据
    }

    public class InnerHolder extends RecyclerView.ViewHolder{

        public InnerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
