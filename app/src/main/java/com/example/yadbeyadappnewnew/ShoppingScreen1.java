package com.example.yadbeyadappnewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShoppingScreen1 extends AppCompatActivity {
    private Button recordButton;
    private Button typeMessageButton;
    private Button cancelButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_screen1);

        recordButton = (Button) findViewById(R.id.recordButton);
        recordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecordingScreen();
            }
        });

        typeMessageButton = (Button) findViewById(R.id.typeBtn);
        typeMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTypingScreen();
            }
        });

        cancelButton = (Button) findViewById(R.id.cancelBtn);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCancelScreen();
            }
        });

    }
    public void openRecordingScreen() {
        Intent intent = new Intent(this, recordRequest.class);
        startActivity(intent);
    }

    public void openTypingScreen() {
        Intent intent = new Intent(this, typeRequest.class);
        startActivity(intent);
    }

    public void openCancelScreen() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}