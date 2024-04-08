package com.example.madlab;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class ProgressBarActivity extends AppCompatActivity {
        private ProgressBar mProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        mProgressBar = findViewById(R.id.progressBar);


        CountDownTimer count = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {
                
            }

            @Override
            public void onFinish() {
                mProgressBar.setVisibility(View.GONE);
                Snackbar.make(findViewById(R.id.main), "Progress Finished", Snackbar.LENGTH_SHORT).show();
            }
        };
        count.start();
    }
}