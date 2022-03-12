package com.example.day4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameText = findViewById(R.id.name);
        TextView ageText = findViewById(R.id.age);
        Bundle baggage = getIntent().getExtras();
        String name = baggage.getString("name");
        String age  = baggage.getString("age");

        nameText.setText(name);
        ageText.setText(age);

    }
}