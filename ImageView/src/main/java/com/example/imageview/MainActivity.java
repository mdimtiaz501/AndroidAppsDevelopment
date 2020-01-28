package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView image1, image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = (ImageView) findViewById(R.id.sakib1);
        image2 = (ImageView) findViewById(R.id.sakib2);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.sakib1){
            Toast.makeText(MainActivity.this, "Sakib1 is clicked",Toast.LENGTH_SHORT).show();
        }else if(v.getId() == R.id.sakib2)
            Toast.makeText(MainActivity.this, "Sakib2 is clicked",Toast.LENGTH_LONG).show();
    }
}
