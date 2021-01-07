package com.example.coastecounter.benutzer;

import com.example.coastecounter.achterbahn.Achterbahn;
import com.example.coastecounter.badge.Badge;
import com.example.coastecounter.badge.Badgekategorie;
import com.example.coastecounter.main.Theme;
import com.example.coastecounter.park.Park;

import java.util.Date;
import java.util.List;

public class Admin extends Benutzer {

	public boolean createCategory(String title, String description) {
		return false;
	}

	public boolean unlockBadge(Badge badge) {
		return false;
	}

	public boolean createPark(String name, String email, String address, String telephone) {
		return false;
	}

	public boolean editPark(Park park, String name, String email, String adress, String telephone, String image, Parkbetreiber owner, Theme theme, String website, Date openingHours, Date closingHours, String description) {
		return false;
	}

	public boolean createCoaster(Park park, String name) {
		return false;
	}

	/**
	 *  
	 */
	public boolean editCoaster(Achterbahn coaster, String name, long lenght, double height, Park park, String description, String image) {
		return false;
	}

	public boolean createBadgeCategory(String title, String description) {
		return false;
	}

	/**
	 *  
	 */
	public boolean createBadge(String title, String description, String condition, List<Badgekategorie> categories, String image) {
		return false;
	}

}
