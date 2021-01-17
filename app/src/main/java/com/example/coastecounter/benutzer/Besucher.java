package com.example.coastecounter.benutzer;

import com.example.coastecounter.achterbahn.Achterbahn;
import com.example.coastecounter.badge.Badge;
import com.example.coastecounter.main.Theme;
import com.example.coastecounter.park.Park;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Besucher extends Benutzer {
    private Badge badge;

    private Collection<Badge> badges;

    public int getTotalCount() {
        return 0;
    }

    public int getCoasterCount(Achterbahn achterbahn) {
        return 0;
    }

    public double getTotalDrivenDistance() {
        return 0;
    }

    public int getTotalParkCount() {
        return 0;
    }

    public int getTotalDrivenElements() {
        return 0;
    }

    public double getTotalTimeDriven() {
        return 0;
    }

    public int getTotalDrivenInversions() {
        return 0;
    }

    public int getTotalDrivenTypes() {
        return 0;
    }

    public Achterbahn getFastestDrivenCoaster() {
        return null;
    }

    public Achterbahn getHighestDrivenCoaster() {
        return null;
    }

    public Achterbahn getLongestDrivenCoaster() {
        return null;
    }

    public Achterbahn getMostDrivenCoaster() {
        return null;
    }

    public int getTotalStatisticsCalled() {
        return 0;
    }

    /**
     *
     */
    public boolean addRide(Achterbahn coaster) {
        return false;
    }

    public List<Badge> getBadges() {
        return null;
    }

    public boolean addBadge(Badge badge) {
        return false;
    }

    public boolean editCoaster(Achterbahn coaster, String name, long lenght, double height, Park park,
                               String description, String image) {
        return false;
    }

    public boolean editPark(Park park, String name, String email, String adress, String telephone,
                            String image, Parkbetreiber owner, Theme theme, String website,
                            Date openingHours, Date closingHours, String description) {
        return false;
    }

    /**
     *
     */
    public boolean deleteUserAccount(Benutzer user) {
        return false;
    }

    public boolean rateCoaster(Achterbahn coaster, int stars) {
        return false;
    }

    public boolean ratePark(Park park, int stars) {
        return false;
    }

    public boolean instantFeedback(String feedback) {
        return false;
    }

}
