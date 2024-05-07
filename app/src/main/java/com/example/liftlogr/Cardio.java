package com.example.liftlogr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.TextView;

public class Cardio extends AppCompatActivity {

        private ImageButton backButton;
        private TextView stepCountTextView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);

        stepCountTextView = findViewById(R.id.stepCountTextView);
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
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_STEP_COUNTER) {
            int stepCount = (int) event.values[0];
            stepCountTextView.setText("Steps: " + stepCount);
        }
    }
}

