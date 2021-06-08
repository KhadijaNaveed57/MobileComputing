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
//        imageView.animate().alpha(0).setDuration(500);
//        imageView.animate().translationXBy(-500).setDuration(500);
//        imageView.animate().rotation(720).setDuration(2000);
//        imageView.animate().rotation(720).alpha(0).setDuration(2000);
        imageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
    }
}