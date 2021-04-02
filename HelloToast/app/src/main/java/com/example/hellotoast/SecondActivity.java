package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static com.example.hellotoast.MainActivity.c;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.hellotoast.EXTRA_MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i= getIntent();
        TextView textview= findViewById(R.id.count);
        String count = i.getStringExtra(MainActivity.Extra_MESSAGE);
        textview.setText(count);
    }
}