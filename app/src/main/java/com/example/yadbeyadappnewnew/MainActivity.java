package com.example.yadbeyadappnewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shoppingbutton = (Button) findViewById(R.id.ShoppingBtn);
        shoppingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShoppingScreen();
            }
        });

        Button maintainenceButton = (Button) findViewById(R.id.MaintainenceBtn);
        maintainenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaintainenceScreen();
            }
        });

        Button medicineButton = (Button) findViewById(R.id.MedicineBtn);
        medicineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMedicineScreen();
            }
        });

        Button technologyButton = (Button) findViewById(R.id.technologyBtn);
        technologyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTechnologyScreen();
            }
        });

        Button otherButton = (Button) findViewById(R.id.otherBtn);
        otherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOtherScreen();
            }
        });
    }

    public void openShoppingScreen(){
        Intent intent = new Intent(MainActivity.this, ShoppingScreen1.class);
        startActivity(intent);
    }

    public void openMaintainenceScreen(){
        Intent intent = new Intent(MainActivity.this, MaintainenceScreen1.class);
        startActivity(intent);
    }
    public void openMedicineScreen(){
        Intent intent = new Intent(MainActivity.this, MedicineScreen1.class);
        startActivity(intent);
    }

    public void openTechnologyScreen(){
        Intent intent = new Intent(MainActivity.this, TechnologuScreen1.class);
        startActivity(intent);
    }

    public void openOtherScreen(){
        Intent intent = new Intent(MainActivity.this, OtherRequestScreen1.class);
        startActivity(intent);
    }

}