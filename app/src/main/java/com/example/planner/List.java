package com.example.planner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class List extends AppCompatActivity
{
    TextView receiverMsg;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        receiverMsg = findViewById(R.id.receivedText);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        receiverMsg.setText(str);
    }
}