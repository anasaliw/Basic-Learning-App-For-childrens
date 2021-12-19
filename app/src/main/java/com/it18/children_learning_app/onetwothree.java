package com.it18.children_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class onetwothree extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onetwothree);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        t7=findViewById(R.id.t7);
        t8=findViewById(R.id.t8);
        t9=findViewById(R.id.t9);
        t10=findViewById(R.id.t10);
        //Creating Intents
        t1.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),one.class);
            startActivity(one);
        });
        t2.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),two.class);
            startActivity(one);
        });
        t3.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),three.class);
            startActivity(one);
        });
        t4.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),four.class);
            startActivity(one);
        });
        t5.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),five.class);
            startActivity(one);
        });
        t6.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),sic.class);
            startActivity(one);
        });
        t7.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),seven.class);
            startActivity(one);
        });
        t8.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),eight.class);
            startActivity(one);
        });
        t9.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),nine.class);
            startActivity(one);
        });
        t10.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),ten.class);
            startActivity(one);
        });

    }
}