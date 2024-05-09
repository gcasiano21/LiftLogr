package com.example.liftlogr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.util.ArrayList;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class Lifting extends AppCompatActivity {
    private EditText editTextLiftName, editTextSets, editTextReps;
    private Button buttonAddLift;
    private LinearLayout checkListLayout;
    private ArrayList<String> lifts = new ArrayList<>();
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifting);

        backButton = findViewById(R.id.backButtonLifting);
        editTextLiftName = findViewById(R.id.editTextLiftName);
        editTextSets = findViewById(R.id.editTextSets);
        editTextReps = findViewById(R.id.editTextReps);
        buttonAddLift = findViewById(R.id.buttonAddLift);
        checkListLayout = findViewById(R.id.checkListLayout);

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
        buttonAddLift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addLift();
            }
        });
    }

    private void addLift() {
        String liftName = editTextLiftName.getText().toString();
        String sets = editTextSets.getText().toString();
        String reps = editTextReps.getText().toString();

        String liftDetails = liftName + " - Sets: " + sets + ", Reps: " + reps;
        lifts.add(liftDetails);

        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(liftDetails);
        checkBox.setTextColor(getResources().getColor(R.color.white));
        checkListLayout.addView(checkBox);

        editTextLiftName.setText("");
        editTextSets.setText("");
        editTextReps.setText("");
    }
}


