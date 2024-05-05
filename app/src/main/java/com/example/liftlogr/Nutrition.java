package com.example.liftlogr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Nutrition extends AppCompatActivity {

    private ImageButton backButton;
    private EditText editTextFoodName, editTextCalories;
    private Button buttonAddFood;
    private TextView textViewTotalCalories;
    private ArrayList<String> food = new ArrayList<>();
    private LinearLayout checkListLayout;


    private int totalCalories = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        editTextFoodName = findViewById(R.id.editTextFoodName);
        editTextCalories = findViewById(R.id.editTextCalories);
        buttonAddFood = findViewById(R.id.buttonAddFood);
        textViewTotalCalories = findViewById(R.id.textViewTotalCalories);

        backButton = findViewById(R.id.backButtonNutrition);
        backButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new
                                Intent(Nutrition.this, MainActivity.class);
                        startActivity(i);
                    }
                }
        );
        buttonAddFood.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFood();
                //addFoodList();
            }
        });
    }
    private void addFood() {
        String foodName = editTextFoodName.getText().toString();
        String caloriesStr = editTextCalories.getText().toString();

        if (!foodName.isEmpty() && !caloriesStr.isEmpty()) {
            int calories = Integer.parseInt(caloriesStr);
            totalCalories += calories;

            textViewTotalCalories.setText("Total Calories: " + totalCalories);

            editTextFoodName.setText("");
            editTextCalories.setText("");
        }
    }
    /*private void addFoodList() {
        String foodName = editTextFoodName.getText().toString();
        String calories = editTextCalories.getText().toString();

        String foodDetails = foodName + " - Calories: " + calories;
        food.add(foodDetails);

        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(foodDetails);
        checkListLayout.addView(checkBox);

        editTextFoodName.setText("");
        editTextCalories.setText("");
    }*/
}