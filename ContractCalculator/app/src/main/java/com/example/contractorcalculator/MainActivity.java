package com.example.contractorcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void edit(View v){
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        TextView textView6=(TextView)findViewById(R.id.textView6);
        TextView textView8=(TextView)findViewById(R.id.textView8);
        TextView textView10=(TextView)findViewById(R.id.textView10);

        String msg1= editText1.getText().toString();
        String msg2= editText2.getText().toString();

        int subtotal = Integer.parseInt(msg1)+Integer.parseInt(msg2)    ;

        int tax = subtotal*5/100;

        int total = subtotal+tax;

        textView6.setText(String.valueOf(subtotal));
        textView8.setText(String.valueOf(tax));
        textView10.setText(String.valueOf(total));
    }

}