package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextActivityZak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_zak);

        Button btn;

        btn = (Button) findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent ii = new Intent (NextActivityZak.this,MainActivity2OM.class);
                startActivity(ii);
            }


        });


    }


}