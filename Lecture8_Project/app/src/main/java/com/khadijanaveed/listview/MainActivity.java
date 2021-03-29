package com.khadijanaveed.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> friendList;
    EditText editText;
    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.myListView);
        editText = findViewById(R.id.editText);
        friendList = new ArrayList<String>();
        Button button = findViewById(R.id.button);
        friendList.add("Khadija");
        friendList.add("Ashar");
        friendList.add("Hareem");
        friendList.add("Wahaj");
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendList);
        listView.setAdapter(arrayAdapter);
        Collections.sort(friendList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("You Clicked",friendList.get(i));
                Intent intent = new Intent(MainActivity.this,detailedActivity.class);
                intent.putExtra("Friend Name",friendList.get(i));
                startActivity(intent);
            }
        });
    }

    public void AddFriend(View view) {
        friendList.add(editText.getText().toString());
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendList);
//        listView.setAdapter(arrayAdapter);
//        Instead of the uppes code we can also write
        arrayAdapter.notifyDataSetChanged();
        Collections.sort(friendList);
    }
}