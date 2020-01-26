package com.example.additionsubtraction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText textEdit1, textEdit2;
    private Button addition, subtraction;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textEdit1 = (EditText) findViewById(R.id.text1);
        textEdit2 = (EditText) findViewById(R.id.text2);

        addition = (Button) findViewById(R.id.button1);
        subtraction = (Button) findViewById(R.id.button2);

        addition.setOnClickListener(this);
        subtraction.setOnClickListener(this);

        result = (TextView) findViewById(R.id.folafol);

    }

    @Override
    public void onClick(View v) {
        try {
            String value1 = textEdit1.getText().toString();
            String value2 = textEdit2.getText().toString();

            double val1 = Double.parseDouble(value1);
            double val2 = Double.parseDouble(value2);

            if(v.getId() == R.id.button1){
                double sum = val1+val2;
                result.setText("Sum = "+sum);
            }else{
                double sub = val1-val2;
                result.setText("Sub = "+sub);
            }
        }catch (Exception e){
            Toast.makeText(MainActivity.this, "Sorry!",Toast.LENGTH_SHORT).show();
        }

    }
}
