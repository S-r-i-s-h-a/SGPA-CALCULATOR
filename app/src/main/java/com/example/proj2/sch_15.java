package com.example.proj2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sch_15  extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sch_15);
        TextView tv=findViewById(R.id.text_gallery);
        tv.setText("15 SCHEME");
        TextView tv1=findViewById(R.id.tv1);

        TextView tv2=findViewById(R.id.tv2);

        TextView tv3=findViewById(R.id.tv3);

        TextView tv4=findViewById(R.id.tv4);
        TextView tv5=findViewById(R.id.tv5);
        TextView tv6=findViewById(R.id.tv6);
        TextView tv7=findViewById(R.id.tv7);
        TextView tv8=findViewById(R.id.tv8);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
        tv6.setOnClickListener(this);
        tv7.setOnClickListener(this);
        tv8.setOnClickListener(this);

    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv1:
                Intent ii=new Intent(this,pc15.class);
                startActivity(ii);
                break;
            case R.id.tv2:
                Intent i=new Intent(this,cc15.class);
                startActivity(i);
                break;
            case R.id.tv3:
                Intent iii=new Intent(this,x3x15.class);
                startActivity(iii);
                break;
            case R.id.tv4:
                Intent in=new Intent(this,x4x15.class);
                startActivity(in);
                break;
            case R.id.tv5:
                Intent n=new Intent(this,x5x15.class);
                startActivity(n);
                break;
            case R.id.tv6:
                Intent nn=new Intent(this,x6x15.class);
                startActivity(nn);
                break;
            case R.id.tv7:
                Intent nnn=new Intent(this,x7x15.class);
                startActivity(nnn);
                break;
            case R.id.tv8:
                Intent l=new Intent(this,x8x15.class);
                startActivity(l);
                break;
        }


    }
}



