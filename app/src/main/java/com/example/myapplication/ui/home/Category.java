package com.example.myapplication.ui.home;

import android.graphics.Color;

public class Category {
    private String name;
    private int color;

    public Category(String name, int color) {
        this.name = name;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

}
