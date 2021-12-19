package com.it18.children_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView abc,alifba,shapes,colors,onetwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abc=findViewById(R.id.abc);
        alifba=findViewById(R.id.alifba);
        shapes=findViewById(R.id.shapes);
        colors=findViewById(R.id.colors);
        onetwo=findViewById(R.id.onetwo);
        //Intents
        abc.setOnClickListener(v->{
            Intent i=new Intent(getApplicationContext(),abcd.class);
            startActivity(i);
        });
        alifba.setOnClickListener(v->{
            Intent i=new Intent(getApplicationContext(),AlifBaa.class);
            startActivity(i);
        });
        onetwo.setOnClickListener(v->{
            Intent i=new Intent(getApplicationContext(),onetwothree.class);
            startActivity(i);
        });
        shapes.setOnClickListener(v->{
            Intent i=new Intent(getApplicationContext(),Shapes.class);
            startActivity(i);
        });
        colors.setOnClickListener(v->{
            Intent i=new Intent(getApplicationContext(),colors.class);
            startActivity(i);
        });

    }
}