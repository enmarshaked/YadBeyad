package com.example.yadbeyadappnewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OtherRequestScreen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_request_screen1);

        Button recordBtn = (Button) findViewById(R.id.recBtn);
        recordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecordScreen();
            }
        });

        Button typeBtn = (Button) findViewById(R.id.typeBtn);
        typeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTypeScreen();
            }
        });

        Button cancelBtn = (Button) findViewById(R.id.cancelBtn);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToHomeScreen();
            }
        });

    }

    public void openRecordScreen(){
        Intent intent = new Intent(getBaseContext(), recordRequest.class);
        startActivity(intent);
    }

    public void openTypeScreen(){
        Intent intent = new Intent(getBaseContext(), typeRequest.class);
        startActivity(intent);
    }

    public void backToHomeScreen(){
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }
}
