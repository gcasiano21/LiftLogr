package com.example.liftlogr;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class twoMile extends AppCompatActivity {

    private TextView timerTextView;
    private Button startButton;
    private Button pauseButton;
    private ImageButton backButton;
    /*private CountDownTimer countDownTimer;
    private final long startTimeInMillis = 60000;
    private long timeLeftInMillis = startTimeInMillis;
    private boolean timerRunning = false;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio2m);

        /*timerTextView = findViewById(R.id.timerTextView);
        startButton = findViewById(R.id.button3);
        pauseButton = findViewById(R.id.button);*/
        backButton = findViewById(R.id.backButtonCardio);

        backButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new
                                Intent(twoMile.this, Cardio.class);
                        startActivity(i);
                    }
                }

        );
/*
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startTimer();
            }
        });
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    pauseTimer();
            }
        });*/
    }

    /*private void startTimer() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateTimer();
            }

            @Override
            public void onFinish() {
                timerRunning = false;
                startButton.setText("Start Timer");
            }
        }.start();

        timerRunning = true;
        startButton.setText("Pause Timer");
    }

    private void pauseTimer() {
        countDownTimer.cancel();
        timerRunning = false;
        startButton.setText("Start Timer");
    }

    private void updateTimer() {
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format("%02d:%02d", minutes, seconds);
        timerTextView.setText(timeLeftFormatted);
    }*/
}
