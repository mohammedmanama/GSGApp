package com.example.gsg;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = getIntent();
            String input1 = intent.getStringExtra("input");
            TextView showTv = findViewById(R.id.show);
            showTv.setText(input1);
        }
    }
