package com.example.coastecounter.badge;

import com.example.coastecounter.benutzer.Benutzer;
import com.example.coastecounter.benutzer.Besucher;

import java.util.Collection;
import java.util.List;

public class Badge {

	private int badgeID;

	private String title;

	private String description;

	private String condition;

	private String image;

	private boolean locked;

	private Collection<Badgekategorie> categories;

	private Benutzer benutzer;

	private Besucher besucher;

	private BadgeController badgeController;

	public int getBadgeID() {
		return 0;
	}

	public String getTitle() {
		return null;
	}

	/**
	 *  
	 */
	public void setTitle(String title) {

	}

	public String getDescription() {
		return null;
	}

	/**
	 *  
	 */
	public void setDescription(String description) {

	}

	public String getCondition() {
		return null;
	}

	/**
	 *  
	 */
	public void setCondition(String condition) {

	}

	public String getImage() {
		return null;
	}

	/**
	 *  
	 */
	public void setImage(String image) {

	}

	public boolean getLocked() {
		return false;
	}

	public void setLocked(boolean locked) {

	}

	public List<Badgekategorie> getCategories() {
		return null;
	}

	public boolean addCategory(Badgekategorie category) {
		return false;
	}

	public boolean deleteCategory(Badgekategorie category) {
		return false;
	}

}
