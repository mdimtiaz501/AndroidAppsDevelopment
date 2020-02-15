package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private Button btn;
    private TimePicker time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);
        time = findViewById(R.id.tp);

        time.setIs24HourView(true);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tpicker = time.getCurrentHour() + ":" + time.getCurrentMinute();
                text.setText(tpicker);
            }
        });

    }
}
