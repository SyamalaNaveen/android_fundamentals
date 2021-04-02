package com.example.hotspots;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements secondactivity.SaveRatingListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void RatingButton(){
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                secondactivity mealrater = new secondactivity();
                mealrater.show(fragmentManager, "RateMeal");
            }
        });
    }
    @Override
    public void MealRaterviewer(float rating, int x) {
        TextView textView = findViewById(R.id.textView4);
        textView.setText(String.valueOf(rating));
    }

    @Override
    public void sendName(String name) {

    }
}