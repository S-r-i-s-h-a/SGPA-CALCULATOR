package com.example.proj2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class x3x18  extends AppCompatActivity implements View.OnClickListener {
    Double m1,m2,m3,m4,m5,m6,m7,m8,m9;
    Double c1,c2,c3,c4,c5,c6,c7,c8,c9;
    EditText dropdown,drpdown,d3,d4,d5,d6,d7,d8,d9;
    EditText et,et1,et2,et3,et4,et5,et6,et7,et8;
    String ss,ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8,s1,s2,s3,s4,s5,s6,s7,s8,s9;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml9);
        TextView tv=findViewById(R.id.textView9);
        tv.setText("3rd Sem");

        et=findViewById(R.id.text9);
        et.setHint("18MAT31");
        String ss=et.getText().toString();


        et1=findViewById(R.id.editText9);
        et1.setHint("18XX32");
        ss1=et1.getText().toString();

        et2=findViewById(R.id.editText19);
        et2.setHint("18XX33");
        ss2=et2.getText().toString();


        et3=findViewById(R.id.editText29);
        et3.setHint("18XX34");
        ss3=et3.getText().toString();


        et4=findViewById(R.id.editText39);
        et4.setHint("18XX35");
        ss4 =et4.getText().toString();


        et5=findViewById(R.id.editText49);
        et5.setHint("18XX36");
        ss5=et5.getText().toString();


        et6=findViewById(R.id.editText59);
        et6.setHint("18XXL37");
        ss6=et6.getText().toString();


        et7=findViewById(R.id.editText79);
        et7.setHint("18XXL38");
        ss7=et7.getText().toString();

        et8=findViewById(R.id.editText99);
        et8.setHint("17KAK/CPC39");
        ss8=et8.getText().toString();




        Button bb=findViewById(R.id.b19);
        bb.setOnClickListener(this);






        dropdown = findViewById(R.id.spin19);
        drpdown = findViewById(R.id.spin29);
        d3=findViewById(R.id.spin39);
        d4=findViewById(R.id.spin49);
        d5=findViewById(R.id.spin59);
        d6=findViewById(R.id.spin69);
        d7=findViewById(R.id.spin79);
        d8=findViewById(R.id.spin89);
        d9=findViewById(R.id.spin99);
        s1=dropdown.getText().toString();
        s2=drpdown.getText().toString();
        s3=d3.getText().toString();
        s4=d4.getText().toString();
        s5=d5.getText().toString();
        s6=d6.getText().toString();
        s7=d7.getText().toString();
        s8=d8.getText().toString();
        s9=d9.getText().toString();



    }


    @Override
    public void onClick(View view) {
        try{
            String Tag="Err";

            c1 = Double.parseDouble(dropdown.getText().toString());


            Log.d(Tag, "onClick: "+c1);


            c2=Double.parseDouble(drpdown.getText().toString());
            c3=Double.parseDouble(d3.getText().toString());
            c4=Double.parseDouble(d4.getText().toString());
            c5=Double.parseDouble(d5.getText().toString());
            c6=Double.parseDouble(d6.getText().toString());
            c7=Double.parseDouble(d7.getText().toString());
            c8=Double.parseDouble(d8.getText().toString());
            c9=Double.parseDouble(d9.getText().toString());
            m2=Double.parseDouble(et1.getText().toString());
            m3=Double.parseDouble(et2.getText().toString());
            m4=Double.parseDouble(et3.getText().toString());
            m5=Double.parseDouble(et4.getText().toString());
            m6=Double.parseDouble(et5.getText().toString());
            m8=Double.parseDouble(et7.getText().toString());
            m7=Double.parseDouble(et6.getText().toString());
            m1=Double.parseDouble(et.getText().toString());
            m9=Double.parseDouble(et8.getText().toString());
            int gp1= (int) cred(m1);
            int gp2= (int) cred(m2);
            int gp3= (int) cred(m3);
            int gp4= (int) cred(m4);
            int gp5= (int) cred(m5);
            int gp6= (int) cred(m6);
            int gp7= (int) cred(m7);
            int gp8= (int) cred(m8);
            int gp9=(int) cred(m9);

            double sg=((gp1*c1) +(gp2*c2)+(gp3*c3)+(gp4*c4)+(gp5*c5)+(gp6*c6)+(gp7*c7)+(gp8*c8)+(gp9*c9))/(c1+c2+c3+c4+c5+c6+c7+c8+c9);
            double sgpa=Math.round(sg*100.00)/100.00;
            double per= (sgpa-0.75)*10.00;
            double perc=Math.round(per*100.00)/100.00;


            TextView myTextView =findViewById(R.id.textView119);

            myTextView.setText("SGPA="+sgpa+" "+"per="+perc);
            String TAG=" errrrrrrr";
            Log.d(TAG, "onClick: "+sgpa+ " "+ perc);}
        catch (Exception e)
        {
            makeToast("Enter all the values");

        }
    }


    public static double cred(Double m)
    {
        if(m<=100 && m>=90 ) return 10;
        if(m<90 && m>=80) return 9;
        if(m<80 && m>=70) return 8;
        if(m<70 && m>=60) return 7;
        if(m<60 && m>=45) return 6;
        if(m<45 && m>=40) return 4;
        else
            return 0;
    }
    private void makeToast(String mess)
    {
        Toast.makeText(getApplicationContext(),mess,Toast.LENGTH_SHORT).show(); }
}
