package com.example.administrator.flexiblelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CustomListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        ArrayList<String> dataList = new ArrayList<>(50);
        for (int i = 0;i<50;i++){
            dataList.add(i+"");
        }
        ListAdapter adapter =new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, dataList);
        listView.setAdapter(adapter);
    }

    private void initView() {
        listView = (CustomListView) findViewById(R.id.listView);
    }
}
