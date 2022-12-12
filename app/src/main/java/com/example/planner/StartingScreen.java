package com.example.planner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartingScreen extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);
    }

    public void onClickCalender (View v)
    {
        startActivity(new Intent(StartingScreen.this, Calender.class));
    }

    public void onClickList (View v)
    {
        startActivity(new Intent(StartingScreen.this, List.class));
    }
}