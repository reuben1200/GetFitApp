package com.example.tho0003.getfitapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MuscleTypeActivity extends AppCompatActivity {

    private Button arms;
    private Button chest;
    private Button legs;
    private Button abs;
    private Button shoulders;
    private Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_type);

        arms = (Button) findViewById(R.id.selectArms);
        chest = (Button) findViewById(R.id.selectChest);
        legs = (Button) findViewById(R.id.selectLegs);
        abs = (Button) findViewById(R.id.selectAbs);
        shoulders = (Button) findViewById(R.id.selectShoulders);
        back = (Button) findViewById(R.id.selectBack);

        arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuscleTypeActivity.this, SelectExerciseActivity.class);
                startActivity(intent);
            }
        });

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuscleTypeActivity.this, SelectExerciseActivity.class);
                startActivity(intent);
            }
        });

        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuscleTypeActivity.this, SelectExerciseActivity.class);
                startActivity(intent);
            }
        });

        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuscleTypeActivity.this, SelectExerciseActivity.class);
                startActivity(intent);
            }
        });

        shoulders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuscleTypeActivity.this, SelectExerciseActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuscleTypeActivity.this, SelectExerciseActivity.class);
                startActivity(intent);
            }
        });
    }
}
