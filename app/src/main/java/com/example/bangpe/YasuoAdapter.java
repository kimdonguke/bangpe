package com.example.bangpe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class YasuoAdapter extends BaseAdapter {
    ArrayList<Data> wang;
    Context context;

    public YasuoAdapter(ArrayList<Data> wang, Context context) {
        this.wang = wang;
        this.context = context;
    }

    @Override
    public int getCount() {
        return wang.size();
    }

    @Override
    public Object getItem(int position) {
        return wang.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.list_item,parent,false);
        }
        TextView date=convertView.findViewById(R.id.item_date);
        TextView content=convertView.findViewById(R.id.item_content);

        date.setText(wang.get(position).getDate());
        content.setText(wang.get(position).getContent());


        return convertView;
    }
}
