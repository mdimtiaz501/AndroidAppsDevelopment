package com.example.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txt;
    private Button but;
    private DatePickerDialog dpd;
    private DatePicker dp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.tv);
        but = findViewById(R.id.btn);

        but.setOnClickListener(this);

        //this sectin is for showing current date
        txt = (TextView) findViewById(R.id.tv);
        but = (Button) findViewById(R.id.btn);
        dp = (DatePicker) findViewById(R.id.date);
        txt.setText(currentDate());
        //end of section
    }

    @Override
    public void onClick(View v) {
        DatePicker dp = new DatePicker(this);
        int cd = dp.getDayOfMonth();
        int cm = (dp.getMonth())+1;
        int cy = dp.getYear();
        dpd = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    txt.setText(dayOfMonth + "/" + (month+1) + "/" + year);
                }
            },cy,cm,cd);
        dpd.show();
    }

    //getting current gate
    String currentDate(){

        StringBuilder sb = new StringBuilder();
        sb.append(dp.getDayOfMonth()+"/");        //date picker variable
        sb.append(dp.getMonth() + 1 + "/");
        sb.append(dp.getYear());

        return sb.toString();

    }
    //end of section
}
