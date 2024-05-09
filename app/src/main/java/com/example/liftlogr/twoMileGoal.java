package com.example.liftlogr;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class twoMileGoal extends AppCompatActivity {

    private TextView timerTextView;
    private Button startButton;
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_mile_goal);

        timerTextView = findViewById(R.id.timerTextView);
        startButton = findViewById(R.id.button3);
        backButton = findViewById(R.id.backButton2m);

        backButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new
                                Intent(twoMileGoal.this, Cardio.class);
                        startActivity(i);
                    }
                }

        );

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startTimer();
            }
        });

    }
    public void startTimer(){
        new CountDownTimer(900000, 1000) {

            public void onTick(long millisUntilFinished) {
                int minutes = (int) (millisUntilFinished / 1000) / 60;
                int seconds = (int) (millisUntilFinished/ 1000) % 60;

                String timeLeftFormatted = String.format("%02d:%02d", minutes, seconds);
                timerTextView.setText("Time Remaining: " + timeLeftFormatted);
            }


            public void onFinish() {
                timerTextView.setText("Timer Done!");
            }
        }.start();

    }

}
