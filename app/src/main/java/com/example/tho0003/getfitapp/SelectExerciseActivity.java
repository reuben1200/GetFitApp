package com.example.tho0003.getfitapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SelectExerciseActivity extends AppCompatActivity {

    private Button exercise1;
    private Button exercise2;
    private Button exercise3;
    private Button exercise4;
    private Button exercise5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_exercise);

        exercise1 = (Button) findViewById(R.id.exercise1);
        exercise2 = (Button) findViewById(R.id.exercise2);
        exercise3 = (Button) findViewById(R.id.exercise3);
        exercise4 = (Button) findViewById(R.id.exercise4);
        exercise5 = (Button) findViewById(R.id.exercise5);

        exercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectExerciseActivity.this, DisplayExerciseDetailActivity.class);
                startActivity(intent);
            }
        });

        exercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectExerciseActivity.this, DisplayExerciseDetailActivity.class);
                startActivity(intent);
            }
        });

        exercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectExerciseActivity.this, DisplayExerciseDetailActivity.class);
                startActivity(intent);
            }
        });

        exercise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectExerciseActivity.this, DisplayExerciseDetailActivity.class);
                startActivity(intent);
            }
        });

        exercise5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectExerciseActivity.this, DisplayExerciseDetailActivity.class);
                startActivity(intent);
            }
        });

    }
}
