package com.example.videoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class VideoPlayer extends AppCompatActivity {
    WebView webView;
    public static String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_player);

        //id define
        webView = findViewById(R.id.webPlayer);


        // web player show
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);


    }
}