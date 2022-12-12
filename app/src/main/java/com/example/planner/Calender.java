package com.example.planner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Calendar;
import java.util.Date;

public class Calender extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        Date currentTime = Calendar.getInstance().getTime();//Get current date and time for calender
    }

    public void onClickListFromCalender (View v)
    {
        startActivity(new Intent(Calender.this, List.class));
    }
}