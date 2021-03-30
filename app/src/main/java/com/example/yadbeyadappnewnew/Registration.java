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
                EditText nameEdit = (EditText) findViewById(R.id.name);
                EditText phoneEdit = (EditText) findViewById(R.id.phoneNumber);
                EditText addressEdit = (EditText) findViewById(R.id.address);
                EditText cityEdit = (EditText) findViewById(R.id.city);
                String name = nameEdit.getText().toString();
                String phone = phoneEdit.getText().toString();
                String address = addressEdit.getText().toString();
                String city = cityEdit.getText().toString();
            }
        });
    }
}