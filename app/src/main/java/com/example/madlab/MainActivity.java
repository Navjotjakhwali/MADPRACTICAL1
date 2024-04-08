package com.example.madlab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.button1) {
            startActivity(new Intent(MainActivity.this, RadioActivity.class));
        } else if (id == R.id.button2) {
            startActivity(new Intent(MainActivity.this, CheckBoxActivity.class));
        } else if (id == R.id.button3) {
            startActivity(new Intent(MainActivity.this, ScreenOrientation1.class));
        } else if (id == R.id.button4) {
            startActivity(new Intent(MainActivity.this, DateTime.class));
        } else if (id == R.id.button5) {
            startActivity(new Intent(MainActivity.this, ProgressBarActivity.class));
        } else if (id == R.id.button6) {
            startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
        } else if (id == R.id.button7) {
            startActivity(new Intent(MainActivity.this, RatingBarActivity.class));
        }
    }
}