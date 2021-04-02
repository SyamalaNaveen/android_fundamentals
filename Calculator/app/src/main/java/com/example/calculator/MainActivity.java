package com.example.calculator;

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

    public void calculation(View v){
        EditText eT1 = (EditText)findViewById(R.id.EditText1);
        EditText eT2 = (EditText)findViewById(R.id.EditText2);
        TextView tv = (TextView)findViewById(R.id.textView);

        String var1 = eT1.getText().toString();
        String var2 = eT2.getText().toString();

        float b1= Float.parseFloat(var1);
        float b2 = Float.parseFloat(var2);

        switch (v.getId()){
            case R.id.ADD:{
                float res = b1+b2;
                tv.setText(String.valueOf(res));
                break;
            }
            case R.id.SUB:{
                float res = b1-b2;
                tv.setText(String.valueOf(res));
                break;
            }
            case R.id.MUL:{
                float res = b1*b2;
                tv.setText(String.valueOf(res));
                break;
            }
            case R.id.DIVI:{
                float res = b1/b2;
                tv.setText(String.valueOf(res));
                break;
            }
        }

    }

}