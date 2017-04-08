package com.uic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
//Global
    String x="";

    @Override
    //method paling pertama dipanggil
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //local


        //layout yang akan digunakan activity
        setContentView(R.layout.activity_calculator);
        Button b0= (Button) findViewById(R.id.button0);
        final TextView view= (TextView) findViewById(R.id.textView2);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);
        Button b7 = (Button) findViewById(R.id.button7);
        Button b8 = (Button) findViewById(R.id.button8);
        Button b9 = (Button) findViewById(R.id.button9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x+"1";
                view.setText(x);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x+"2";
                view.setText(x);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x+"3";
                view.setText(x);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x+"4";
                view.setText(x);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x+"5";
                view.setText(x);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x+"6";
                view.setText(x);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x+"7";
                view.setText(x);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x+"8";
                view.setText(x);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x+"9";
                view.setText(x);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x+"0";
                view.setText(x);
//                Toast.makeText(v.getContext(),"Klik",Toast.LENGTH_SHORT).show();
            }
        });

    }

}


