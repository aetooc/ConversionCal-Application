package com.example.conversioncal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    TextView textView3;
    EditText editTextNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        editTextNumber = (EditText) findViewById(R.id.editTextNumber);
    }

    public void updateText(View view){
        int n;
        EditText x = (EditText) findViewById(R.id.editTextNumber);
        String s = x.getText().toString();

        if(s.isEmpty())
            n = 0;
        else
            n = Integer.parseInt(x.getText().toString());

        String output = Integer.toHexString(n);
        textView.setText(output.toUpperCase());
        textView2.setText(Integer.toBinaryString(n));
        textView3.setText(Integer.toOctalString(n));

    }
}