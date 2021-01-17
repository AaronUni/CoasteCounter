package com.example.coastecounter.achterbahn;

import com.example.coastecounter.bewertung.Achterbahnbewertung;

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

    private int image;

    private String park;


    private int achterbahnbewertung;

    private String theme;

    //Type Reference ?
    private String type;

    //Controller gehört nach MVC Prinzip nicht ins Model rein
    //private AchterbahnController achterbahnController;

    /**
     * XML
     * public String getImage() {
     * return null;
     * }
     * <p>
     * <p>
     * public void setImage(String image) {
     * <p>
     * }
     */
    public Achterbahn(int coasterID, String name, double length, double height, double descent, int inversions,
                      String elements, int capacity, int cars, int trains, String manufacturer, String constructed,
                      String description, String park, int achterbahnbewertung,
                      String theme, String type, int speed, int image) {
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
        this.image = image;
    }

    public int getCoasterID() {
        return coasterID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDescent() {
        return descent;
    }

    public void setDescent(double descent) {
        this.descent = descent;
    }

    public int getInversions() {
        return inversions;
    }

    public void setInversions(int inversions) {
        this.inversions = inversions;
    }

    public String getElements() {
        return elements;
    }

    public void setElements(String elements) {
        this.elements = elements;
    }

    public String getTheme() {
        return theme;
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

    public int getImage() {
        return image;
    }

    public String getPark() {
        return park;
    }

    public int getAchterbahnbewertung() {
        return achterbahnbewertung;
    }
}
