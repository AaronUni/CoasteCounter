package com.example.coastecounter.benutzer;

import com.example.coastecounter.park.Park;
import com.example.coastecounter.badge.Badgekategorie;

import java.util.List;

public class Parkbetreiber extends Benutzer {

	private Park park;

	private Parkbetreiber parkbetreiber;


	public boolean createBadge(String title, String description, String condition, List<Badgekategorie> categories, String image) {
		return false;
	}

	public boolean deleteUserAccount(Benutzer user) {
		return false;
	}

	public boolean receiveNotifications(Park park, String message) {
		return false;
	}

}
