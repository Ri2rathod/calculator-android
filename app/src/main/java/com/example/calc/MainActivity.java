package com.example.calc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @SuppressLint("StaticFieldLeak")
    protected static TextView display ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display=findViewById(R.id.display);

        Button input_9= findViewById(R.id.input_9);
        Button input_8= findViewById(R.id.input_8);
        Button input_7= findViewById(R.id.input_7);
        Button input_6= findViewById(R.id.input_6);
        Button input_5= findViewById(R.id.input_5);
        Button input_4= findViewById(R.id.input_4);
        Button input_3= findViewById(R.id.input_3);
        Button input_2= findViewById(R.id.input_2);
        Button input_1= findViewById(R.id.input_1);
        Button input_0= findViewById(R.id.input_0);
        Button clear=findViewById(R.id.clear);
        Button remove=findViewById(R.id.remove);




        input_9.setOnClickListener(this);
        input_8.setOnClickListener(this);
        input_7.setOnClickListener(this);
        input_6.setOnClickListener(this);
        input_5.setOnClickListener(this);
        input_4.setOnClickListener(this);
        input_3.setOnClickListener(this);
        input_2.setOnClickListener(this);
        input_1.setOnClickListener(this);
        input_0.setOnClickListener(this);
        remove.setOnClickListener(this);
        clear.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Button b = (Button)v;

        switch (b.getId())
        {
            case R.id.input_0: case R.id.input_1 :case R.id.input_2: case R.id.input_3:case R.id.input_4:case R.id.input_5: case R.id.input_6:case R.id.input_7: case R.id.input_8: case R.id.input_9:
                String buttonText = b.getText().toString();
                inputer(buttonText);
                break;
            case R.id.clear:
                clear();
                break;
            case  R.id.remove:
                remove();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }

    }

    public void inputer(String value)
    {
//        TextView display = (TextView) findViewById(R.id.display);
        if (display.getText().toString().equals("0"))
        {
            display.setText(value);
        }
        else {
            display.setText(display.getText()+value);
        }

    }
    public  void  clear()
    {
        display.setText("0");
        Log.d("TAG", "remove: ");
    }
    public  void remove(){
        if(display.getText().toString().length()==1)
        {
            display.setText("0");
        }
        else {
            display.setText(display.getText().toString().substring(0,display.getText().toString().length()-1));
        }


    }
}