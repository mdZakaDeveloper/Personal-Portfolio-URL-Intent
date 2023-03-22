package com.example.personalportfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView instagram;
    ImageView github;
    ImageView linkedin;
    ImageView twitter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        twitter = findViewById(R.id.twitter);
        linkedin = findViewById(R.id.linkedin);
        instagram = findViewById(R.id.instagram);
        github  = findViewById(R.id.github);

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openApp("https://github.com/mdZakaDeveloper");
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openApp("https://www.instagram.com/zunicon_motivates/");
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openApp("https://www.linkedin.com/in/mohammed-zaka-kareem-404068230/");
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openApp("https://twitter.com/YesIamZaka");
            }
        });
    }

    private void openApp(String s) {
        Uri webpage = Uri.parse(s);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}