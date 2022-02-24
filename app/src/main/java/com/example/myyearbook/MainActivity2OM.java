package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity2OM extends AppCompatActivity {

    ImageView ima;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_om);


        ima = findViewById(R.id.imageView2);
        button = findViewById(R.id.buttonShare);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image();
            }
        });

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


    private void image(){

        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());

        BitmapDrawable drawable = (BitmapDrawable)ima.getDrawable();
        Bitmap bitmap = drawable.getBitmap();
        File f = new File(getExternalCacheDir() + "/" + getResources().getString(R.string.app_name) + ".png" );
        Intent shareint = new Intent();

        try {
            FileOutputStream outputStream = new FileOutputStream(f);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100,outputStream);

            outputStream.flush();
            outputStream.close();
            shareint = new Intent(Intent.ACTION_SEND);
            shareint.setType("image/*");
            shareint.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(f));
            shareint.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);


        } catch (Exception e){
            throw new RuntimeException(e);
        }

        startActivity(Intent.createChooser(shareint, "share image"));

    }


}