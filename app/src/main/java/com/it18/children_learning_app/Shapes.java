package com.it18.children_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Shapes extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        t7=findViewById(R.id.t7);
        t8=findViewById(R.id.t8);
        //Creating Intents
        t1.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),square.class);
            startActivity(one);
        });
        t2.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),circle.class);
            startActivity(one);
        });
        t3.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),rectangle.class);
            startActivity(one);
        });
        t4.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),triangle.class);
            startActivity(one);
        });
        t5.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),oval.class);
            startActivity(one);
        });
        t6.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),pentagon.class);
            startActivity(one);
        });
        t7.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),star.class);
            startActivity(one);
        });
        t8.setOnClickListener(v->{
            Intent one=new Intent(getApplicationContext(),heart.class);
            startActivity(one);
        });
    }
}