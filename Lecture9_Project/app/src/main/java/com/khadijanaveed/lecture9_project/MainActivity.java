package com.khadijanaveed.lecture9_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animation(View view) {
        ImageView imageView = findViewById(R.id.image);
        imageView.animate().alpha(0).setDuration(500);
    }
}