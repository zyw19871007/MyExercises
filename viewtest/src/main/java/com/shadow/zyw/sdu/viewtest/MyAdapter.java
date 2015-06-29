package com.shadow.zyw.sdu.viewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shadow on 2015/6/29.
 */
public class MyAdapter extends ArrayAdapter<String>{
    public MyAdapter(Context context, int resource, List<String> textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_listview, null);


        } else {
            view = convertView;
        }
        TextView textView = (TextView) view.findViewById(R.id.item_id);
        textView.setText(getItem(position));
        return view;
    }
}
