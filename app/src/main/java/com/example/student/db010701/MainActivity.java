package com.example.student.db010701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener{
    TextView tv;
    Button btn2, btn5, btn6;
    ToggleButton tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView2);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(this);
        btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(this);
        tb = (ToggleButton) findViewById(R.id.toggleButton);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                tv.setText(String.valueOf(isChecked));
            }
        });
    }

    public void click1(View v)
    {
        switch(v.getId())
        {
            case R.id.button:
                tv.setText("Hello World1");
                break;
            case R.id.button3:
                tv.setText("Hello World3");
                break;
            case R.id.button4:
                tv.setText("Hello World4");
                break;
        }

    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.button2:
                tv.setText("Hello World2");
                break;
            case R.id.button5:
                tv.setText("Hello World5");
                break;
            case R.id.button6:
                tv.setText("Hello World6");
                break;
        }

    }
}


