package com.example.gsg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText inputTv = findViewById(R.id.input);
        Button clickBtn = findViewById(R.id.click);
        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputTv.getText().toString();
                if (input != null && input.trim().equals("")) {
                    Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                    intent.putExtra("input", input);
                    startActivity(intent);
                }
            }

        });

    }

}
