package com.example.proj2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.proj2.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1=findViewById(R.id.sc15);
        TextView tv2=findViewById(R.id.sc17);
        TextView tv3=findViewById(R.id.sc18);
        TextView cgpa=findViewById(R.id.cgpa);
        TextView abt=findViewById(R.id.abt);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        cgpa.setOnClickListener(this);
        abt.setOnClickListener(this);
    }
    @SuppressLint("NonConstantResouceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.sc15:
                Intent ii=new Intent(this,sch_15.class);
                startActivity(ii);
                break;
            case R.id.sc17:
                Intent i=new Intent(this,sch_17.class);
                startActivity(i);
                break;
            case R.id.sc18:
                Intent iii=new Intent(this,sch_18.class);
                startActivity(iii);
                break;
            case R.id.cgpa:
                Intent in=new Intent(this,cgpa.class);
                startActivity(in);
                break;
            case R.id.abt:
                Intent n=new Intent(this,abt.class);
                startActivity(n);
                break;
        }


    }
}