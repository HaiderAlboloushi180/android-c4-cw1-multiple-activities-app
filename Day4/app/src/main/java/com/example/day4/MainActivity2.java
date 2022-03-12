package com.example.day4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import  android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameText = findViewById(R.id.name);
        TextView ageText = findViewById(R.id.age);
        Button google = findViewById(R.id.button);
        Bundle baggage = getIntent().getExtras();
        String name = baggage.getString("name");
        String age  = baggage.getString("age");

        nameText.setText(name);
        ageText.setText(age);

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gowagole = new Intent(Intent.ACTION_VIEW);
                String url = "https://www.google.com/search?q=tea&client=opera-gx&hs=Gy1&sxsrf=APq-WBstjZhwCRkGKTg4PvmU5Embkg8chw:1647077475133&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjQk8reocD2AhWFSvEDHQQvA2AQ_AUoAXoECAEQAw";
                gowagole.setData(Uri.parse(url));
                startActivity(gowagole);
            }
        });

    }
}