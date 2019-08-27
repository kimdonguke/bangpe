package com.example.bangpe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity extends AppCompatActivity {
    Button gotoAdd;
    Button gotoCalender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        gotoAdd=findViewById(R.id.gotoAdd);
        gotoCalender=findViewById(R.id.gotoCalender);
        gotoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SubActivity.this,finalList.class);
                startActivity(intent);
            }
        });
        gotoCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rlaheel = new Intent(SubActivity.this,Calender.class);
                startActivity(rlaheel);
            }
        });
    }
}
