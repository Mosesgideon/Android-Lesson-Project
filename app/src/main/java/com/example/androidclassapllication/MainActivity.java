package com.example.androidclassapllication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout profile = findViewById(R.id.profile);
        profile.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,HomeActivity.class));
        });
    }
}