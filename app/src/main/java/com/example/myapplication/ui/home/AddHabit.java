package com.example.myapplication.ui.home;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import android.app.Fragment;

import com.example.myapplication.ui.home.HomeFragment;


import com.example.myapplication.R;

public class AddHabit extends Activity {

    private ImageButton save;

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
        Intent intent = new Intent(this, HomeFragment.class);
        startActivity(intent);
        FragmentManager fm = getFragmentManager();
        HomeFragment myFragment = new HomeFragment();
        fm.beginTransaction().add(R.id.save, myFragment).commit();
    }
}
