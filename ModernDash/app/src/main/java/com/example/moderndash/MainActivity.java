package com.example.moderndash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    /*
        All - https://www.youtube.com/results?search_query=modern+ui+in+android+studio
        Tutorials
        1) Dash 1 - https://www.youtube.com/watch?v=LOcD1evBcSA
        2) Dash 2 - https://www.youtube.com/watch?v=Ca7Te545ELU
        3) Dash 3 - https://www.youtube.com/watch?v=ejbX9MO2ems
        4) Dash 4 -

     */


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