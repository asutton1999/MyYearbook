package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class ZakActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zak);
    }

    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), NextActivityZak.class);
        startActivity(i);
    }


    public void buttonClick(View v) {
        Intent in = new Intent(getApplicationContext(), MainActivity2OM.class);
        startActivity(in);
    }

   // Link your main actvity here OM, just replace MainActvity.class with the name of your actvity


}