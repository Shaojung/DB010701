package com.example.student.db010701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView2);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("TT22");
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

}


