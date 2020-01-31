package com.example.radio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radio;
    private Button btn;
    private TextView textv;
    private RadioButton rdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio = findViewById(R.id.rdg);
        btn = findViewById(R.id.butt);
        textv = findViewById(R.id.text);

        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int selectedID = radio.getCheckedRadioButtonId();   //selected radio button er id catch korbe
                rdb = findViewById(selectedID);
                String val = rdb.getText().toString();
                textv.setText("You have selected "+val);
            }
        });


    }
}
