package com.example.liftlogr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button cardio;
    Button lifting;
    Button nutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardio = findViewById(R.id.cardioButton);
        lifting = findViewById(R.id.liftingButton);
        nutrition = findViewById(R.id.nutritionButton);

        cardio.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new
                                Intent(MainActivity.this, Cardio.class);
                        startActivity(i);
                    }
                }
        );
        lifting.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new
                                Intent(MainActivity.this, Lifting.class);
                        startActivity(i);
                    }
                }
        );
        nutrition.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new
                                Intent(MainActivity.this, Nutrition.class);
                        startActivity(i);
                    }
                }
        );
    }
}