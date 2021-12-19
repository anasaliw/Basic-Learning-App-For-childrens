package com.it18.children_learning_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;

public class colors extends AppCompatActivity {
    Button blue,red,orange,purple,green;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        blue=findViewById(R.id.blue);
        red=findViewById(R.id.red);
        orange=findViewById(R.id.orange);
        purple=findViewById(R.id.purple);
        green=findViewById(R.id.green);
        //Intents
        blue.setOnClickListener(v->{
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView,blue.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name") // name can be null
                    .commit();
        });
        green.setOnClickListener(v->{
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView,green.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name") // name can be null
                    .commit();
        });
        red.setOnClickListener(v->{
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView,red.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name") // name can be null
                    .commit();
        });
        orange.setOnClickListener(v->{
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView,orange.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name") // name can be null
                    .commit();
        });
        purple.setOnClickListener(v->{
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView,purple.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name") // name can be null
                    .commit();
        });
    }
}