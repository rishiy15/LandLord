package com.example.aurav.myapplication.Adapter;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aurav.myapplication.R;
import com.example.aurav.myapplication.TaskStyle.SingleTask;

import java.util.ArrayList;

/**
 * Created by jason on 7/21/16.
 */
public class HomeAdapter extends ArrayAdapter<SingleTask> {
    private Context context;
    private ArrayList<SingleTask> tasklist;

    public HomeAdapter(Context context, int resource, ArrayList<SingleTask> tasks) {
        super(context, resource, tasks);
        this.context = context;
        this.tasklist = tasks;
    }

    @Override
    public int getCount() {
        return tasklist.size();
    }

    @Override
    public SingleTask getItem(int position) {
        return tasklist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemView = convertView;

        if (itemView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = (View) inflater.inflate(
                    R.layout.single_task, null);
        }

        // TextView title = (TextView)convertView.findViewById(R.id.list_entry_title);
        TextView summary=(TextView)itemView.findViewById(R.id.description_text);

        // title.setText(tasklist.get(position).getTitle());
        summary.setText(tasklist.get(position).getSummary());

        return itemView;
    }
}
