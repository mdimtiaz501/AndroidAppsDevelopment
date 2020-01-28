package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox check1, check2, check3;
    private Button btn;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check1 = (CheckBox) findViewById(R.id.box1);
        check2 = (CheckBox) findViewById(R.id.box2);
        check3 = (CheckBox) findViewById(R.id.box3);
        btn = (Button) findViewById(R.id.click);
        txt = (TextView) findViewById(R.id.show);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        StringBuilder str = new StringBuilder();
        if(check1.isChecked()){
            String val = check1.getText().toString();
            str.append( val + " from Bangladesh.\n");
        }if(check2.isChecked()){
            String val = check2.getText().toString();
            str.append( val + " from South Africa.\n");
        }if(check3.isChecked()){
            String val = check3.getText().toString();
            str.append( val + " from Pakistan.");
        }
        txt.setText(str);
    }
}
