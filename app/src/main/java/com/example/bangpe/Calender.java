package com.example.bangpe;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Calender extends AppCompatActivity {
    TextView income;
    TextView outcome;
    TextView Sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent getintent = getIntent();
        String Howmuch = getintent.getStringExtra("howmuch");
        setContentView(R.layout.activity_calender);
        income = findViewById(R.id.income);
        outcome = findViewById(R.id.outcome);
        Sum = findViewById(R.id.Sum);
        SharedPreferences sf = getSharedPreferences("sFile", MODE_PRIVATE);
//       //text라는 key에 저장된 값이 있는지 확인. 아무값도 들어있지 않으면 ""를 반환
        String text = sf.getString("income", "0");
        income.setText(text);
        text = sf.getString("outcome", "0");
        outcome.setText(text);
        if(Integer.parseInt(Howmuch)<0){
            outcome.setText(Integer.parseInt(outcome.getText().toString())+Integer.parseInt(Howmuch)+"");
            Sum.setText(Integer.parseInt(income.getText().toString())+Integer.parseInt(outcome.getText().toString())+"");
        }
        else{
            income.setText(Integer.parseInt(income.getText().toString())+Integer.parseInt(Howmuch)+"");
            Sum.setText(Integer.parseInt(income.getText().toString())+Integer.parseInt(outcome.getText().toString())+"");
        }
    }


    @Override
    protected void onStop() {
        super.onStop();
        String incomestr, outcomestr,sumstr;
        incomestr=income.getText().toString();
        outcomestr=outcome.getText().toString();
        sumstr=Sum.getText().toString();
        // Activity가 종료되기 전에 저장한다.
        //SharedPreferences를 sFile이름, 기본모드로 설정
        SharedPreferences sharedPreferences = getSharedPreferences("sFile", MODE_PRIVATE);
        //저장을 하기위해 editor를 이용하여 값을 저장시켜준다.
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("income",incomestr );
        editor.putString("outcome", outcomestr);
        editor.putString("Sum", sumstr);

        editor.commit();
    }
}

