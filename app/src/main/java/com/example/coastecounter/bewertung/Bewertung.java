package com.example.coastecounter.bewertung;

import com.example.coastecounter.benutzer.Benutzer;

public interface Bewertung {

    int stars = 0;

    Benutzer benutzer = null;

    abstract double getAvg();


    abstract void setStars(int stars);

    abstract void getStars();

}
