package com.example.liftlogr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Lifting extends AppCompatActivity {
    ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifting);
        backButton = findViewById(R.id.backButtonLifting);
        backButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new
                                Intent(Lifting.this, MainActivity.class);
                        startActivity(i);
                    }
                }
        );
    }
}