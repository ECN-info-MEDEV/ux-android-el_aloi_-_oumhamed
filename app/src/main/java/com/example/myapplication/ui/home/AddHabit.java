package com.example.myapplication.ui.home;

import android.app.Activity;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.myapplication.ui.home.HomeFragment;


import com.example.myapplication.R;

public class AddHabit extends FragmentActivity {

    private ImageButton save;

    private Habit habit;

    private HomeFragment hf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_habit);
        save = (ImageButton) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem();
            }
        });

    }

    private void addItem() {
        EditText name = findViewById(R.id.PersonName);
        EditText number = findViewById(R.id.Numb);
        String habitName = name.getText().toString();
        int num = Integer.parseInt(number.getText().toString());
        habit = new Habit(habitName, num);
        //Intent intent = new Intent(this, HomeFragment.class);
        getIntent().putExtra("Habit", habit);
        FragmentManager fm= getSupportFragmentManager();
        Fragment f1 = new HomeFragment();
        fm.beginTransaction().replace(R.id.habit, f1).commit();
        fm.beginTransaction().setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out).show(hf).commit();
    }
}
