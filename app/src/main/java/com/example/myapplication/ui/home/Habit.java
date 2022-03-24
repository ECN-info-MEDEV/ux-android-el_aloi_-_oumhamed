package com.example.myapplication.ui.home;


public class Habit {
    private String name;
    private int nbfoisParJour;
    private Category category;

    public Habit(String name, int nbfoisParJour, Category category) {
        this.name = name;
        this.nbfoisParJour = nbfoisParJour;
        this.category = category;
    }

    public Habit(String name, int nbfoisParJour) {
        this.name = name;
        this.nbfoisParJour = nbfoisParJour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbfoisParJour() {
        return nbfoisParJour;
    }

    public void setNbfoisParJour(int nbfoisParJour) {
        this.nbfoisParJour = nbfoisParJour;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
