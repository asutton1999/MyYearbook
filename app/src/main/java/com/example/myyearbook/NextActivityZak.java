package com.example.myyearbook;

import android.os.Build;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class NextActivityZak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_zak);

        WebView myWebView = findViewById(R.id.WebView2);
        myWebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = myWebView.getSettings();
        //webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://naruto.fandom.com/wiki/Madara_Uchiha");



        if (Build.VERSION.SDK_INT >= 19) {
            myWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        }


        Button btn;

        btn = (Button) findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent ii = new Intent(NextActivityZak.this, MainActivity2OM.class);
                startActivity(ii);
            }


        });







    }


}