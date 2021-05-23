package com.example.newsharedprefrences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.newsharedprefrences.MainActivity.MessageId;

public class Activity2 extends AppCompatActivity {
TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        textView2 = findViewById(R.id.textView2);
        SharedPreferences sharedPreferences = getSharedPreferences(MessageId,MODE_PRIVATE);
        String data = sharedPreferences.getString("message","nothing to say");
        textView2.setText(data);
    }
}