package com.khadijanaveed.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class detailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        TextView textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("Friend Name"));
    }
}