package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity<i> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(),NextActivity.class);
            startActivity(i);
        //My Activty name is "ZakActivity"
    }



}