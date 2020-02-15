package com.example.timepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private Button btn;
    private TimePickerDialog tpd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*                TimePicker tp = new TimePicker(timepickerdialog.this,MainActivity.class);
                int cHour = tp.getCurrentHour();
                int cMinute = tp.getCurrentMinute();*/

                Calendar cal = Calendar.getInstance();
                int cHour = cal.get(Calendar.HOUR_OF_DAY);
                int cMinute = cal.get(Calendar.MINUTE);

                tpd = new TimePickerDialog(MainActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                text.setText(hourOfDay + ":" + minute);
                            }
                        },cHour,cMinute,true);

                tpd.show();
            }
        });
    }
}
