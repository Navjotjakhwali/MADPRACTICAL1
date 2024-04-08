package com.example.madlab;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        RadioGroup radioGroup=findViewById(R.id.radio_group);
        RadioButton radioButtonBlue = findViewById(R.id.radioButton);
        RadioButton radioButtonGreen = findViewById(R.id.radioButton2);
        RadioButton radioButtonRed = findViewById(R.id.radioButton3);

        ConstraintLayout constraintLayout = findViewById(R.id.main);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton) {
                    constraintLayout.setBackgroundColor(Color.parseColor("#FF87CFFB"));
                } else if (checkedId == R.id.radioButton2) {
                    constraintLayout.setBackgroundColor(Color.parseColor("#FF6EFEAA"));
                } else if (checkedId == R.id.radioButton3) {
                    constraintLayout.setBackgroundColor(Color.parseColor("#FEACBC"));
                }
            }
        });
    }
}