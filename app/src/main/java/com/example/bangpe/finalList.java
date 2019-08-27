package com.example.bangpe;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class finalList extends AppCompatActivity {
    ListView list;
    String value;
    Button btn_income, btn_outcome;
    EditText howmuch_Text;
    ArrayList<Data> wang;
    YasuoAdapter mAdapter;
    long mNow;
    Date mDate;
    SimpleDateFormat mFormat = new SimpleDateFormat("MM-dd");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_list);
        list=findViewById(R.id.finalList);
        btn_income=findViewById(R.id.btn_income);
        btn_outcome=findViewById(R.id.btn_outcome);
        howmuch_Text=(EditText)findViewById(R.id.howMuch);
        wang=new ArrayList<>();
        final Intent gg=new Intent(getApplicationContext(),Calender.class);
        btn_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=howmuch_Text.getText().toString();
                wang.add(new Data(""+getTime(),""+value));
                gg.putExtra("howmuch",value);
                startActivity(gg);
                mAdapter.notifyDataSetChanged();
            }
        });
        btn_outcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=howmuch_Text.getText().toString();
                int temp=Integer.parseInt(value)*-1;
                wang.add(new Data(""+getTime(),String.valueOf(temp)));
                gg.putExtra("howmuch",String.valueOf(temp));
                startActivity(gg);
                mAdapter.notifyDataSetChanged();
            }
        });
        mAdapter=new YasuoAdapter(wang,getApplicationContext());
        list.setAdapter(mAdapter);

    }
    private String getTime(){
        mNow=System.currentTimeMillis();
        mDate=new Date(mNow);
        return mFormat.format(mDate);
    }

}