package com.example.madlab;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;

public class DateTime extends AppCompatActivity {
private DatePicker datePickerCalendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);
        datePickerCalendar = findViewById(R.id.date_picker);
        TimePicker timePickerClock = findViewById(R.id.time_picker);
        Calendar calendar = Calendar.getInstance();
        datePickerCalendar.init(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        monthOfYear += 1;
                        String date = dayOfMonth + "/" + monthOfYear + "/" + year;
                        Toast.makeText(getApplicationContext(), date, Toast.LENGTH_SHORT).show();
                    }
                });

        timePickerClock.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {

                Snackbar.make(findViewById(R.id.main), hourOfDay + ":" + minute, Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}