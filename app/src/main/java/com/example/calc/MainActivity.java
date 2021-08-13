package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button input_7=(Button) findViewById(R.id.input_7);
        Button input_8=(Button) findViewById(R.id.input_8);

        TextView display = (TextView) findViewById(R.id.display);
        Button remove=(Button)findViewById(R.id.remove);

        input_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputer(input_7.getText().toString());
            }
        });


        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString().substring(0,display.getText().toString().length()-1));
                Log.d("TAG", "onClick: "+display.getText().toString().substring(0,display.getText().toString().length()-1));
            }
        });


    }
    private void inputer(String value)
    {
        TextView display = (TextView) findViewById(R.id.display);
        if (display.getText().toString().equals("0"))
        {
            display.setText(value);
        }
        else {
            display.setText(display.getText()+value);
        }

    }
}