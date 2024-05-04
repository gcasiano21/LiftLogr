package com.example.liftlogr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Cardio extends AppCompatActivity {

        ImageButton backButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);
        backButton = findViewById(R.id.backButtonCardio);
        backButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new
                                Intent(Cardio.this, MainActivity.class);
                        startActivity(i);
                    }
                }
        );
    }
}