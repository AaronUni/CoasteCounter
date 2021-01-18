package com.example.coastecounter.park;

import com.example.coastecounter.achterbahn.Achterbahn;

import java.util.List;

public class Park {

    private int parkID;

    private String name;

    private String email;

    private String address;

    private String telephone;

    private String fax;

    private int image;

    private int maxGuests;

    private int surfaceArea;

    private String description;

    private String website;

    private List<Achterbahn> achterbahnen;

    private int parkbewertung;


    private String theme;

    private String owner;

    public Park(int parkID, String name, String email, String address, String telephone, String fax, int image, int maxGuests,
                int surfaceArea, String description, String website, List<Achterbahn> achterbahnen,
                int parkbewertung, String theme,
                String owner) {
        this.parkID = parkID;
        this.name = name;
        this.email = email;
        this.address = address;
        this.telephone = telephone;
        this.fax = fax;
        this.image = image;
        this.maxGuests = maxGuests;
        this.surfaceArea = surfaceArea;
        this.description = description;
        this.website = website;
        this.achterbahnen = achterbahnen;
        //this.coasters = coasters;
        this.parkbewertung = parkbewertung;
        this.theme = theme;
        this.owner = owner;
    }

    public int getParkID() {
        return parkID;
    }

    public void setParkID(int parkID) {
        this.parkID = parkID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(int surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Achterbahn> getAchterbahnen() {
        return this.achterbahnen;
    }

    public void setAchterbahn(List<Achterbahn> achterbahnen) {
        this.achterbahnen = achterbahnen;
    }

    public void addAchterbahn(Achterbahn bahn) {
        this.achterbahnen.add(bahn);
    }

    public int getParkbewertung() {
        return parkbewertung;
    }

    public void setParkbewertung(int parkbewertung) {
        this.parkbewertung = parkbewertung;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
