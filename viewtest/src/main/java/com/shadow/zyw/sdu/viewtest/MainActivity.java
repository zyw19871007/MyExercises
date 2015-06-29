package com.shadow.zyw.sdu.viewtest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private List<String> list = new ArrayList<>();
    private String listS[] = {"1", "2", "3", "4", "5", "6"};
    private MyListView myListView;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a2");
        list.add("a3");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("a6");
        list.add("a8");
        list.add("a7");
        myListView = (MyListView) findViewById(R.id.myListView);
        adapter = new MyAdapter(this, 0, list);
        myListView.setAdapter(adapter);
        myListView.setOnDelListener(new MyListView.OnDelListener() {
            @Override
            public void onDelete(int index) {
                list.remove(index);
                adapter.notifyDataSetChanged();
            }
        });

//        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.main);
//        LayoutInflater layoutInflater = LayoutInflater.from(this);
//        View view = layoutInflater.inflate(R.layout.button_layout, null);
//        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        linearLayout.addView(view,layoutParams);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
