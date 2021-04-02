package com.example.hotspots;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;

public class secondactivity extends DialogFragment {

    public interface SaveRatingListener {
        void MealRaterviewer(float rating, int count);

        void sendName(String name);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_secondactivity, container);

        getDialog().setTitle("RateMeal");

        final RatingBar ratingBar = view.findViewById(R.id.ratingBar);
        final RatingBar ratingBar2 = view.findViewById(R.id.ratingBar2);
        final RatingBar ratingBar3 = view.findViewById(R.id.ratingBar3);
        Button button = view.findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rating = ratingBar.getRating();
                float rating2 = ratingBar2.getRating();
                float rating3 = ratingBar3.getRating();
                saveRating(rating);
                saveRating(rating2);
                saveRating(rating3);
            }
        });


        return view;
    }
    private void saveRating(float rating) {
        SaveRatingListener activity = (SaveRatingListener) getActivity();
        activity.MealRaterviewer(rating, 5);
        activity.sendName("meal");
        getDialog().dismiss();
    }

}