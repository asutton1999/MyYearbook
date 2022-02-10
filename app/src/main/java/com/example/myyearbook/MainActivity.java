package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

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
            TextView mTextView = (TextView)findViewById(R.id.mytextView);
            mTextView.setText("Freida is my dog's name");

    };



}