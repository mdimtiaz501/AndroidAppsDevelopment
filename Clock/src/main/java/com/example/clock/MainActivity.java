package com.example.clock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Analyzer;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AnalogClock an;
    private DigitalClock dc;
    private TextClock tc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        an = findViewById(R.id.ac);
        dc = findViewById(R.id.dc);
        tc = findViewById(R.id.tc);

        an.setOnClickListener(this);
        dc.setOnClickListener(this);
        tc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.ac){
            Toast.makeText(MainActivity.this,"Analog Clock",Toast.LENGTH_SHORT).show();
        }
        if(v.getId() == R.id.dc){
            Toast.makeText(MainActivity.this,"Digital Clock",Toast.LENGTH_SHORT).show();
        }
        if(v.getId() == R.id.tc){
            Toast.makeText(MainActivity.this,"Text Clock",Toast.LENGTH_SHORT).show();
        }
    }
}
