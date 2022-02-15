package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2OM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_om);




        Button btnn;

        btnn = (Button) findViewById(R.id.button4);
        btnn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent ii = new Intent (MainActivity2OM.this,OmNextActivity.class);
                startActivity(ii);
            }


        });



    }




}