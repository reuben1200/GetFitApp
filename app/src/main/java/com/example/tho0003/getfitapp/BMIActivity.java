package com.example.tho0003.getfitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Activity to show BMI
 */
public class BMIActivity extends AppCompatActivity {

    private Button calculateBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        calculateBMI = (Button) findViewById(R.id.checkBMI);

        calculateBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Your body type based on BMI is under weight", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
