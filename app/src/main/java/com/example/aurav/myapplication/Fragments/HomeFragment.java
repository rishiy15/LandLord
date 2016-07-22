package com.example.aurav.myapplication.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.aurav.myapplication.Adapter.HomeAdapter;
import com.example.aurav.myapplication.R;
import com.example.aurav.myapplication.TaskStyle.SingleTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jason on 7/21/16.
 */
public class HomeFragment extends Fragment {
    private ListView listView;
    ArrayList<SingleTask> taskList =  new ArrayList<SingleTask>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.home_fragment, container, false);

        listView = (ListView) v.findViewById(R.id.list_tasks);
        taskList =  new ArrayList<SingleTask>();

        SingleTask task;

        task = new SingleTask();
        task.setSummary("Vacuum Living Room");
        taskList.add(task);

        task = new SingleTask();
        task.setSummary("Take Trash Out");
        taskList.add(task);

        task = new SingleTask();
        task.setSummary("Take Trash Out");
        taskList.add(task);

        task = new SingleTask();
        task.setSummary("Having Breakfast");
        taskList.add(task);

        UpdateListView();

        listView.setAdapter(new HomeAdapter(this.getContext(), R.layout.single_task, taskList));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        return v;
    }

    private void UpdateListView() {

    }
}
