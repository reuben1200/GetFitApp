package com.example.tho0003.getfitapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * MAin activity when app launches - Login screen
 *
 */
public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.loginButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AppMainActivity.class);
                startActivity(intent);
            }
        });



    }
}
