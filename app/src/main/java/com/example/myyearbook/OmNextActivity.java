package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OmNextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_om_next);




        Button btnn;

        btnn = (Button) findViewById(R.id.button5);
        btnn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent ii2 = new Intent (OmNextActivity.this,MainActivity.class);
                startActivity(ii2);
            }


        });
        // Comment 1 ends



        //Share button
        Button sharebuttton = findViewById(R.id.button6);

        sharebuttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "This is preformatted message.");
                startActivity(intent);
            }
        });







    }



    /* Comment 2 begins

    this button mentioned below was supposed to direct to ManiActivity
    which is Angela's first XML file. But it did not work

    public void buttonClick(View v) {
        Intent in = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(in);
    }
    */  // Comment 2 ends
}