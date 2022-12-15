package com.example.planner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class Calender extends AppCompatActivity
{
    TextView etDate;//Scrolly thingy
    Button sendText;//Next screen button thing
    DatePickerDialog.OnDateSetListener setListener;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        Date currentTime = Calendar.getInstance().getTime();//Get current date and time for calender

        etDate = findViewById(R.id.datePicker);
        sendText = findViewById(R.id.addDateButton);

        sendText.setOnClickListener(view ->
        {
            String str = etDate.getText().toString();//Get the date, convert to string
            Intent intent = new Intent(getApplicationContext(), List.class);
            intent.putExtra("message_key", str);
            startActivity(intent);
        });

        Calendar c = Calendar.getInstance();
        final int year = c.get(Calendar.YEAR);
        final int month = c.get(Calendar.MONTH);
        final int day = c.get(Calendar.DAY_OF_MONTH);

        etDate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        Calender.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth
                        ,setListener, year, month, day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        setListener = new DatePickerDialog.OnDateSetListener()
        {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth)
            {
                month = month + 1;
                String date = month + "/" + dayOfMonth +"/" + year;
                etDate.setText(date);
            }
        };
    }
}