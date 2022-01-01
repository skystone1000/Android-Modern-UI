package com.example.moderndash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dash1(View view){
        Intent intent = new Intent(this, DashActivity1.class);
        startActivity(intent);
    }

    public void dash2(View view){
        Intent intent = new Intent(this, DashActivity2.class);
        startActivity(intent);
    }

    public void dash3(View view){
        Intent intent = new Intent(this, DashActivity3.class);
        startActivity(intent);
    }
}