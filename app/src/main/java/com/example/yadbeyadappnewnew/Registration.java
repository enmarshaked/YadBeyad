package com.example.yadbeyadappnewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        Button finished = (Button) findViewById(R.id.finished);
        finished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText) findViewById(R.id.name);
                EditText phone = (EditText) findViewById(R.id.phoneNumber);
                EditText address = (EditText) findViewById(R.id.address);
                EditText city = (EditText) findViewById(R.id.city);
            }
        });

    }
}