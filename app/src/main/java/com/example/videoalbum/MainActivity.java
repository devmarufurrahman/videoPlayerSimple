package com.example.videoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout video1, video2, video3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // id define with variable
        video1 = findViewById(R.id.video1);
        video2 = findViewById(R.id.video2);
        video3 = findViewById(R.id.video3);


        // video one show
        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // video url set
                VideoPlayer.url = "https://www.youtube.com/embed/Rrki8LwtCQU";

                // intent player path
                Intent videoIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(videoIntent);
            }
        });


        // video one show
        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // video url set
                VideoPlayer.url = "https://www.youtube.com/embed/ii8GaRjRoNI";

                // intent player path
                Intent videoIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(videoIntent);
            }
        });


        // video one show
        video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // video url set
                VideoPlayer.url = "https://www.youtube.com/embed/2C5834qx0sA";

                // intent player path
                Intent videoIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(videoIntent);
            }
        });
    }
}