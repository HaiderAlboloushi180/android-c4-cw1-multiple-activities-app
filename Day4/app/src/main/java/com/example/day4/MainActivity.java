package com.example.day4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameText = findViewById(R.id.name);
        EditText ageText = findViewById(R.id.age);
        Button nextPage = findViewById(R.id.next);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextBage = new Intent(MainActivity.this, MainActivity2.class);
                String isim = nameText.getText().toString();
                String umr = ageText.getText().toString();

                nextBage.putExtra("name", isim);
                nextBage.putExtra("age", umr);

                if (isim == null || isim.isEmpty()) {
                    System.out.println("Please Enter the missing data");
                } else if (umr == null || umr.isEmpty()) {
                    System.out.println("Please Enter the missing data");
                } else {
                    startActivity(nextBage);
                }
            }
        });

    }
}