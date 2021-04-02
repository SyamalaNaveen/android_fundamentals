package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String Extra_MESSAGE = "com.example.hellotoast.EXTRA_MESSAGE";

    public static int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void passC(View v){
        Intent intent=new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, String.valueOf(c));
        startActivity(intent);
    }
    public void incrementCount(View v){
        c=c+1;
        TextView t= findViewById(R.id.TextView);
        t.setText(String.valueOf(c));
    }
}