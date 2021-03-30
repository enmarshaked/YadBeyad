package com.example.yadbeyadappnewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Shoppingbutton;
    private Button maintainenceButton;
    private Button medicineButton;
    private Button technologyButton;
    private Button otherButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Shoppingbutton = (Button) findViewById(R.id.ShoppingBtn);
        Shoppingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShoppingScreen();
            }
        });

        maintainenceButton = (Button) findViewById(R.id.MaintainenceBtn);
        maintainenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaintainenceScreen();
            }
        });

        medicineButton = (Button) findViewById(R.id.MedicineBtn);
        medicineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMedicineScreen();
            }
        });

        technologyButton = (Button) findViewById(R.id.technologyBtn);
        technologyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTechnologyScreen();
            }
        });

        otherButton = (Button) findViewById(R.id.otherBtn);
        otherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOtherScreen();
            }
        });
    }

    public void openShoppingScreen(){
        Intent intent = new Intent(this, ShoppingScreen1.class);
        startActivity(intent);
    }

    public void openMaintainenceScreen(){
        Intent intent = new Intent(this, MaintainenceScreen1.class);
        startActivity(intent);
    }
    public void openMedicineScreen(){
        Intent intent = new Intent(this, MedicineScreen1.class);
        startActivity(intent);
    }

    public void openTechnologyScreen(){
        Intent intent = new Intent(this, TechnologuScreen1.class);
        startActivity(intent);
    }

    public void openOtherScreen(){
        Intent intent = new Intent(this, OtherRequestScreen1.class);
        startActivity(intent);
    }

}


