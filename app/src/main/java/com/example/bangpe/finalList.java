package com.example.bangpe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class finalList extends AppCompatActivity {
    ListView list;
    ArrayList<Data> wang;
    YasuoAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_list);
        list=findViewById(R.id.finalList);
        wang=new ArrayList<>();
        wang.add(new Data("8 / 14","아 씨~발 방학 얼마 안남았노"));
        wang.add(new Data("8 / 14","아 씨~발 방학 얼마 안남았노"));
        wang.add(new Data("8 / 14","아 씨~발 방학 얼마 안남았노"));
        wang.add(new Data("8 / 14","아 씨~발 방학 얼마 안남았노"));
        wang.add(new Data("8 / 15","오늘은 광복절"));
        mAdapter=new YasuoAdapter(wang,getApplicationContext());
        list.setAdapter(mAdapter);
    }
}
