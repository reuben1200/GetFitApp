package com.example.tho0003.getfitapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AppMainActivity extends AppCompatActivity {

    private Button muscleWorkout;
    private Button selectBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_main);


        muscleWorkout = (Button) findViewById(R.id.selectMuscleWorkouts);
        selectBMI = (Button) findViewById(R.id.selectBMI);

        muscleWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppMainActivity.this, MuscleTypeActivity.class);
                startActivity(intent);
            }
        });

        selectBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppMainActivity.this, BMIActivity.class);
                startActivity(intent);
            }
        });
    }
}
