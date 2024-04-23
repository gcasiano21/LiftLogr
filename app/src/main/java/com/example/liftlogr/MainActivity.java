package com.example.liftlogr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton cardio ;
    ImageButton nutrition;

    ImageButton lifting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //cardio = findViewById(R.id.cardioButton);
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
        //lifting = findViewById(R.id.liftingButton);
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

        //nutrition = findViewById(R.id.nutritionButton);
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