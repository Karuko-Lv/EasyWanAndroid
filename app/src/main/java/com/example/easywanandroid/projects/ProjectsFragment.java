package com.example.easywanandroid.projects;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easywanandroid.R;
import com.example.easywanandroid.adapter.ProjectsJsonResultListAdapter;

public class ProjectsFragment extends Fragment {

    private RecyclerView mResultListProjects;
    private ProjectsJsonResultListAdapter mAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_projects,container,false);
        mResultListProjects = view.findViewById(R.id.result_list_projects);
        mResultListProjects.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mResultListProjects.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.top=5;
                outRect.bottom=5;
            }
        });
        mAdapter = new ProjectsJsonResultListAdapter();
        mResultListProjects.setAdapter(mAdapter);//数据回来
        return view;
    }

    public void updateList(ProjectsJsonResult projectsJsonResult) {
        mAdapter.setData(projectsJsonResult);
    }
}
