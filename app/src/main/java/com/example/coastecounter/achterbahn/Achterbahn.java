package com.example.coastecounter.achterbahn;

import com.example.coastecounter.bewertung.Achterbahnbewertung;
import com.example.coastecounter.main.Theme;
import com.example.coastecounter.main.Type;
import com.example.coastecounter.park.Park;

import java.util.Date;
import java.util.List;

public class Achterbahn {

    private int coasterID;

    private String name;

    private double length;

    private double height;

    private double descent;

    private int inversions;

    private String elements;

    private int capacity;

    private int cars;

    private int trains;

    private String manufacturer;

    private String constructed;

    private String description;

    private int speed;

    //private String image;

    private Park park;


    private Achterbahnbewertung achterbahnbewertung;

    private String theme;

    //Type Reference ?
    private String type;

    //Controller gehört nach MVC Prinzip nicht ins Model rein
    //private AchterbahnController achterbahnController;

    public int getCoasterID() {
        return this.coasterID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDescent() {
        return this.descent;
    }

    public void setDescent(double descent) {
        this.descent = descent;
    }

    public int getInversions() {
        return this.inversions;
    }

    public void setInversions(int inversions) {
        this.inversions = inversions;
    }

    public String getElements() {
        return this.elements;
    }

    public void setElements(String elements) {
        this.elements = elements;
    }

    public String getTheme() {
        return this.theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCars() {
        return this.cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public int getTrains() {
        return this.trains;
    }

    public void setTrains(int trains) {
        this.trains = trains;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     */
    public String getConstructed() {
        return this.constructed;
    }

    /**
     *
     */
    public void setConstructed(String constructed) {
        this.constructed = constructed;
    }

    public String getDescription() {
        return this.description;
    }

    /**
     *
     */
    public void setDescription(String description) {
        this.description = description;
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
/**
 * XML
    public String getImage() {
        return null;
    }


    public void setImage(String image) {

    }
*/
    public Achterbahn(int coasterID, String name, double length, double height, double descent, int inversions,
                      String elements, int capacity, int cars, int trains, String manufacturer, String constructed,
                      String description, Park park, Achterbahnbewertung achterbahnbewertung, String theme, String type, int speed) {
        this.coasterID = coasterID;
        this.name = name;
        this.length = length;
        this.height = height;
        this.descent = descent;
        this.inversions = inversions;
        this.elements = elements;
        this.capacity = capacity;
        this.cars = cars;
        this.trains = trains;
        this.manufacturer = manufacturer;
        this.constructed = constructed;
        this.description = description;
        this.park = park;
        this.achterbahnbewertung = achterbahnbewertung;
        this.theme = theme;
        this.type = type;
        this.speed = speed;
    }
}
