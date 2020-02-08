package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    private Button but;
    private DatePicker date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.tv);
        but = (Button) findViewById(R.id.btn);
        date = (DatePicker) findViewById(R.id.dp);

        txt.setText(currentDate());

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(currentDate());
            }
        });
    }

    //getting current gate
    String currentDate(){

        StringBuilder sb = new StringBuilder();
        sb.append(date.getDayOfMonth()+"/");        //date picker variable
        sb.append(date.getMonth() + 1 + "/");
        sb.append(date.getYear());

        return sb.toString();

    }
}
